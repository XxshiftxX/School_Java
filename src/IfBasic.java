import java.util.Scanner;

public class IfBasic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if(score > 80)
            System.out.println("합격이닭! 오늘 저녁은 치킨이닭!");
        else
            System.out.println("괜찮아, 그런 날도 있는거지 뭐.");
    }
}
