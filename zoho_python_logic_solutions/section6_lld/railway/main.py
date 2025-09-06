
from .system import ReservationSystem
from .train import Train

def demo():
    rs = ReservationSystem()
    rs.add_train(Train("12627", "Karnataka Exp", 3))
    rs.add_train(Train("22691", "Rajdhani", 2))
    print("Trains:")
    for t in rs.search():
        print(" -", t)
    b = rs.book("12627", "Sharjun")
    print("Booked:", b)
    print("Cancel:", rs.cancel(b.id))

if __name__ == "__main__":
    demo()
