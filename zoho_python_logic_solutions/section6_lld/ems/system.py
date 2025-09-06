
from .models import Employee, Department
from .payroll import net_salary

class EMS:
    def __init__(self):
        self.employees: dict[str, Employee] = {}
        self.departments: dict[str, Department] = {}

    def add_department(self, d: Department):
        self.departments[d.id] = d

    def add_employee(self, e: Employee):
        self.employees[e.id] = e

    def by_department(self, dept_id: str):
        return [e for e in self.employees.values() if e.dept_id == dept_id]

    def net_salary(self, emp_id: str) -> float:
        return net_salary(self.employees[emp_id])
