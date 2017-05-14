import java.util.Scanner;

public class Binary {

    ConvertToBinary ctb = new ConvertToBinary();

    Scanner myScanner = new Scanner(System.in);
    String text() {
        int charCount = 0;
        String myMessage = myScanner.nextLine();
        System.out.println("Enter an integer (between 0 and 255) to use as the encryption key");

        int myKey = myScanner.nextInt();
        while (myKey < 0 || myKey > 255) {
            System.out.println("Entered key was invalid - enter a new between 0 and 255");
            myKey = myScanner.nextInt();
        }

        String binaryMessage = ctb.stringToBinary(myMessage);
        ctb.numberToBinary(myKey);

        for (int i = 0; i<binaryMessage.length(); i++) {
            if (binaryMessage.charAt(i) == ' ') {
                charCount++;
            }
        }


        return binaryMessage;

    }

}





/*
        //System.out.println(ctb.toBinary("test"));

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
 */