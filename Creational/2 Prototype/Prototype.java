/**
 * Prototype
 */
public class Prototype {

    public static void main(String[] args) {
        EmployeePrototype tempEmployee1 = new TempEmployee();
        tempEmployee1.Name = "Temp 1";
        tempEmployee1.Id = 1;
        Address address1 =  new Address();
        address1.Building = "b1";
        address1.City = "c1";
        address1.StreetName = "s1";
        tempEmployee1.EmpAddress = address1;

        EmployeePrototype tempEmployee2 = tempEmployee1.ShallowCopy();
        // EmployeePrototype tempEmployee2 = tempEmployee1.DeepCopy();

        System.out.println(tempEmployee1);
        System.out.println(tempEmployee2);

        tempEmployee2.EmpAddress.City = "c2";
        tempEmployee2.Name = "Temp 2";

        System.out.println(tempEmployee1);
        System.out.println(tempEmployee2);
    }
}