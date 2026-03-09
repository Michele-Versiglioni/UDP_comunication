import java.net.*;
import java.io.*;
import java.util.Date;

public class ServerUDP {

    private DatagramSocket dSocket;
    private int port;

    public ServerUDP(int port) {
        this.port = port;
    }

    public void start() {

        try {

            // Apertura socket sulla porta indicata
            dSocket = new DatagramSocket(port);
            System.out.println("Server UDP avviato sulla porta " + port);

            while(true) {

                System.out.println("\nServer in attesa di messaggi...");

                // Buffer di ricezione
                byte[] bufferIn = new byte[256];
                DatagramPacket inPacket = new DatagramPacket(bufferIn, bufferIn.length);

                // Ricezione messaggio (bloccante)
                dSocket.receive(inPacket);

                // Recupero indirizzo client
                InetAddress clientAddress = inPacket.getAddress();
                int clientPort = inPacket.getPort();

                // Lettura messaggio
                String messageIn = new String(inPacket.getData(), 0, inPacket.getLength());

                System.out.println("Messaggio ricevuto da "
                        + clientAddress + ":" + clientPort);
                System.out.println("Contenuto: " + messageIn);

                // Preparazione risposta
                String messageOut = "Messaggio ricevuto alle: " + new Date();

                byte[] bufferOut = messageOut.getBytes();

                // Pacchetto risposta
                DatagramPacket outPacket =
                        new DatagramPacket(bufferOut, bufferOut.length, clientAddress, clientPort);

                // Invio risposta
                dSocket.send(outPacket);

                System.out.println("Risposta inviata al client");
            }

        } catch(BindException e) {
            System.err.println("Porta già in uso!");
        } catch(SocketException e) {
            System.err.println("Errore socket!");
        } catch(IOException e) {
            System.err.println("Errore di I/O!");
        } finally {
            if(dSocket != null && !dSocket.isClosed())
                dSocket.close();
        }
    }
}
