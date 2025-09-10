public class Main {
    public static void main(String[] args) {
        EMS ems = new EMS();

        ems.addDepartment(new Department("ENG","Engineering"));
        ems.addEmployee(new Employee("E1","Sharjun", 60000, "ENG"));
        
        System.out.println("ENG employees: " + ems.byDepartment("ENG"));
        System.out.println("Net salary E1: " + ems.netSalary("E1"));
    }
}
