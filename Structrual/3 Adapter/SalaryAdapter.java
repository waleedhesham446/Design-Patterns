/**
 * SalaryAdapter
 */
public class SalaryAdapter extends SalaryCalculation {

    private Employee _emp = new Employee();

    // @Override
    public double calcSalary(MachineOperator _operator) {
        _emp.basicSalary = _operator.salary;
        return super.calcSalary(_emp);
    }
}