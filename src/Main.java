import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double itemPrice = 0.0;
        double SHIP_PERCENT = 0.02;
        double totalPrice = 0.0;
        double shipCost = 0.0;

        System.out.print("Enter the item price of the item: ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= 100.00) {
                System.out.println("Shipping is free because the item is over $100!");
            }
            else
            {
                shipCost = itemPrice * SHIP_PERCENT;
                totalPrice = itemPrice + shipCost;
                System.out.println("An item that cost $" + itemPrice + " has a shipping cost of $" +shipCost + " and a total of $" + totalPrice);
            }
        }
    }
}