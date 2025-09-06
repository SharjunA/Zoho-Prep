
from .models import Book
class Library:
    def __init__(self):
        self.books = {}
    def add(self,b:Book): self.books[b.isbn]=b
    def list(self): return list(self.books.values())
    def checkout(self,isbn): b=self.books.get(isbn); 
        if not b or b.issued: return False
        b.issued=True; return True
    def checkin(self,isbn): b=self.books.get(isbn);
        if not b or not b.issued: return False
        b.issued=False; return True
