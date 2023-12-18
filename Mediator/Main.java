public class Main {
    public static void main(String[] args) {
        ChatMediator chatroom = new ChatRoom();

        User john = new User("John", chatroom);
        User alice = new User("Alice", chatroom);
        User bob = new User("Bob", chatroom);

        chatroom.addUser(john);
        chatroom.addUser(alice);
        chatroom.addUser(bob);

        john.sendMessage("Hi Alice!");
        alice.sendMessage("Hey John!");
        bob.sendMessage("Hello everyone!");
    }
}
