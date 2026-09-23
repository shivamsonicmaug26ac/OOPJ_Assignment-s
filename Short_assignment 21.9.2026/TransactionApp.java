package part2ofsoni.org;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

class Transaction {

    int txId;
    LocalDate txDate;
    float txAmount;
    boolean txStatus;
    boolean txArrears;

    public Transaction(int txId, LocalDate txDate, float txAmount,
            boolean txStatus, boolean txArrears) {

        this.txId = txId;
        this.txDate = txDate;
        this.txAmount = txAmount;
        this.txStatus = txStatus;
        this.txArrears = txArrears;
    }

    @Override
    public String toString() {
        return txId + " " + txDate + " " + txAmount
                + " " + txStatus + " " + txArrears;
    }
}

public class TransactionApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Transaction> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Transaction ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Date (yyyy-mm-dd): ");
            LocalDate date = LocalDate.parse(sc.next());

            System.out.print("Enter Amount: ");
            float amount = sc.nextFloat();

            System.out.print("Enter Status (true/false): ");
            boolean status = sc.nextBoolean();

            System.out.print("Enter Arrears (true/false): ");
            boolean arrears = sc.nextBoolean();

            Transaction t = new Transaction(
                    id, date, amount, status, arrears);

            list.add(t);
        }

        System.out.println("\nAll Transactions:");

        list.forEach(t -> System.out.println(t));

        System.out.println("\nTransactions where Amount > 5000:");

        list.stream()
            .filter(t -> t.txAmount > 5000)
            .forEach(t -> System.out.println(t));

        System.out.println("\nTransactions where Status is false:");

        list.stream()
            .filter(t -> t.txStatus == false)
            .forEach(t -> System.out.println(t));

        Function<Transaction, Float> amountDue = (t) -> {

            if (t.txArrears) {
                return t.txAmount + 500 + (18 * t.txAmount / 100);
            } else {
                return t.txAmount;
            }
        };

        System.out.println("\nAmount Due:");

        for (Transaction t : list) {

            System.out.println(
                    "Transaction ID: " + t.txId
                    + " Amount Due: " + amountDue.apply(t));
        }

        sc.close();
    }
}