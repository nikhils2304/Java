public class FoodOrder {
    
    private String item;
    private int quantity;

    public FoodOrder(){
        this.item = "Burger";
        this.quantity = 1;
    }

    public FoodOrder(String item){
        this.item = item;
        this.quantity = 1;
    }

    public FoodOrder(String item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }

    public void showOrder(){
        System.out.println("Order Details : ");
        System.out.println("Item : " + item);
        System.out.println("Quantity : " + quantity);
    }

    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder();
        FoodOrder order2 = new FoodOrder("Pizza");
        FoodOrder order3 = new FoodOrder("Pasta", 2);

        order1.showOrder();
        System.out.println();
        order2.showOrder();
        System.out.println();
        order3.showOrder();

    }
}

