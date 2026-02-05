import java.util.Scanner;

public class CRC19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*--Error Detection using CRC--*");

        System.out.print(" Enter message bits : ");
        String message = sc.nextLine();

        System.out.print(" Enter generator : ");
        String generator = sc.nextLine();

        int[] data = new int[message.length() + generator.length() - 1];
        int[] divisor = new int[generator.length()];

        // Copy message bits into data
        for (int i = 0; i < message.length(); i++) {
            data[i] = Integer.parseInt(message.charAt(i) + "");
        }

        // Copy generator bits into divisor
        for (int i = 0; i < generator.length(); i++) {
            divisor[i] = Integer.parseInt(generator.charAt(i) + "");
        }

        // Calculation of CRC
        for (int i = 0; i < message.length(); i++) {
            if (data[i] == 1) {
                for (int j = 0; j < divisor.length; j++) {
                    data[i + j] ^= divisor[j];
                }
            }
        }

        // Display CRC (message + CRC)
        System.out.print("\n The Checksum code is: ");

        // Put original message bits back in the front
        for (int i = 0; i < message.length(); i++) {
            data[i] = Integer.parseInt(message.charAt(i) + "");
        }

        // Print full codeword (message + CRC)
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        System.out.println();

        // Check for input CRC code
        System.out.print(" Enter checksum code : ");
        message = sc.nextLine();

        System.out.print("\n Enter generator : ");
        generator = sc.nextLine();

        data = new int[message.length()];
        divisor = new int[generator.length()];

        // Copy received checksum code bits into data
        for (int i = 0; i < message.length(); i++) {
            data[i] = Integer.parseInt(message.charAt(i) + "");
        }

        // Copy generator bits
        for (int i = 0; i < generator.length(); i++) {
            divisor[i] = Integer.parseInt(generator.charAt(i) + "");
        }

        // Calculation of Remainder
        for (int i = 0; i <= message.length() - generator.length(); i++) {
            if (data[i] == 1) {
                for (int j = 0; j < divisor.length; j++) {
                    data[i + j] ^= divisor[j];
                }
            }
        }

        // Display validity of data
        boolean valid = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 1) {
                valid = false;
                break;
            }
        }

        if (valid == true) {
            System.out.println(" \n Data stream is valid");
        } else {
            System.out.println("\n Data stream is invalid, CRC error occurred");
        }

        sc.close();
    }
}
