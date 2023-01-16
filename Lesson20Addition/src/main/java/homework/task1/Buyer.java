package homework.task1;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
class Buyer extends Thread {
    private List<Cashier> cashier;
    private List<ProductType> productTypes;

    @Override
    public void run() {
        Cashier cashierName = cashier.get(0);
        do {
            for (Cashier cashiers : cashier) {
                if (cashiers.getLock().getQueueLength() < cashierName.getLock().getQueueLength()) {
                    cashierName = cashiers;
                    break;
                }
            }
            System.out.println(cashierName.getProductTypes(this));
        } while (!this.isAlive());
    }
}
