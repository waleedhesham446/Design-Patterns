import java.util.Random;

public class PizzaStore {

    SimplePizzaFactory factory;
    
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    
    Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    Pizza getRandomPizza1() {
        Pizza pizza = null;
        Random random = new Random();
        int r = random.nextInt(10);
        
        if(r == 0){
            pizza = new CheesePizza();
        }else if(r == 1){
            pizza = new PepperonuPizza();
        }else {
            pizza = new VeggiePizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    Pizza getRandomPizza2() {
        Pizza pizza = null;
        Random random = new Random();
        int r = random.nextInt(10);
        
        if(r == 0){
            pizza = new CheesePizza();
        }else if(r == 1){
            pizza = new PepperonuPizza();
        }else {
            pizza = new ClamPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
