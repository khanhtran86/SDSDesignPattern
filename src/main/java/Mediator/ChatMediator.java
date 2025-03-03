package Mediator;

public interface ChatMediator {
    //Send message to from user to user
    void sendMessage(String message, User user);
    //Add new user to chat room
    void addUser(User user);
}
