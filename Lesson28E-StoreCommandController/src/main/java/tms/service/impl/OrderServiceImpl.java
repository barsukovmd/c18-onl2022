package tms.service.impl;
import lombok.Setter;
import tms.model.Inject;
import tms.model.Order;
import tms.model.Product;
import tms.repository.JdbcOrderRepository;
import tms.service.OrderService;

import java.util.List;

@Setter
public class OrderServiceImpl implements OrderService {

    @Inject
    private JdbcOrderRepository jdbcOrderRepository;

    @Override
    public void createOrder(String order, Long id) {
        jdbcOrderRepository.createOrder(order, id);
    }

    @Override
    public void saveProductInOrderConfigurations(String order, Product product) {
        jdbcOrderRepository.saveProductInOrderConfigurations(order, product);
    }

    @Override
    public List<Order> getOrdersById(Long id) {
        return jdbcOrderRepository.getOrdersById(id);
    }

    @Override
    public boolean checkOrderNumber(String number) {
        return jdbcOrderRepository.checkOrderNumber(number);
    }
}