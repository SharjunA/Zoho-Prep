
class Elevator:
    def __init__(self, id: int):
        self.id = id
        self.current_floor = 0
        self.moving = False
    def move_to(self, floor: int):
        self.moving = True
        self.current_floor = floor
        self.moving = False
    def __repr__(self):
        return f"Elevator {self.id} @ {self.current_floor}"

class Controller:
    def __init__(self, count: int):
        self.elevators = [Elevator(i+1) for i in range(count)]
    def assign(self, request_floor: int) -> Elevator:
        best = min(self.elevators, key=lambda e: abs(e.current_floor - request_floor))
        best.move_to(request_floor)
        return best
    def __repr__(self):
        return str(self.elevators)

def demo():
    c = Controller(3)
    print(c)
    print("Assigned:", c.assign(5))
    print("Assigned:", c.assign(2))
    print(c)

if __name__ == "__main__":
    demo()
