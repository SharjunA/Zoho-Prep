
from .models import Employee
from .payroll import net
class EMS:
    def __init__(self): self.emps = {}
    def add(self,e:Employee): self.emps[e.id]=e
    def by_dept(self,d): return [e for e in self.emps.values() if e.dept==d]
    def net_salary(self,id): return net(self.emps[id])
