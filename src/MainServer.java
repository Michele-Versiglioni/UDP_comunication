public class MainServer {
    public static void main(String[] args) {

        int port = 5000;

        ServerUDP server = new ServerUDP(port);
        server.start();
    }
}
