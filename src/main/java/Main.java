

public class Main {

    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        System.out.println(juice); // Juice
        juice.takeFromWarehouse(11.3);
        System.out.println(juice); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3
        Warehouse warehouse = new Warehouse( 1000.0);
        warehouse.addToWarehouse(1000.0);
        warehouse.takeFromWarehouse(11.3);
        System.out.println(warehouse); // Juice
        warehouse.addToWarehouse(1.0);
        System.out.println(warehouse);           // Juice: balance = 989.7, space left 10.3

// etc

// and now we have the history:
        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
        juice.printAnalysis();

    }

}
