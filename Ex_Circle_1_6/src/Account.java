
public class Account {
	private String accId;
    private String accName;
    private int amount;

    public Account(String accId, String accName) {
        this.accId = accId;
        this.accName = accName;
    }

    public Account(String accId, String accName, int amount) {
        this.accId = accId;
        this.accName = accName;
        this.amount = amount;
    }

    public String getID() {
        return accId;
    }

    public String getName() {
        return accName;
    }

    public int getBalance() {
        return amount;
    }

    public int credit(int money) {
        amount += money;
        return amount;
    }

    public int debit(int money) {
        if (money <= amount) {
            amount -= money;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return amount;
    }

    public int transferTo(Account other, int money) {
        if (money <= amount) {
            amount -= money;
            other.amount += money;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return amount;
    }

    public String toString() {
        return "Account[id=" + accId + ",name=" + accName + ",balance=" + amount + "]";
    }
}

