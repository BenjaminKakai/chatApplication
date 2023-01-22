public class Main {
    public static void main(String[] args) {
        // create the main window of the chat client
        JFrame frame = new JFrame("Chat Client");
        // create the UI elements and add them to the JFrame
        // create the client and connect it to the server
        ChatClient client = new ChatClient();
        client.connect();
    }
}
