public class Customer {

    // Fields
    private String name;
    private double creditLimit;
    private String email;

    Customer(String name, int creditLimit, String email) {
        System.out.println("Normal constructor is called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    Customer(String name, String email) {
        this(name,1000,email);
        System.out.println("Constructor with two arguments is called");
    }

    Customer() {
        this("test","test@test.com");
        System.out.println("Constructor no argument is called");
    }

    // getter method for name
    public String getName() {
        return name;
    }

    // getter methods for credit limit
    public double getCreditLimit() {
        return creditLimit;
    }

    // getter method for email
    public String getEmail() {
        return email;
    }
}
