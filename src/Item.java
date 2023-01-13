public class Item {
    private double unit_price;
    private double discount; // uma porcentagem de desconto que se aplica ao preço
    private int quantity;
    private String description;
    private String id;

    public Item(String id, String description, int quantity, double price){
        this.id = id;
        this.description = description;

        if (quantity >= 0 ){
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
        this.unit_price = price;
    }
}