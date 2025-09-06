
class Elevator:
    def __init__(self, id:int):
        self.id = id; self.current_floor = 0; self.moving = False
    def move_to(self,floor:int): self.moving=True; self.current_floor=floor; self.moving=False
    def __repr__(self): return f"Elevator {self.id} @ {self.current_floor}"
class Controller:
    def __init__(self,n:int): self.elevators=[Elevator(i+1) for i in range(n)]
    def assign(self,floor:int):
        best = min(self.elevators, key=lambda e: abs(e.current_floor-floor))
        best.move_to(floor); return best
def demo():
    c=Controller(3); print(c); print("Assigned:", c.assign(5)); print("Assigned:", c.assign(2)); print(c)
if __name__=='__main__': demo()
