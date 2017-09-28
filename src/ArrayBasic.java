import java.util.Scanner;

public class ArrayBasic {

    public static void main(String[] args)
    {
        /*
        Scanner s = new Scanner(System.in);
        int input[] = new int[5];
        int max = 0;

        for(int i = 0; i < 5; i++)
        {
            input[i] = s.nextInt();
            if(max < input[i])
                max = input[i];
        }
        System.out.println(max);
        */

        Scanner s = new Scanner(System.in);
        int input[] = new int[5];
        double ave = 0;

        for(int i = 0;i < 5; i++)
            input[i] = s.nextInt();

        for(int i = 0; i < 5; i++)
            ave += input[i];

        System.out.println(ave/input.length);
    }

}
