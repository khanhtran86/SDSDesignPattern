package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    List<User> users = new ArrayList<User>();
    @Override
    public void sendMessage(String message, User sender) {
        for(User u : users){
            if(u!=sender){
                u.receive(message, sender);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
