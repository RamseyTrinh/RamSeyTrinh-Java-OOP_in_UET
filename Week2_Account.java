import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    private void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            this.balance -= amount;
        }
    }

    /**
     * Trinh Xuan Hoang.
     */
    public void addTransaction(double amount, String operation) {
        if (operation == "deposit") {
            this.deposit(amount);
            Transaction people = new Transaction(operation, amount, this.balance);
            transitionList.add(people);

        } else if (operation == "withdraw") {
            this.withdraw(amount);
            Transaction people = new Transaction(operation, amount, this.balance);
            transitionList.add(people);
        } else {
            System.out.print("Yeu cau khong hop le!\n");
        }
    }

    /**
     * Trinh Xuan Hoang.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            String a = this.transitionList.get(i).getOperation();
            double b = this.transitionList.get(i).getAmount();
            double c = this.transitionList.get(i).getBalance();
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.\n", i + 1, a, b, c);
        }
    }

}
