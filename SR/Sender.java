import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket();
        InetAddress addr = InetAddress.getByName("localhost");
        int port = 9876;

        byte[] data = "Hello!".getBytes();
        int seq = 0;

        while (seq < data.length) {

            // packet: [sequenceNumber, dataByte]
            byte[] pkt = { (byte) seq, data[seq] };
            socket.send(new DatagramPacket(pkt, pkt.length, addr, port));
            System.out.println("Sent: " + (char) data[seq] + " (seq=" + seq + ")");

            // wait for ACK
            byte[] ackBuf = new byte[1];
            DatagramPacket ackPkt = new DatagramPacket(ackBuf, 1);
            socket.receive(ackPkt);

            int ack = ackBuf[0]; // seq is small, so sign isn’t a problem
            System.out.println("Received ACK: " + ack);

            if (ack == seq) {
                seq++;
            }
        }

        // send quit message
        byte[] quit = "quit".getBytes();
        socket.send(new DatagramPacket(quit, quit.length, addr, port));
        socket.close();
    }
}
