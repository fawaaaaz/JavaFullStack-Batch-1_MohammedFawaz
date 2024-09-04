public class Customer {
    private String name;
    private int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + id);
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer("VerizonUser", 101);
        customer1.display();
    }
}
