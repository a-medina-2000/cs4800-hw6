public class ChatServer {
    public void registerUser(User user, String userName) {
        user.setUserName(userName);
    }

    public void unregisterUser(User user) {
        System.out.println("Current User Name: " + user.getUserName());
        user.setUserName("");
    }

    public String sendMessage(User user, Message message) {
        return user.sendMessage(message);
    }

    public String receiveMessage(User user, Message message) {
        return user.receiveMessage(message);
    }

    public void undoLastMessage(User user, Message message) {
        user.undoLastMessage(message);
    }
}
