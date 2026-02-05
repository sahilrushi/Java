import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket(9876);
        int expected = 0;

        while (true) {

            byte[] buf = new byte[10];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);

            // build string from received bytes
            String msg = new String(packet.getData(), 0, packet.getLength());

            // check for quit message
            if (msg.equals("quit")) {
                System.out.println("Receiver shutting down...");
                break;
            }

            int seqNum = buf[0];
            char ch = (char) buf[1];

            if (seqNum == expected) {
                System.out.println("Received: " + ch + " (seq=" + seqNum + ")");
                byte[] ack = { (byte) seqNum };
                socket.send(new DatagramPacket(ack, 1, packet.getAddress(), packet.getPort()));
                expected++;
            }
        }

        socket.close();
    }
}
