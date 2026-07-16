import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int usernumber = 0;

        do {
            System.out.println("Guess the number(1-100) :");
            usernumber = sc.nextInt();

            if(usernumber == mynumber) {
                System.out.println("Wooh Correct number is guess");
                break;
            }
            else if (usernumber > mynumber){
                System.out.println("No is greater ");

            }
            else {
                System.out.println("number is lesss ");
            }


        } while(usernumber >= 0);

        System.out.println("My number was");
        System.out.println(mynumber);

    }
}