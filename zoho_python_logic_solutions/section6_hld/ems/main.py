
from .system import EMS
from .models import Employee
def demo():
    ems = EMS()
    ems.add(Employee("E1","Sharjun",60000,"ENG"))
    print(ems.by_dept("ENG"))
    print("Net:", ems.net_salary("E1"))
if __name__ == '__main__': demo()
