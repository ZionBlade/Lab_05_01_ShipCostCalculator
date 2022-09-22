public class Main
{
    public static void main(String[] args)
    {
        double itemCost = 90;
        double shipCost;
        double total;

        shipCost = itemCost * 0.02;
        total = shipCost + itemCost;

        System.out.println("what is the item cost?");

        if (itemCost >= 100)
            System.out.println("Your shipping is free!");
        else {
            System.out.println("Your shipping cost is " + shipCost);
            System.out.println("Your total cost is " + total);
        }

    }
}