
from dataclasses import dataclass

@dataclass
class Department:
    id: str
    name: str

@dataclass
class Employee:
    id: str
    name: str
    base_pay: float
    dept_id: str
