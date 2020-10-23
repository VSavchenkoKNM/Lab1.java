/** 
 * @author Валерій
 * @version 1.0
*/
import java.util.Scanner;

public class Goodtask{
  public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  /** 
   * main func that gets two Integers
   * calls two other functions and starts counting: <b>counter1</b> <b>counter2</b> <b>fibostart</b>
   */
  System.out.println("First: ");
  int num=in.nextInt();
  System.out.println("Last: ");
  int numb=in.nextInt();
  counter1(num,numb);
  counter2(num,numb);
  fibostart(num,numb);
  }
/**
 * after chosing smallest num starts printing sequence (odd nums)
 * in the end outputs the Summary of sequence
 * /
  public static void counter1(int num,int numb){
  System.out.println("Start from smallest");
 int sum=0;
  if ((num%2)!=0){
    for (int i=num;i<numb+1;i=i+2){
    sum=sum+i;
    System.out.println(i);
    }
  }else{
  for (int i=num+1;i<numb+1;i=i+2){
    sum=sum+i;
    System.out.println(i);
    }
  }
  System.out.println("Finished");
  System.out.printf("Sum is: %d",sum);
  System.out.println();
  }
 

/**
 * similar to previous func, chose biggest from two
 * Then prints all pair nums and their Summary
 */
public static void counter2(int numa,int numb){
  System.out.println("Start from biggest");
  int sum=0;
  if((numb%2)==0){
   for(int i=numb;i>=numa;i=i-2){
   sum=sum+i;
     System.out.println(i);
    }
  }else{
    for (int i=numb-1;i>=numa;i=i-2){
    sum=sum+i;
      System.out.println(i);
    }
        }
System.out.println("Finished");
System.out.printf("Sum is: %d", sum);
System.out.println();
}
/**
 * this func launch procces of counting <i>Fibbonachi Sequence</i>
 *  firstly looks for biggest paired and unpaired num
 */
public static void fibostart(int na,int nb){
int parne;
int nparne;
if (nb%2==0){
parne=nb;
nparne=nb-1;
}
else{
  parne=nb-1;
  nparne=nb;
}
System.out.printf("Naibilshe parne = %d",parne);
System.out.println();
System.out.printf("Naibilshe neparne = %d",nparne);
if (parne>nparne){
fibonachi(parne,nparne);
}else{
fibonachi(nparne,parne);
/**
 * sending our data to func <b>fibonachi</b>
 */
}


}
/**
 *  Gets int <b>s</b> to define quantity
 *  Main functionality is built on cycle <b><i>while</i></b>
 */
public static void fibonachi(int a, int b){
  Scanner in = new Scanner(System.in);
 int sum=0;
 int counter=0;
  System.out.printf("\nSkilki znajti:  ");
 int s=in.nextInt();
 System.out.println();
  while(counter<s){
  System.out.printf("a, b = %d , %d \n",a,b);
 
  sum=a+b;
  a=b;
  b=sum;
  System.out.printf("Sum = %d \n",sum);
 
  counter++;
  }
 
}
}