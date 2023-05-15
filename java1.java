import java.util.Scanner;
public class java1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n1= sc.nextInt();
int n2= sc.nextInt();
System.out.println("Before swapping no. are :"+n1+"  "+n2);
int temp = n1;
n1 =n2;
n2 = temp;
System.out.println("After swapping no. are :"+n1+"  "+n2);
sc.close();
}
}