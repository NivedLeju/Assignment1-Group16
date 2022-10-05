package Asssignment1;

public class Factory{
   
    public GroceryProductFactory createProduct(String product) {
        if(product == null|| product.isEmpty())
            return null;
        
        switch (product){
         case "Banana":
            return new Banana();
        case "Apple":
            return new Apple();
        default:
            throw new IllegalArgumentException("Unknown Product: "+product);
        }

    } 
}