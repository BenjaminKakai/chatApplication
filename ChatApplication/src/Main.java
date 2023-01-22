public class Main {
    public static void main(String[] args) throws IOException {
        // create the server and start it
        ChatServer server = new ChatServer(8000);
        server.start();

        // create the client and connect it to the server
        ChatClient client = new ChatClient("localhost", 8000);
        client.connect();
    }
}
