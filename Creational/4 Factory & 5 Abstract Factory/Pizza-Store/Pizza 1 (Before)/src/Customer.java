public class Customer {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        Pizza pizza = store.orderPizza("cheese");

        System.out.println(pizza);
    }
}
