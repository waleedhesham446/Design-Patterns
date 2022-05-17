/**
 * Car
 */
public class Car implements IBuilder {

    private String brandName;

    private Product product;

    public Car(String brand){
        product = new Product();
        this.brandName = brand;
    }

    public void StartUpOperations() {
        product.Add(String.format("Car Model Name: %s\n", this.brandName));
    }

    public void BuildBody() {
        product.Add("Body of car was added\n");
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