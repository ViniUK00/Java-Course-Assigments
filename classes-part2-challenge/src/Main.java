public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ervin",15_000, "ervin.bilo@yahoo.com");
        Customer secondCustomer = new Customer("Diyas","diyas@test.com");
        Customer thirdCusrtomer = new Customer();

        // first customer
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        // second customer
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        // third customer
        System.out.println(thirdCusrtomer.getName());
        System.out.println(thirdCusrtomer.getCreditLimit());
        System.out.println(thirdCusrtomer.getEmail());

    }
}
