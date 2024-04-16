import java.util.ArrayList;
public class ChatHistory {
    private ArrayList<String> chatHistory;

    ChatHistory() {
        chatHistory = new ArrayList<>();
    }
    public void addToHistory(String message) {
        chatHistory.add(message);
    }

    public String showLastMessage() {
        return chatHistory.getLast();
    }
}
