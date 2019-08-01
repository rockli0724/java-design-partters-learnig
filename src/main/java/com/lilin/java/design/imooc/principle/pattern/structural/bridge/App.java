package com.lilin.java.design.imooc.principle.pattern.structural.bridge;

/**
 * @author lilin
 * @Title: App
 * @date 2019/8/1下午11:17
 */
public class App {

    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account openAccount = icbcBank.openAccount();
        openAccount.showAccountType();
        Bank icbcSvBank = new ICBCBank(new SavingAccount());
        Account openAccountsv = icbcSvBank.openAccount();
        openAccountsv.showAccountType();
        Bank abcBank = new ABCBank(new DepositAccount());
        Account openAccount1 = abcBank.openAccount();
        openAccount1.showAccountType();
        Bank abcBank2 = new ABCBank(new SavingAccount());
        Account openAccount2 = abcBank2.openAccount();
        openAccount2.showAccountType();
    }
}
