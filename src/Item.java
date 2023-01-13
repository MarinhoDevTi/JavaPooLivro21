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
    public double getAdjustedTotal() {
        double total = unit_price * quantity;
        double total_discount = total * discount;
        double adjusted_total = total - total_discount;

        return adjusted_total;
    }

    public Item(double unit_price, double discount, int quantity, String description, String id) {
        this.unit_price = unit_price;
        this.discount = discount;
        this.quantity = quantity;
        this.description = description;
        this.id = id;
    }

    

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public double getDiscount() {
        return discount;
    }
    // aplica uma porcentagem de desconto no preço 
    public void setDiscount(double discount) {
        if( discount <= 1.0 ) {
            this.discount = discount;
        } else {
            this.discount = 0.0;
        }
        
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if ( quantity >= 0 ) {
            this.quantity = quantity;
        }
        
    }

    public String getProductID() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}