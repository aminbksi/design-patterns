
public class Main {
    public static void main(String[] args) {
        MessageSystem messagingSystem = new MessageSystem();

        User user1 = new User("Ali");
        User user2 = new User("Reza");

        user1.subscribe(messagingSystem);
        user2.subscribe(messagingSystem);

        messagingSystem.sendMessage("Hello everyone!");

    }

}