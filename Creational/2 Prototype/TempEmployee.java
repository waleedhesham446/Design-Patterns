/**
 * TempEmployee
 */
public class TempEmployee extends EmployeePrototype {

    @Override
    public EmployeePrototype ShallowCopy() {
        try {
            return (TempEmployee) this.clone();
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    @Override
    public EmployeePrototype DeepCopy() {
        TempEmployee emp = new TempEmployee();
        try {
            emp = (TempEmployee)this.clone();
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