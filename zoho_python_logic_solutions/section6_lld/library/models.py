
from dataclasses import dataclass

@dataclass
class Book:
    isbn: str
    title: str
    issued: bool = False

@dataclass
class Member:
    id: str
    name: str
