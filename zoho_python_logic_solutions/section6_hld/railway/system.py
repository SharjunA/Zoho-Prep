
from uuid import uuid4
from .train import Train
class ReservationSystem:
    def __init__(self):
        self.trains = {}
        self.bookings = {}
    def add_train(self, t: Train): self.trains[t.number]=t
    def search(self): return list(self.trains.values())
    def book(self, train_no: str, passenger: str):
        t = self.trains.get(train_no)
        if not t: raise ValueError('no train')
        seat = t.book_seat()
        if seat is None: raise RuntimeError('full')
        bid = str(uuid4())[:8]
        self.bookings[bid] = (train_no, passenger, seat)
        return bid, train_no, passenger, seat
    def cancel(self, bid:str):
        b = self.bookings.pop(bid, None)
        if not b: return False
        train_no = b[0]
        t = self.trains.get(train_no)
        return bool(t and t.cancel_seat(b[2]))
