package comunicazionemulticastudp;

import static comunicazionemulticastudp.ServerMulticastUDP.ANSI_BLUE;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientMulticastUDP {
    //colore del prompt del Server
    public static final String ANSI_BLUE = "\u001B[34m";
    //colore del prompt del Client
    public static final String RED_BOLD = "\033[1;31m";
    //colore del prompt del gruppo
    public static final String GREEN_UNDERLINED = "\033[4;32m";
    //colore reset

    public static void main(String[] args) {
        int porta = 2000; //porta server
        int portGroup = 1900; //porta gruppo
        InetAddress serverAddress; //indirizzo server
        DatagramSocket dscoket = null; //socket UDP
        MulticastSocket mSocket = null; //scoket multicast UDP
        InetAddress group; //indirizzo gruppo
        DatagramPacket outPacket; //Datagramma UDP con richiesta al server
        DatagramPacket inPacket; //Datagramma UDP di risposta ricevuto dal server

        byte[] inbuffer = new byte[256];
        byte[] inBuffer = new byte[1024];

        String messageOut = "Richiesta comunicazione";
        String messageIn;
    }
}