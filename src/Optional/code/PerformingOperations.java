package Optional.code;

import Optional.domain.Customer;


import java.util.List;

public class PerformingOperations {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "naruto");
        Customer customer2 = new Customer(2, "hinata");
        Customer customer3 = new Customer(3, "luffy");
        Customer customer4 = new Customer(4, "zoro");
        Customer customer5 = new Customer(4, "sanji");
        Customer customer6 = new Customer(5, "osamu");
        Customer customer7 = new Customer(7, "kakashi");

        List<Customer> customers = List.of(customer1, customer2, customer3, customer4, customer5, customer6, customer7);
        String customerName = customers.stream()
                .filter(customer -> customer.getId() == 4)
                .findFirst()
                .map(Customer::getName)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        System.out.println(customerName);

    }
}
