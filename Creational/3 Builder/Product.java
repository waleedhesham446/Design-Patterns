import java.util.LinkedList;

/**
 * Product
 */
public class Product {

    private LinkedList<String> parts;
    
    public Product() {
        parts = new LinkedList<String>();
    }

    public void Add(String part) {
        parts.add(part);
    }

    public String Show() {
        StringBuilder result = new StringBuilder();
        result.append("Product Components Are:\n");
        for (String part : parts) {
            result.append(part);
        }
        return result.toString();
    }
}