import java.util.Scanner;
class main {
    public static void main(String args[]) {

        while (true) {

            //Declarations of classes
            Caesar caesar = new Caesar();
            Binary binary = new Binary();
            XOR xor = new XOR();
            Scanner myScanner = new Scanner(System.in);

            System.out.println("Choose which type of encryption you want: \n 1. Caesar \n 2. Binary ");
            switch (myScanner.nextInt()) {
                case 1:
                    System.out.println("Enter the desired text as a string:");
                    System.out.println(caesar.text());
                    break;
                case 2:
                    System.out.println("Enter the desired text as a string:");
                    System.out.println(xor.xor(binary.text(), binary.number(), binary.charNumber()));

                            //System.out.println(ctb.numberToBinary(5));
                    break;
                default:
                    System.out.println("No such option");
            }
        }
    }
}