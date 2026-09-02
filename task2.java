import java.util.Scanner;

public class task2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter The Elements:");

        for(int i = 0; i < n ; i++)
      {

       arr[i] = sc.nextInt();

        
    }
    System.out.println("Enter Index");
    int index = sc.nextInt();

    System.out.println(arr[index - 1]);
}
}