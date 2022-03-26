public class Transaction {
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    private String operation;
    private double amount;
    private double balance;

    /**
     * Trinh Xuan Hoang da rattt co gang roi.
     */
    public Transaction(String operation, double amount, double balance) {
        if (operation == DEPOSIT) {
            this.operation = "Nap tien";
        } else if (operation == WITHDRAW) {
            this.operation = "Rut tien";
        }
        this.amount = amount;
        this.balance = balance;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
