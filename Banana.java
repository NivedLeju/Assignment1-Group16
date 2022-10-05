package Asssignment1;
public class Banana implements GroceryProductFactory{
  
@Override
    public void outputPrice() {
        System.out.println("Price of Banana: $1.30/kg");
    }
}