package _16_Class.BankAccount;

public class BankAccount {
    private int balance;

    BankAccount (int balance) {
        if(balance == 0) {
            System.out.println(balance + "원은 입금 할 수 없습니다.");
        } else if (balance < 0) {
            System.out.println(balance + "원은 유효하지 않은 금액입니다.");
        } else {
            System.out.println("계좌가 개설 되었습니다.");
            System.out.println("현재 잔액 : " + balance);
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
        System.out.println(money + "원이 입금되었습니다.");
        System.out.println("현재 잔액 : " + balance);
    }

    public void withdraw(int money) {
        if (money >= 0 && money <= balance) {
            balance -= money;
            System.out.println(money + "원이 출금되었습니다.");
            System.out.println("현재 잔액 : " + balance);
        } else if (money < 0) {
            System.out.println("출금액은 0원 초과여야 합니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 잔액 : " + balance);
        }
    }
}
