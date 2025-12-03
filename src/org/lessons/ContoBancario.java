package org.lessons;

public class ContoBancario {
    private int accountID;
    private int saldo;

    public ContoBancario(int accountID) {
        this.accountID = accountID;
        this.saldo = 0;
    }

    public String getCensID() {
        String res = "";
        for (int i = 0; i < String.valueOf(this.accountID).length(); i++) {
            res += '*';
        }

        return res;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void deposit(int amount) {
        this.saldo += amount;
    }
    public void withdraw(int amount) {
        this.saldo -= amount;
    }
}
