
from .system import EMS
from .models import Department, Employee

def demo():
    ems = EMS()
    ems.add_department(Department("ENG","Engineering"))
    ems.add_employee(Employee("E1","Sharjun", 60000, "ENG"))
    print("ENG employees:", ems.by_department("ENG"))
    print("Net salary E1:", ems.net_salary("E1"))

if __name__ == "__main__":
    demo()
