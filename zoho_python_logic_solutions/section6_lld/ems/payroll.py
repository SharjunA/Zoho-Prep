
def net_salary(emp) -> float:
    hra = emp.base_pay * 0.20
    pf = emp.base_pay * 0.12
    return emp.base_pay + hra - pf
