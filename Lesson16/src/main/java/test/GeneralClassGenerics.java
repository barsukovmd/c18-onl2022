package test;

import lombok.ToString;

public class GeneralClassGenerics {
    @ToString
    public static class Bank<T> {
        T[] accounts;

        public Bank() {
        }

        public Bank(T[] accounts) {
            this.accounts = accounts;
        }

    }

    public static void main(String[] args) {
        Bank<Integer> account = new Bank<>(new Integer[]{1, 2, 3, 4, 5});
        Bank<String> bank = new Bank<>(new String[]{"234", "432", "2342"});
        System.out.println(account);
        System.out.println(bank);
    }
}
