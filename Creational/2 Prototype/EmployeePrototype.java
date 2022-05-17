/**
 * EmployeePrototype
 */
public abstract class EmployeePrototype implements Cloneable {

    public int Id;

    public String Name;     //  copied deeply in both shallow and deep

    public Address EmpAddress;

    public abstract EmployeePrototype ShallowCopy();

    public abstract EmployeePrototype DeepCopy();
    
    @Override
    public String toString() {
        return String.format("Id: %s\nName: %s\nAddress: %s, %s, %s", this.Id, this.Name, this.EmpAddress.City, this.EmpAddress.StreetName, this.EmpAddress.Building);
    }

}