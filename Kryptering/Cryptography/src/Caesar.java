import java.util.Scanner;

public class Caesar {

    Scanner myScanner = new Scanner(System.in);
    String text() {
        String myMessage = myScanner.nextLine();

        System.out.println("Enter an integer to use as the encryption key");
        int myKey = myScanner.nextInt();

        while(myKey == 32) {
            System.out.println("This key is unstable and will likely cause the program to crash - please choose another one");
            myKey = myScanner.nextInt();
        }

        char[] message = myMessage.toCharArray();
        int[] numberEncryptedMessage = new int[message.length];
        char[] encryptedMessage = new char[numberEncryptedMessage.length];

        for (int i = 0; i<message.length;i++) {
            numberEncryptedMessage[i] = myKey + (int) message[i];

            encryptedMessage[i] = (char) numberEncryptedMessage[i];
        }
        String finalMessage = String.valueOf(encryptedMessage);

        return "Your encrypted message: " + finalMessage;
    }


}
