/**
 * MotorCycle
 */
public class MotorCycle implements IBuilder {

    private String brandName;

    private Product product;

    public MotorCycle(String brand){
        product = new Product();
        this.brandName = brand;
    }

    public void StartUpOperations() {
        product.Add(String.format("MotorCycle Model Name: %s\n", this.brandName));
    }

    public void BuildBody() {
        product.Add("Body of motorcycle was added\n");
    }

    public void InsertWheels() {
        product.Add("Wheels are added\n");
    }

    public void AddHeadLights() {
        product.Add("Headlights are added\n");
    }

    public void EndOperations() {
        /* */
    }

    public Product GetVehicle() {
        return product;
    }
}