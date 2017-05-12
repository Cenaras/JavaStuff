import java.util.Scanner;
public class Binary {
    Scanner myScanner = new Scanner(System.in);
    String text() {

        String myMessage = myScanner.nextLine();
        System.out.println("Enter an integer (between 0 and 255) to use as the encryption key");
        int myKey = myScanner.nextInt();

        byte[] message = myMessage.getBytes();

        while(myKey < 0 || myKey > 255) {
            System.out.println("Invalid key - choose a new one");
            myKey = myScanner.nextInt();
        }

        String binaryKey = Integer.toBinaryString(myKey);

        for (int i = 0;i<message.length;i++) {
            String binaryMessage = Integer.toBinaryString(message[i]);
            System.out.print(binaryMessage + " ");
        }


        //Add so the entered string gets converted into binary and then XOR it with the key

        return binaryKey;
    }

}
