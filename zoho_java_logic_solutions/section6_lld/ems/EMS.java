
import java.util.*;
public class EMS {
    private final Map<String, Employee> employees = new HashMap<>();
    private final Map<String, Department> departments = new HashMap<>();
    public void addDepartment(Department d){ departments.put(d.id, d); }
    public void addEmployee(Employee e){ employees.put(e.id, e); }
    public List<Employee> byDepartment(String deptId){
        List<Employee> res = new ArrayList<>();
        for (Employee e: employees.values()) if (e.deptId.equals(deptId)) res.add(e);
        return res;
    }
    public double netSalary(String empId){ return Payroll.netSalary(employees.get(empId)); }
}
