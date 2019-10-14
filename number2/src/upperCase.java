import java.util.Scanner;

public class upperCase {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String word = input.nextLine();
        //System.out.println(word);
        String upperCase = word.toUpperCase();
        System.out.println(upperCase);

    }

}
