package _16_Class.BankAccount;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);
//        System.out.println("");
//        account.deposit(5000);
//        System.out.println("");
//        account.withdraw(6000);
//        System.out.println("");
//        account.withdraw(-100);
//        System.out.println("");
//        account.withdraw(100000);
//        System.out.println("");
//        System.out.println("현재 잔액 : " + account.getBalance());

        Scanner scanner = new Scanner(System.in);
        int choice;
        int money;

        do {
            System.out.println(
                    "1. 잔액 확인하기" + "\n" +
                    "2. 입금 하기" + "\n" +
                    "3. 출금 하기" + "\n" +
                    "4. 종료 하기" + "\n"
            );
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("잔액 확인");
                    System.out.println("현재 잔액 >>>> " + account.getBalance());
                    break;
                case 2:
                    System.out.println("입금");
                    money = scanner.nextInt();
                    account.deposit(money);
                    break;
                case 3:
                    System.out.println("출금");
                    money = scanner.nextInt();
                    account.withdraw(money);
                    break;
                case 4:
                    System.out.println("종료");
                    break;
                default:
                    System.out.println("유효하지 않은 기능입니다.");
                    break;
            }
        } while (choice != 4);
    }
}
