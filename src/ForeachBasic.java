public class ForeachBasic {
    enum Week {월, 화, 수, 목, 금, 토, 일}
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5, 6};
        String[] strings = {"안", "녕"};

        for(int A : nums)
            System.out.println(A);

        for (String A: strings)
            System.out.println(A);

        for(Week day: Week.values())
            System.out.println((day));

        System.out.println(args[0]);
    }
}
