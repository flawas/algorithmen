package ch.hslu.sw05.bank;

/*
 * Copyright (c) 2022.
 * Flavio Waser
 * Version 1.0
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BankTest {



    @Test
    public void executeTransfers() {

        Bank bank = new Bank(4, 2000000);
        bank.executeTransfers(1500000);
        System.out.println(bank);
    }

    @Test
    void getBalance() {
        Bank bank = new Bank(4, 2000000);
        assertEquals(2000000, bank.targetAccounts.get(0).getBalance());
        System.out.println(bank.targetAccounts.get(0).getBalance());
    }

}
