import java.util.Scanner;

public class WhileBasic {
    public static void main(String[] args)
    {
        /*
        int input = 1, sum = 0, time = 0;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            input = sc.nextInt();
            if(input != 0)
                break;

            sum += input;
            time++;
        }
        System.out.println(sum/time);
        */

        char Output = 'Q';
        while(Output <= 'Z')
        {
            System.out.print(Output);
            Output++;
        }
    }
}
