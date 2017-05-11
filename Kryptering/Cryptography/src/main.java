import java.util.Scanner;
class main {
    public static void main(String args[]) {
        //Declarations of classes
        Caesar caesar = new Caesar();
        Binary binary = new Binary();
        Scanner myScanner = new Scanner(System.in);

        while (true) {

            System.out.println("Choose which type of encryption you want: \n 1. Caesar \n 2. Name ");
            switch (myScanner.nextInt()) {
                case 1:
                    System.out.println("Enter the desired text as a string:");
                    System.out.println(caesar.text());
                    break;
                case 2:
                    System.out.println("Enter the desired text as a string:");
                    System.out.println(binary.text());
                    break;
                default:
                    System.out.println("No such option");
            }
        }
    }
}