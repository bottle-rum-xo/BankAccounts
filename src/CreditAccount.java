public class CreditAccount extends Account {
    public CreditAccount(String accountName, int amount) {
        super(accountName, amount);
    }

    @Override
    public boolean add(int amount) {
        if (this.amount + amount > 0) {
            System.out.println("Ошибка нельзя пополнить кредитку на эту сумму");
            return false;
        }
        this.amount += amount;
        System.out.println("На счет: " + accountName + " внесено - " + amount + "у.е");
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
            if (!account.add(amount)) {
                System.out.println("Перевод с: " + accountName + " на " + account + " не удался");
                return false;
        }
        this.amount -= amount;
            System.out.println("Совершен перевод с: " + accountName + " на " + account + " - " + amount + "y.e");
            return true;
    }

    @Override
    public boolean pay(int amount) {
        this.amount -= amount;
            System.out.println("Оплата с: " + accountName + " на " + amount + " у.е");
            return true;
        }
    }