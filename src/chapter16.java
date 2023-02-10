import java.sql.SQLOutput;
import java.util.*;
public class chapter16 {
    public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
        System.out.println("Enter Your number");
         int a = i.nextInt();
        System.out.println("What do you wanna do(+,-,*,/) ");
        String s = i.next();
        System.out.println("enter another number");
        int b = i.nextInt();
        if(s.equals("+") ){
            int add = a + b;
            System.out.println("the add of the given number is: " + add);
        } else if (s.equals("-")) {
            int sub = a - b ;
            System.out.println("The subtract of the given number is " + sub);
            
        } else if (s.equals("*")) {
            int mult = a * b;
            System.out.println("the multiplication of the given number is:" + mult );

        }
        else if (s.equals("/") && b == 0) {
            System.out.println("trying to tick me ! huh?");

        }
        else if (s.equals("/")) {
            int div = a / b;
            System.out.println("the division of the given number is: " + div);

        } else {
            System.out.println("invalid command!");
        }


    }


}
