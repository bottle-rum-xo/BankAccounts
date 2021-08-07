public class CheckingAccount extends Account {
    public CheckingAccount(String accountName, int amount) {
        super(accountName, amount);
    }

    @Override
    public boolean add(int amount) {
        this.amount += amount;
        System.out.println("На счет: " + accountName + " внесено - " + amount + "у.е");
        return false;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (this.amount < amount) {
            System.out.println("Перевод невозможен, сумма превышает допустимое значение");
            return false;
        }
        if (!account.add(amount)) {
            System.out.println("Совершен перевод с: " + accountName + " на " + account + " не удался");
        }
        this.amount -= amount;
        System.out.println("Совершен перевод с; " + accountName + " на " + account + " - " + amount + "у.е");
        return true;
    }

    @Override
    public boolean pay(int amount) {
        if (this.amount < amount) {
            System.out.println("Недостаточно средств для совершения оплаты");
            return false;
        }
        this.amount -= amount;
        System.out.println("Оплата с: " + accountName + "на" + amount + "у.е");
        return true;
    }
}