public class SavingAccount extends Account {
    public SavingAccount(String accountName, int amount) {
        super(accountName, amount);
    }

    @Override
    public boolean add(int amount) {
        this.amount += amount;
        System.out.println("На счет: " + accountName + " внесено - " + amount + "у.е");
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (this.amount < amount) {
            System.out.println("перевод невозможен, сумма превышает допустимое значение");
            return false;
        }
        if (!account.add(amount)) {
            System.out.println("Совершен перевод с: " + accountName + " на " + account + " не удался");
            return false;
        }

        this.amount -= amount;
        System.out.println("Перевод со счета: " + accountName + "на" + amount + "у.е");
        return true;
    }

    @Override
    public boolean pay(int amount) {
            System.out.println("Ошибка нельзя платить со сберегательного счета");
            return false;
        }
    }