import java.util.*;  //Import the Package in Java

public class Input_in_Java {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //Take Input From System
        String input = sc.next(); // This will print Upto Space If Space Come Between It will print upto that
        System.out.println("Input From User " +input);

        Scanner s = new Scanner(System.in);
        String Ex = s.nextLine(); // Used to Print Full Line, Paragraph , Name
        System.out.println(Ex);

        Scanner scn = new Scanner(System.in);
        Integer Int = scn.nextInt(); // Used to Print Integer
        System.out.println(Int);

        //Like This We Do for Float , Double , Boolean etc. etc...

    }
}
