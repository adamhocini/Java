import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void deposit(double amount) {
        balance += amount;
        String transaction = "Deposit: +" + amount;
        transactionHistory.add(transaction);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            String transaction = "Withdrawal: -" + amount;
            transactionHistory.add(transaction);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String postalCode;
    private String city;

    public Customer(String firstName, String lastName, String address, String postalCode, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void updateInfo(String firstName, String lastName, String address, String postalCode, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }
}

class ATM {
    private BankAccount bankAccount;
    private Customer customer;

    public ATM(BankAccount bankAccount, Customer customer) {

        this.bankAccount = bankAccount;
        this.customer = customer;
    }

    public void displayMenu() {
        System.out.println("Welcome, " + customer.getFullName() + "!");
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. View Transaction History");
        System.out.println("5. Update Customer Information");
        System.out.println("0. Quit");
        System.out.print("Enter your choice: ");
    }

    public void processChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Current balance: " + bankAccount.getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = getDoubleInput();
                bankAccount.deposit(depositAmount);
                System.out.println("Deposit successful.");
                break;
            case 3:
                System.out.print("Enter the amount to withdraw: ");
                double withdrawalAmount = getDoubleInput();
                bankAccount.withdraw(withdrawalAmount);
                System.out.println("Withdrawal successful.");
                break;
            case 4:
                System.out.println("Transaction History:");
                List<String> transactions = bankAccount.getTransactionHistory();
                if (transactions.isEmpty()) {
                    System.out.println("No transactions yet.");
                } else {
                    for (String transaction : transactions) {
                        System.out.println(transaction);
                    }
                }
                break;
            case 5:
                updateCustomerInformation();
                break;
            case 0:
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void updateCustomerInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter new last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter new address: ");
        String address = scanner.nextLine();
        System.out.print("Enter new postal code: ");
        String postalCode = scanner.nextLine();
        System.out.print("Enter new city: ");
        String city = scanner.nextLine();
        customer.updateInfo(firstName, lastName, address, postalCode, city);
        System.out.println("Customer information updated successfully.");
    }

    private double getDoubleInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid amount: ");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(69696969);
        Customer customer = new Customer("Adam", "Hocini", "70 rue mathieu dussurgey", "69190", "St Fons");
        ATM atm = new ATM(bankAccount, customer);

        while (true) {
            atm.displayMenu();
            int choice = getIntInput();
            atm.processChoice(choice);
        }
    }

    private static int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid choice: ");
            }
        }
    }
}



