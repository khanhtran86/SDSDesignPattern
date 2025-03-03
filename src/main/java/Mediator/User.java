package Mediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(String name, ChatMediator mediator) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message, User sender);
}
