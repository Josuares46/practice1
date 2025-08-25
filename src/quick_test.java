
public class quick_test{
    public static void main(String[] args){
        
        Store lemonadeStand = new Store("lemonade", 27.00);

        lemonadeStand.increasePrice(3700);

        System.out.println(lemonadeStand.price);
    }
}

 class Store {
  // instance fields
  String productType;
  public double price;
    
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
    
  // increase price method
  public void increasePrice(double priceToAdd){
     price += priceToAdd;
    
  }
    
}