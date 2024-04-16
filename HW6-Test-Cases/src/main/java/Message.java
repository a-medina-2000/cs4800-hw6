public class Message {
    private String sender;
    private String recipient;
    private String timestamp;
    private String messageContent;

    Message() {
        sender = "";
        recipient = "";
        timestamp = "";
        messageContent = "";
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
