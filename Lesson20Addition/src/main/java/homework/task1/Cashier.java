package homework.task1;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

class Cashier {
    private final String cashDeskName;
    private final ReentrantLock lock;

    Cashier(String cashDeskName) {
        this.cashDeskName = cashDeskName;
        lock = new ReentrantLock();
    }

    private String getCashDeskName() {
        return this.cashDeskName;
    }

    String getProduct(Buyer buyer) {
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        int item = random.nextInt(buyer.getProductType().size());
        lock.lock();
        try {

            for (; item < buyer.getProductType().size(); item++) {

                if (item != buyer.getProductType().size()) {
                    result.append(buyer.getProductType().get(item)).append(", ");
                } else {
                    result.append(buyer.getProductType().get(item));
                }
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        return "Buyer " + buyer.getName() + " bought: \n" + result + " in " + this.getCashDeskName();
    }

    ReentrantLock getLock() {
        return lock;
    }
}