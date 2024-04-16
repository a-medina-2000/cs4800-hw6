import java.util.ArrayList;
import java.util.List;

public class MessageMemento {
    private static String messageContent;
    private static String messageTimestamp;

    public MessageMemento(String messageContent, String messageTimestamp) {
        MessageMemento.messageTimestamp = messageTimestamp;
        MessageMemento.messageContent = messageContent;
    }

    public static String getMessageContent() {
        return messageContent;
    }
    public static String getMessageTimestamp() {
        return messageTimestamp;
    }
}

class MessageOriginator {
    private String messageContent;
    private String messageTimestamp;

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
    public void setMessageTimestamp(String messageTimestamp) {
        this.messageTimestamp = messageTimestamp;
    }
    public String getMessageContent() {
        return messageContent;
    }
    public String getMessageTimestamp() {
        return messageTimestamp;
    }
    public MessageMemento saveContentAndTimestamp() {
        return new MessageMemento(messageContent, messageTimestamp);
    }

    public void getContentAndTimestamp() {
        messageContent = MessageMemento.getMessageContent();
        messageTimestamp = MessageMemento.getMessageTimestamp();
    }
}

class MessageCaretaker {
    private List<MessageMemento> messageContentGroup = new ArrayList<MessageMemento>();
    private List<MessageMemento> messageTimestampGroup = new ArrayList<MessageMemento>();

    public void addMessageContent(MessageMemento content) {
        messageContentGroup.add(content);
    }
    public void addMessageTimestamp(MessageMemento timestamp) {
        messageTimestampGroup.add(timestamp);
    }

    public MessageMemento getMessageContentGroup(int index) {
        return messageContentGroup.get(index);
    }
    public MessageMemento getMessageTimestampGroup(int index) {
        return messageTimestampGroup.get(index);
    }

}