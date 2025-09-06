
import random

class SnakeLadderGame:
    def __init__(self):
        self.snakes = {17:7, 54:34, 62:19, 98:79}
        self.ladders = {3:22, 5:8, 20:29, 27:56}
        self.positions = {}

    def add_player(self, name: str):
        self.positions[name] = 0

    def apply(self, pos: int) -> int:
        return self.snakes.get(pos, self.ladders.get(pos, pos))

    def move(self, name: str) -> bool:
        roll = random.randint(1, 6)
        pos = self.positions[name] + roll
        if pos <= 100:
            pos = self.apply(pos)
        else:
            pos = self.positions[name]
        self.positions[name] = pos
        print(f"{name} rolled {roll} -> {pos}")
        return pos == 100

def demo():
    g = SnakeLadderGame()
    g.add_player("A"); g.add_player("B")
    over = False
    while not over:
        over = g.move("A") or g.move("B")

if __name__ == "__main__":
    demo()
