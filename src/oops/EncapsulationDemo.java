package oops;

public class EncapsulationDemo {

    private int balance;

    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        EncapsulationDemo acc = new EncapsulationDemo();
        acc.setBalance(1000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
