package Asssignment1;

public class TestDriver {
    public static void main (String[] args){
        Factory fruitfactory = new Factory();
        GroceryProductFactory groceryProductFactory1 = fruitfactory.createProduct("Banana");
        GroceryProductFactory groceryProductFactory2 = fruitfactory.createProduct("Apple");
        groceryProductFactory1.outputPrice();
        groceryProductFactory2.outputPrice();

    }
}
