import java.util.*;


public  class check{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("enter a number");
        int a = i.nextInt();
       if (a%2 != 0 ){
           System.out.println("Weird");
       } else if (a%2 == 0 && a > 2 && a<5) {
           System.out.println("NOt Weird");
       } else if (a%2 == 0 && a > 6 && a < 20) {
           System.out.println("Weird");
       } else if (a%2 == 0 && a >20) {
           System.out.println("Not Weird");
           
       }
    }
    }

