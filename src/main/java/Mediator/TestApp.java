package Mediator;

public class TestApp {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User alice = new ChatUser("Alice", chatRoom);
        User bob = new ChatUser("Bob", chatRoom);
        User charlie = new ChatUser("Charlie", chatRoom);

        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(charlie);

        alice.send("Hello everyone!");
        bob.send("Hello Alice!");
    }
}
