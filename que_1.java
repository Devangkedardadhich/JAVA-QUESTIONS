/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
 */
import java.util.*;
public class que_1{
    public static void main(String []args){
  System.out.println("enter two numbers ");
  Scanner sc = new Scanner(System.in);
  System.out.println("enter firt number");
  int a = sc.nextInt();
  System.out.println("enter secound number");
  int b = sc.nextInt();
  System.out.println("enter number according to opretion\r\n" + //
                     "1 : + (Addition) a + b\r\n" + //
                     "2 : - (Subtraction) a - b\r\n" + //
                     "3 : * (Multiplication) a * b\r\n" + //
                     "4 : / (Division) a / b\r\n" + //
                     "5 : % (Modulo or remainder) a % b");
  int n= sc.nextInt();
  if(n==1){System.out.println("a+b=" + (a+b) );}
  else if(n==2){System.out.println("a+b=" + (a-b) );}
  else if(n==3){System.out.println("a+b=" + (a*b) );}
  else if(n==4){System.out.println("a+b=" + (a/b) );}
  else if(n==5){System.out.println("a+b=" + (a%b) );}
  else{System.out.println("not any opretion number");}
    }
}