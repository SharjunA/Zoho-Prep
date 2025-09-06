
from uuid import uuid4
from .train import Train
from .models import Booking

class ReservationSystem:
    def __init__(self):
        self.trains: dict[str, Train] = {}
        self.bookings: dict[str, Booking] = {}

    def add_train(self, t: Train):
        self.trains[t.number] = t

    def search(self):
        return list(self.trains.values())

    def book(self, train_no: str, passenger_name: str) -> Booking:
        t = self.trains.get(train_no)
        if not t:
            raise ValueError("Train not found")
        seat = t.book_seat()
        if seat is None:
            raise RuntimeError("No seats")
        bid = str(uuid4())[:8]
        b = Booking(bid, train_no, passenger_name, seat)
        self.bookings[bid] = b
        return b

    def cancel(self, booking_id: str) -> bool:
        b = self.bookings.pop(booking_id, None)
        if not b:
            return False
        t = self.trains.get(b.train_no)
        return bool(t and t.cancel_seat(b.seat_no))
