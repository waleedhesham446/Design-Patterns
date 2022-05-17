public class Customer {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza = store.orderPizza("cheese");

        System.out.println(pizza);
    }
}
