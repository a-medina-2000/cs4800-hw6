//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ChatServer mediator = new ChatServer();
        ChatHistory history = new ChatHistory();

        User userOne = new User();
        User userTwo = new User();

        Message messageOne = new Message();
        Message messageTwo = new Message();

        mediator.registerUser(userOne, "James");
        mediator.registerUser(userTwo, "Adam");

        messageOne.setSender(userOne.getUserName());
        messageTwo.setSender(userTwo.getUserName());

        messageOne.setRecipient(userTwo.getUserName());
        messageTwo.setRecipient(userOne.getUserName());

        messageOne.setMessageContent("Hey There");
        messageTwo.setMessageContent("Hey Back To You Too");

        messageOne.setTimestamp("21:50");
        messageTwo.setTimestamp("23:00");

        String messageOneContents = mediator.sendMessage(userOne, messageOne);
        System.out.println("Message: " + messageOneContents);

        String messageTwoContents = mediator.sendMessage(userTwo, messageTwo);
        System.out.println("Message: " + messageTwoContents);

        history.addToHistory(messageTwoContents);
        System.out.println("\nLast Message: " + history.showLastMessage());

        String receivingMessage = mediator.receiveMessage(userTwo, messageOne);
        System.out.println("Message Received: " + receivingMessage);

        mediator.undoLastMessage(userOne, messageOne);

        mediator.unregisterUser(userOne);

        MessageOriginator originator = new MessageOriginator();
        MessageCaretaker caretaker = new MessageCaretaker();

        originator.setMessageContent(messageOneContents);
        originator.setMessageContent(messageTwoContents);

        originator.setMessageTimestamp(messageOne.getTimestamp());
        originator.setMessageTimestamp(messageTwo.getTimestamp());

        caretaker.addMessageContent(originator.saveContentAndTimestamp());

        originator.getContentAndTimestamp();
    }
}