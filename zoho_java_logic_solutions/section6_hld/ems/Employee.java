
package ems;
public class Employee {
    public final String id; public String name; public double basePay; public String dept;
    public Employee(String id,String name,double basePay,String dept){ this.id=id;this.name=name;this.basePay=basePay;this.dept=dept;}
    public String toString(){ return id+":"+name+"("+dept+")"; }
}
