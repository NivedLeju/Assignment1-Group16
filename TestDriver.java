

public class TestDriver {
    public static void main (String[] args){
        Factory fruitfactory = new Factory();
        Product groceryProductFactory1 = fruitfactory.createProduct("Banana");
        Product groceryProductFactory2 = fruitfactory.createProduct("Apple");
        groceryProductFactory1.outputPrice();
        groceryProductFactory2.outputPrice();

    }
}
