
from .system import Library
from .models import Book
def demo():
    lib = Library()
    lib.add(Book("978-0-12","DSA in Java"))
    lib.add(Book("978-0-34","Clean Code"))
    print("Books:", lib.list())
    print("Checkout:", lib.checkout("978-0-34"))
    print("Return:", lib.checkin("978-0-34"))
if __name__ == '__main__': demo()
