
class Train:
    def __init__(self, number: str, name: str, total_seats: int):
        self.number = number
        self.name = name
        self.total_seats = total_seats
        self.booked = [False] * (total_seats + 1)  # 1-indexed

    def available_seats(self) -> int:
        return sum(1 for i in range(1, self.total_seats + 1) if not self.booked[i])

    def book_seat(self) -> int | None:
        for i in range(1, self.total_seats + 1):
            if not self.booked[i]:
                self.booked[i] = True
                return i
        return None

    def cancel_seat(self, seat_no: int) -> bool:
        if 1 <= seat_no <= self.total_seats and self.booked[seat_no]:
            self.booked[seat_no] = False
            return True
        return False

    def __repr__(self):
        return f"{self.number} - {self.name} (avail: {self.available_seats()})"
