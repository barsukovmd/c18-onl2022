package behavioral.mediator;

public class MainMediator {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat,"User1");
        User user2 = new SimpleUser(chat, "User2");
        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        admin.sendMessage("Hello from Admin");
        System.out.println("___");
        user1.sendMessage("Hello from User1");
        System.out.println("___");
        user2.sendMessage("Hello from User2");
        System.out.println("___");
    }
}
