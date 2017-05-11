import java.util.Scanner;
public class Binary {
    Scanner myScanner = new Scanner(System.in);
    String text() {
        String myMessage = myScanner.nextLine();
        System.out.println("Enter an integer (between 0 and 255) to use as the encryption key");
        int myKey = myScanner.nextInt();

        while(myKey < 0 || myKey > 255) {
            System.out.println("Invalid key - choose a new one");
            myKey = myScanner.nextInt();
        }

        String binaryKey = Integer.toBinaryString(myKey);



        //Add so the entered string gets converted into binary and then XOR it with the key

        return binaryKey;
    }

}
