
from .system import Library
from .models import Book

def demo():
    lib = Library()
    lib.add_book(Book("978-0-12","DSA in Java"))
    lib.add_book(Book("978-0-34","Clean Code"))
    print("Books:", lib.list())
    print("Checkout:", lib.checkout("978-0-34","M1"))
    print("Books:", lib.list())
    print("Return:", lib.checkin("978-0-34"))

if __name__ == "__main__":
    demo()
