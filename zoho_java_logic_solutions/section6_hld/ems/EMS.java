
package ems;
import java.util.*;
public class EMS {
    private final Map<String, Employee> emps = new HashMap<>();
    public void add(Employee e){ emps.put(e.id,e); }
    public java.util.List<Employee> byDept(String d){ List<Employee> r=new ArrayList<>(); for(Employee e:emps.values()) if(e.dept.equals(d)) r.add(e); return r; }
    public double netSalary(String id){ return Payroll.net(emps.get(id)); }
}
