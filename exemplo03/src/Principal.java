import java.util.Locale;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        UnencapsulatedItem monitor = new UnencapsulatedItem( "electronics-012", "17\" SVGA Monitor ", 1, 299.00 );

        monitor.discount = 1.25;  // inválido, o desconto deve ser menor que 100%!

        double price = monitor.getAdjustedTotal();
        


    }

}
