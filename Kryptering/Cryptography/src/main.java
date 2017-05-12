import java.util.Scanner;
class main {
    public static void main(String args[]) {
        //Declarations of classes
        Caesar caesar = new Caesar();
        Binary binary = new Binary();
        ConvertToBinary ctb = new ConvertToBinary();
        Scanner myScanner = new Scanner(System.in);

        while (true) {

            System.out.println("Choose which type of encryption you want: \n 1. Caesar \n 2. Binary ");
            switch (myScanner.nextInt()) {
                case 1:
                    System.out.println("Enter the desired text as a string:");
                    System.out.println(caesar.text());
                    break;
                case 2:
                    System.out.println("Enter the desired text as a string:");


                    break;
                default:
                    System.out.println("No such option");
            }
        }
    }
}