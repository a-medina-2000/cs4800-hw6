public class User {
    private String userName;

    User() {
        userName = "";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sendMessage(Message message) {
        System.out.println("Sender of Message: " + message.getSender());
        System.out.println("Recipient of Message: " + message.getRecipient());
        return  message.getMessageContent();
    }

    public String receiveMessage(Message message) {
        System.out.println("\nMessage from: " + message.getSender());
        System.out.println("Message to: " + message.getRecipient());
        return message.getMessageContent();
    }

    public void undoLastMessage(Message message) {
        System.out.println("\nMessage to be deleted: " + message.getMessageContent());
        message.setMessageContent("");
        System.out.println("Message Deleted\n");
    }
}
