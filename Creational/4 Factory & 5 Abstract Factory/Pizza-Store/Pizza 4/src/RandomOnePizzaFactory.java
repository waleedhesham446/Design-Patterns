import java.util.Random;

public class RandomOnePizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza(String... type) {
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
    
}
