public class Goods {
    String name;
    int price;
    int numberOfStock;
    int sold;

    Goods(String name, int price, int numberOfStock, int sold)
    {
        this.name = name;
        this.price = price;
        this.numberOfStock = numberOfStock;
        this.sold = sold;
    }

    String GetName() { return name; }
    int GetPrice() { return  price; }
    int GetNumberOfStock() { return numberOfStock; }
    int GetSold() { return  sold; }
}
