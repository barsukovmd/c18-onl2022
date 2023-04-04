package tms.repository;

import tms.model.User;

public interface JdbcUserRepository extends BaseRepository {

    void addUser(User user);

    User getUserByLogin(String login);

    Long getUserId(String login);
}