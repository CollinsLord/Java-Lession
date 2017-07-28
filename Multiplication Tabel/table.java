import java.util.*;
public class table {

    public static void main (String [] args) {
        Scanner input =new Scanner(System.in);
        int num1,num2;
        System.out.println("Please enter a value to generate it multiplication table");
        num1=input.nextInt();
         System.out.println("Please enter the end of the table");
        num2=input.nextInt();

        for(int i=1;i<=num2;i++){
            System.out.println(num1 +"*" +i +"="+num1*i);

        }
    }
}
