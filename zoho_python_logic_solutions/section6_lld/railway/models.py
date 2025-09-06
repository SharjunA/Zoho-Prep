
from dataclasses import dataclass

@dataclass
class Passenger:
    name: str

@dataclass
class Booking:
    id: str
    train_no: str
    passenger_name: str
    seat_no: int
