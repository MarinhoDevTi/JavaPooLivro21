import java.util.Locale;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        UnencapsulatedItem monitor = new UnencapsulatedItem("electronics-12",
        "17\" SVGA Monitor",
        1,
        299.00 );
        
        //cria os itens
        Item milk = new Item( "dairy-011", "1 Gallon Milk", 2, 250);
        Item yogurt = new Item("dairy-032", "Peach Yogurt", 4, 0.68);
        Item bread = new Item("bakery-23", "Sliced Bread", 1, 2.55);
        Item soap = new Item("household-21", "6 Pack Soap", '1', 4.51);

        //aplica cupons
        milk.setDiscount(0.15);

        //obtem preços ajustados
        double milk_price = milk.getAdjustedTotal();
        double yogurt_price = yogurt.getAdjustedTotal();
        double bread_price = bread.getAdjustedTotal();
        double soap_price = soap.getAdjustedTotal();

        //Impressão de recibo
        System.out.println("Thank You for Your Purchase.");
        System.out.println("Please Come Again!");
        System.out.println(milk.getDescription() + "\t $" + milk_price );
        System.out.println(yogurt.getDescription() + "\t $" + yogurt_price); 
        System.out.println(bread.getDescription() + "\t $" + bread_price);
        System.out.println(soap.getDescription() + "\t $" + soap_price);
                                                                           
        // calcula e imprime Total 
        double total = milk_price + yogurt_price + soap_price;
        System.out.println("Total Price \t $" + total);

        monitor.discount = 1.25; //inválido, o desconto deve ser menor que 100%!
        double price = monitor.getAdjustedTotal();
        

    }
}
