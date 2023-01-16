package homework.task1;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

class Cashier {
    private String cashier;
    private ReentrantLock lock;

    Cashier(String cashier) {
        this.cashier = cashier;
        lock = new ReentrantLock();
    }

    private String getCashier() {
        return this.cashier;
    }

    String getProductTypes(Buyer buyer) {
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        int item = rand.nextInt(buyer.getProductTypes().size());
        lock.lock();
        try {
            for (; item < buyer.getProductTypes().size(); item++) {
                if (item != buyer.getProductTypes().size() - 1) {
                    result.append(buyer.getProductTypes()).append(", ");
                } else {
                    result.append(buyer.getProductTypes()).append(", ");
                }
            }

            Thread.sleep((int) (Math.random() * 150));

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return "Buyer " + buyer.getName() + " bought: " + result + " in " + this.cashier;
    }

    ReentrantLock getLock() {
        return lock;
    }

}
