

public class Factory implements GroceryProductFactory{
   
    public Product createProduct(String product) {
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
