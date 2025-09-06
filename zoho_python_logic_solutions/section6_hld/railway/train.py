
class Train:
    def __init__(self, number: str, name: str, total_seats: int):
        self.number = number
        self.name = name
        self.total_seats = total_seats
        self.booked = [False]*(total_seats+1)
    def book_seat(self):
        for i in range(1,self.total_seats+1):
            if not self.booked[i]:
                self.booked[i]=True
                return i
        return None
    def cancel_seat(self, s:int):
        if 1<=s<=self.total_seats and self.booked[s]:
            self.booked[s]=False
            return True
        return False
    def available(self):
        return sum(1 for i in range(1,self.total_seats+1) if not self.booked[i])
    def __repr__(self): return f"{self.number} {self.name} (avail={self.available()})"
