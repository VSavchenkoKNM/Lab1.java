import java.util.Scanner;

public class Input{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Input a int num: ");
    int num=in.nextInt();
    System.out.println("Input a double num: ");
    double numb=in.nextDouble();
    System.out.println("Input a string: ");
    String str = in.nextLine();
  
  }
}