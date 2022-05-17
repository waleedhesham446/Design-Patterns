public class Customer {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        PizzaFactory factory;
        Pizza pizza;

        // Simple Pizza Factory
        factory = new SimplePizzaFactory();
        store.useFactory(factory);
        pizza = store.orderPizza("cheese");
        
        System.out.println(pizza);

        // Random 1
        factory = new RandomOnePizzaFactory();
        store.useFactory(factory);
        pizza = store.orderPizza();

        System.out.println(pizza);

        // Random 2
        factory = new RandomTwoPizzaFactory();
        store.useFactory(factory);
        pizza = store.orderPizza();

        System.out.println(pizza);
    }
}
