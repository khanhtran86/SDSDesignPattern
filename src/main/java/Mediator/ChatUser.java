package Mediator;

public class ChatUser extends User {
    public ChatUser(String name, ChatMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " send message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, User sender) {
        System.out.println(name + " receive message from " + sender.name + " : " + message);
    }
}
