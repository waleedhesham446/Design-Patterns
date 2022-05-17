/**
 * RegEmployee
 */
public class RegEmployee extends EmployeePrototype{

    @Override
    public EmployeePrototype ShallowCopy() {
        try {
            return (RegEmployee) this.clone();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public EmployeePrototype DeepCopy() {
        RegEmployee emp = new RegEmployee();
        try {
            emp = (RegEmployee)this.clone();
        } catch (Exception e) {
            return null;
        }
        emp.EmpAddress = new Address();
        emp.EmpAddress.Building = this.EmpAddress.Building;
        emp.EmpAddress.City = this.EmpAddress.City;
        emp.EmpAddress.StreetName = this.EmpAddress.StreetName;
        emp.Name = this.Name;

        return emp;
    }
}