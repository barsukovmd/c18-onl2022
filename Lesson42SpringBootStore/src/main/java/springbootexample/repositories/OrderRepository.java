package springbootexample.repositories;

import springbootexample.entities.Order;
import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends BaseRepository<Order> {

    Order findById(int id);

    List<Order> findByDate(LocalDateTime date);
}
