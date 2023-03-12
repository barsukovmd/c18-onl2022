package behavioral.mediator;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class SimpleTextChat implements Chat {
    private User admin;
    private List<User> userList = new ArrayList<>();


    @Override
    public void sendMessage(String message, User user) {
        for (User u : userList) {
            if (u != user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }

    public void addUserToChat(User user) {
        this.userList.add(user);
    }
}
