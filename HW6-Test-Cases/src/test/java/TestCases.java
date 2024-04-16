import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCases {
    ChatServer mediator = new ChatServer();
    ChatHistory history = new ChatHistory();

    User userOne = new User();
    User userTwo = new User();

    Message messageOne = new Message();
    Message messageTwo = new Message();

    public void testRegisterUser() {
        mediator.registerUser(userOne, "James");
        mediator.registerUser(userTwo, "Adam");

        String expected = "James";
        String actual = userOne.getUserName();
        assertEquals(expected, actual);

        expected = "Adam";
        actual = userTwo.getUserName();
        assertEquals(expected, actual);
    }

    public void testSender() {
        messageOne.setSender(userOne.getUserName());
        messageTwo.setSender(userTwo.getUserName());

        String expected = "James";
        String actual = messageOne.getSender();
        assertEquals(expected, actual);

        expected = "Adam";
        actual = messageTwo.getSender();
        assertEquals(expected, actual);
    }

    public void testRecipient() {
        messageOne.setRecipient(userTwo.getUserName());
        messageTwo.setRecipient(userOne.getUserName());

        String expected = "Adam";
        String actual = messageOne.getSender();
        assertEquals(expected, actual);

        expected = "James";
        actual = messageTwo.getSender();
        assertEquals(expected, actual);
    }

    public void testContents() {
        messageOne.setMessageContent("Hey There");
        messageTwo.setMessageContent("Hey Back To You Too");

        String expected = "Hey There";
        String actual = messageOne.getMessageContent();
        assertEquals(expected, actual);

        expected = "Hey Back To You Too";
        actual = messageTwo.getMessageContent();
        assertEquals(expected, actual);
    }

    public void testTimestamp() {
        messageOne.setTimestamp("21:50");
        messageTwo.setTimestamp("23:00");

        String expected = "21:50";
        String actual = messageOne.getTimestamp();
        assertEquals(expected, actual);

        expected = "23:00";
        actual = messageTwo.getTimestamp();
        assertEquals(expected, actual);
    }
}