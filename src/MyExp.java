public class MyExp
{
    int base;
    int exp;
    int getValue()
    {
        int res = 1;
        for(int i = 0; i < exp; i++)
        {
            res *= base;
        }
        return res;
    }

    public static void main(String[] args)
    {
        MyExp number1 = new MyExp();
        number1.base = 2;
        number1.exp = 3;

        MyExp number2 = new MyExp();
        number2.base = 3;
        number2.exp = 4;

        System.out.println(number1.base + "의 " + number1.exp + "승은 " + number1.getValue());
        System.out.println(number2.base + "의 " + number2.exp + "승은 " + number2.getValue());
    }
}
