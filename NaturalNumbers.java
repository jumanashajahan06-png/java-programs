import java.util.Scanner;


public class NaturalNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the num N: ");
    int N = sc.nextInt();

    System.out.println("Enter the num from 1 to " + N +" :");
      for(int i=1; i<=N; i++){
      System.out.print(i + " ");
      }      
    }
}