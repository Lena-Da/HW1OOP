import java.util.ArrayList;
import java.util.List;

public class task1{
    public static void main(String[] args) {
        List<Product> prods = new ArrayList<>();
        prods.add(new ProteinBar("Protein Bar", 100.0, 80));
        prods.add(new Milk("Milk", 60.0, 3));
        prods.add(new Product("Chips", 60.0));
        prods.add(new Product("Oil", 50.0));
        prods.add(new Product("Bread", 40.0));
        prods.add(new Product("Chocolate", 30.0));
        prods.add(new Product("Milk", 20.0));
        VendingMachine v1 = new VendingMachine(prods);
        System.out.println(v1);
        System.out.println(v1.getProductBy("Oil"));
        System.out.println(v1.getProductBy(30.0));
        
    }
}