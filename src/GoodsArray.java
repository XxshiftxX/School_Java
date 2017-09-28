import java.util.Scanner;

public class GoodsArray {
    public static void main(String[] args)
    {
        Goods[] goodsArray = new Goods[3];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < goodsArray.length; i++)
        {
            String name = scanner.next();
            int price = scanner.nextInt();
            int stock = scanner.nextInt();
            int sold = scanner.nextInt();
            goodsArray[i] = new Goods(name, price, stock, sold);
        }

        for(int i = 0; i < goodsArray.length; i++)
        {
            System.out.println(goodsArray[i].name + " " + goodsArray[i].price + " " + goodsArray[i].numberOfStock + " " + goodsArray[i].sold);
        }
    }
}
