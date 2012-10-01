import java.util.Scanner;
/**
 * The Food class to create new Food.
 * 
 * @author Isaac Yong 
 * @version 1.00
 */
public class Food
{
    private String name;
    private double price;
    private String category;
    private String subCategory;

    public Food(String name, double price, String category, String subCategory)
    {
        this.name = name;
        this.price = price;
        this.category = category;
        this.subCategory = subCategory;
    }

    public Food()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>>>>>>>> Creating new menu item <<<<<<<<<<");
        System.out.println();
        System.out.println("Enter food name: ");
        this.name = sc.nextLine();
        System.out.println("Enter price: ");
        this.price = sc.nextDouble();
        System.out.println("Enter category: ");
        System.out.println("1 - Appetizer");
        System.out.println("2 - Main Course");
        System.out.println("3 - Dessert");
        System.out.println("4 - Side Order");
        System.out.println("5 - Beverage");
        if(sc.nextInt()==1)
            this.category = "Appetizer";
        else if(sc.nextInt()==2)
            this.category = "Main Course";
        else if(sc.nextInt()==3)
            this.category = "Dessert";
        else if(sc.nextInt()==4)
            this.category = "Side Order";
        else if(sc.nextInt()==5)
            this.category = "Beverage";
        System.out.println("Enter sub-category");
        this.subCategory = sc.nextLine();
    }
    /** Returns string for output to txtfile with "---"" as the separator */
    public String fStr()
    {
        return("---" + this.name + "---" + this.price + "---" + this.category + "---" + this.subCategory + System.getProperty("line.separator"));
    }
}
