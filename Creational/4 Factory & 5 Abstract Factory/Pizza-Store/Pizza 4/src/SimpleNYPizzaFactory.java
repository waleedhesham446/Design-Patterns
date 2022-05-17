public class SimpleNYPizzaFactory implements PizzaFactory {
    public Pizza createPizza(String... myType) {
        String type;
        if(myType.length > 0)
            type = myType[0];
        else
            type = "cheese";
        
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperonuPizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
