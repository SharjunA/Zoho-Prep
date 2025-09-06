
public class Employee {
    public final String id;
    public String name;
    public double basePay;
    public String deptId;
    public Employee(String id, String name, double basePay, String deptId) {
        this.id = id; this.name = name; this.basePay = basePay; this.deptId = deptId;
    }
    @Override public String toString(){ return id + ":" + name + " (" + deptId + ")"; }
}
