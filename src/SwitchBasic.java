import java.util.Scanner;

public class SwitchBasic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int Score = sc.nextInt();
        char grade;

        if(Score > 80)
            grade = 'A';
        else if(Score > 70)
            grade = 'B';
        else if (Score > 60)
            grade = 'C';
        else
            grade = 'F';

        switch(grade)
        {
            case 'A':
            case 'B':
                System.out.println("참 잘하셨습니다.");
                break;
            case 'C':
                System.out.println("좀 더 노력하세요.");
                break;
            case 'F':
                System.out.println("다음 학기에 다시 수강하세요.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
                break;
        }

        System.out.println(grade);
    }
}
