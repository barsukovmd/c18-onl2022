package springbootexample.repositories;

import springbootexample.entities.User;

public interface UserRepository extends BaseRepository<User> {

    User findById(int id);

    User findByEmailAndPassword(String email, String password);
}
