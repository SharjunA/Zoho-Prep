
package ems;
public class Main {
    public static void main(String[] args) {
        EMS ems = new EMS();
        ems.add(new Employee("E1","Sharjun",60000,"ENG"));
        System.out.println(ems.byDept("ENG"));
        System.out.println("Net E1: "+ems.netSalary("E1"));
    }
}
