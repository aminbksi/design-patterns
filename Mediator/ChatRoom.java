import java.util.ArrayList;
import java.util.List;

class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (!u.equals(user)) {
                u.receiveMessage(message);
            }
        }
    }
}
