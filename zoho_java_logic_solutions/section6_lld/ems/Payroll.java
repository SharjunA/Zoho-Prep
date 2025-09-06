
public class Payroll {
    public static double netSalary(Employee e) {
        double hra = e.basePay * 0.20;
        double pf = e.basePay * 0.12;
        return e.basePay + hra - pf;
    }
}
