package comunicazionemulticastudp;

import java.io.IOException;
import java.net.BindException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerMulticastUDP {
    //colore del prompt del Server
    public static final String ANSI_BLUE = "\u001B[34m";
    //colore del prompt del Client
    public static final String RED_BOLD = "\033[1;31m";
    //colore reset
    public static final String RESET = "\033[0m";

    public static void main (String[] args) {
        int port=2000;
        DatagramSocket dSocket = null;
        DatagramPacket inPacket;
        DatagramPacket outPacket;
        byte[] inbuffer;
    }
}