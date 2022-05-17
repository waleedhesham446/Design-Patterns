/**
 * Adapter
 */
public class Adapter {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Ali";
        emp.basicSalary = 2000;
        SalaryCalculation calc = new SalaryCalculation();
        double salary = calc.calcSalary(emp);
        System.out.println(salary);

        MachineOperator mach = new MachineOperator();
        mach.salary = 3000;
        SalaryAdapter adapter = new SalaryAdapter();
        double salary2 = adapter.calcSalary(mach);
        System.out.println(salary2);
    }
}