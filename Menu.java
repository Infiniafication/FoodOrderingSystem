import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 * The Menu class that contains the list of Food.
 * 
 * @author Isaac Yong 
 * @version 1.00
 */
public class Menu
{
    public static void main(String[] args)
    {
        int act;
        ArrayList<Food> foodList = new ArrayList<Food>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter action: ")
        System.out.println("1 - Add new food to the menu");
        System.out.println("2 - Remove food from the menu");
        System.out.println("3 - Edit existing food information");
        System.out.println("4 - Save current list to a text file");
        System.out.println("5 - Retrieve food list from existing text file");
        act = sc.nextInt();
        if(act==1)
        {
            Food menuItem = new Food();
            foodList.add(menuItem);
        }
        else if(act==4)
        {
            
            String outputList;
            for(Food fd:foodList)
            {
                outputList+=fd.fStr();
            }
        }
        else if(act==2||act==3||act==5)
        {
            System.out.println("Still under construction!");
        }
    }
}
