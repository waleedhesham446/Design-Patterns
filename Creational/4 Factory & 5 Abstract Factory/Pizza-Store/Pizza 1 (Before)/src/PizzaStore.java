import java.util.Random;

public class PizzaStore {
    Pizza orderPizza(String type) {
        Pizza pizza = null;

        // pizza = new Pizza();
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperonuPizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }

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
