public abstract class Account {
    protected int amount;
    protected String accountName;

    public Account(String accountName, int amount) {
        this.accountName = accountName;
        this.amount = amount;

    }

    public abstract boolean add(int amount);

    public abstract boolean transfer(Account account, int amount);

    public abstract boolean pay(int amount);

    public String toString() {
        return accountName;
    }
}
