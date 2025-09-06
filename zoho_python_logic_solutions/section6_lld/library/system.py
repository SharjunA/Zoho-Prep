
from .models import Book
class Library:
    def __init__(self):
        self.books: dict[str, Book] = {}
        self.loans: dict[str, str] = {}  # isbn -> memberId

    def add_book(self, b: Book):
        self.books[b.isbn] = b

    def list(self):
        return list(self.books.values())

    def checkout(self, isbn: str, member_id: str) -> bool:
        b = self.books.get(isbn)
        if not b or b.issued: return False
        b.issued = True
        self.loans[isbn] = member_id
        return True

    def checkin(self, isbn: str) -> bool:
        b = self.books.get(isbn)
        if not b or not b.issued: return False
        b.issued = False
        self.loans.pop(isbn, None)
        return True
