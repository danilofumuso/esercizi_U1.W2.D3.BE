package shop;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Il signore degli anelli", "Books", 200);
        Product p2 = new Product("Lo Hobbit", "Books", 150);
        Product p3 = new Product("Topolino", "Books", 5);
        Product p4 = new Product("Biberon", "Baby", 15);
        Product p5 = new Product("Pigiama mesi 2", "Baby", 20);
        Product p6 = new Product("Pallone da Calcio", "Boys", 15);
        Product p7 = new Product("Automobile Telecomandata", "Boys", 130);
        Product p8 = new Product("GameBoy", "Boys", 230);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);
        products.add(p8);

        //Esercizio 1

        List<Product> specialEditionsBooks = products.stream()
                .filter(product -> product.getCategory().equals("Books") && product.getPrice() > 100.0)
                .toList();

        System.out.println("------ Esercizio 1 ------");
//      specialEditionsBooks.forEach(product -> System.out.println("Product: " + product.getName()
//               + "\nCategory: " + product.getCategory() + "\nPrice: " + product.getPrice() + " €"));

        specialEditionsBooks.forEach(System.out::println);
        //fanno la stessa cosa ma questo usa il metodo toString della classe, a cui avevo fatto un override!
        //Se non scrivo un metodo nella classe uso la versione sopra!

        //Esercizio 2

        List<Product> babyProducts = products.stream()
                .filter(product -> product.getCategory().equals("Baby"))
                .toList();

        System.out.println("------ Esercizio 2 ------");
        babyProducts.forEach(System.out::println);

        //Esercizio 3

        List<Product> boysProducts = products.stream()
                .filter(product -> product.getCategory().equals("Boys"))
                .map(product -> {
                    product.setPrice(product.getPrice() * 0.9);
                    return product;
                })
                .toList();


        System.out.println("------ Esercizio 3 ------");
        boysProducts.forEach(System.out::println);

        //Esercizio 4

        Customer c1 = new Customer("Danilo", 1);
        Customer c2 = new Customer("Riccardo", 2);
        Customer c3 = new Customer("Giacomo", 2);

        Order o1 = new Order("In Completamento", boysProducts, c2);
        Order o2 = new Order("In Completamento", specialEditionsBooks, c3);
        Order o3 = new Order("In completamento", boysProducts, c1);

        List<Order> customersOrders = new ArrayList<>();
        customersOrders.add(o3);

        List<Order> tier2CustomersOrders = new ArrayList<>();

        tier2CustomersOrders.add(o1);
        tier2CustomersOrders.add(o2);

        System.out.println("------ Esercizio 4 ------");
        tier2CustomersOrders.forEach(System.out::println);

    }
}
