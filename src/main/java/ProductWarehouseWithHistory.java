public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;
    // private double balance;


    // creates a product warehouse. The product name, capacity, and initial balance are provided as parameters. Set the initial balance as the initial balance of the warehouse, as well as the first value of the change history.
    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }

    // returns the product history like this [0.0, 119.2, 21.2].
    // Use the string representation of the ChangeHistory object as is.
    public String history() {
        return this.history.toString();
    }

    // works just like the method in the Warehouse class,
    // but we also record the changed state to the history.
    // NB: the value recorded in the history should be the warehouse's balance after adding, not the amount added!
    //
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(this.getBalance());
    }

    // works just like the method in the Warehouse class, but we also record the changed state to the history. NB: the value recorded in the history should be the warehouse's balance after removing, not the amount removed!
    public double takeFromWarehouse(double amount) {
        // super.takeFromWarehouse(amount);
        double taken = super.takeFromWarehouse(amount);
        this.history.add(this.getBalance());
        return taken;
    }

    // which prints history related information for the product in the way presented in the example.
    // Product: Juice
    //History: [1000.0, 988.7, 989.7]
    //Largest amount of product: 1000.0
    //Smallest amount of product: 988.7
    //Average: 992.8


    //         ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
    //        juice.takeFromWarehouse(11.3);
    //        juice.addToWarehouse(1.0);
    ////System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
    //
    //        juice.printAnalysis();
    // Product: Juice
    //History: [1000.0, 0.0, 1.0]
    //Largest amount of product: 1000.0
    //Smallest amount of product: 0.0
    //Average: 333.6666666666667

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history);
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }






}
