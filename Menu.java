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
    /** Records and checks whether it is the first time entering the actionMenu
      * to decide whether or not to initialise the ArrayList.
      */
    private Boolean check=true;

    public void initList()
    {
        ArrayList<Food> foodList = new ArrayList<Food>();
        this.check=false;
    }

    public void actionMenu()
    {
        if(this.check==true)
            initList();
        int act;
        String confirmAct;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter action: ")
            System.out.println("1 - Add new food to the menu");
            System.out.println("2 - Remove food from the menu");
            System.out.println("3 - Edit existing food information");
            System.out.println("4 - Save current list to a text file");
            System.out.println("5 - Retrieve food list from existing text file");
            System.out.println("0 - Exit to Main Menu");
            act = sc.nextInt();
            (while (act!=1 && act!=2 && act!=3 && act!=4 && act!=5 && act!=0))
                System.out.println("You have entered an invalid value. Please try again.");
        }(while (act!=1 && act!=2 && act!=3 && act!=4 && act!=5 && act!=0))
        if(act==1)
        {
            Food menuItem = new Food();
            foodList.add(menuItem);
            System.out.println("Item added to list successfully!");
            actionMenu();
        }
        else if(act==4)
        {
            String outputList;
            for(Food fd:foodList)
            {
                outputList+=fd.fStr();
            }
            writeBin(outputList);
            System.out.println("Returning to action menu.");
            actionMenu(); 
        }
        else if(act==5)
        {
            System.out.println("All food in the current food list will be cleared. Continue? (Y/N)");
            confirmAct = sc.nextLine();
            while(confirmAct.toUpperCase()!="Y"||confirmAct.toUpperCase()!="N")
            {
                System.out.println("You have entered an invalid value (" + confirmAct + "). Please input an appropriate value of either Y or N only.");
                confirmAct = sc.nextLine();
            }
            if(confirmAct.toUpperCase()=="Y")
            {
                System.out.println("Purging will now commence...");
                initList();
                readBin();
                System.out.println("Returning to action menu.");
                actionMenu(); 
            }
            else if(confirmAct.toUpperCase()=="N")
            {
                System.out.println("Food list has not been cleared. You will now be redirected to the action menu.");
                actionMenu();
            }
        }
        else if(act==2||act==3)
        {
            System.out.println("Still under construction!");
            actionMenu();
        }
        else{}
    }

    public void writeBin(String outputList) throws FileNotFoundException, IOException
    {
        try
        {
            DataOutputStream outData = new DataOutputStream(new FileOutputStream("Menu.bin"));
            System.out.println("Writing to file...");
            outData.writeChars(outputList);
            System.out.println("File output successful!");
            outData.close();
        }
        catch(IOException e)
        {
            System.out.println("Failed to write to file! (Error: IOException)");
            e.printStackTrace();
        }
        finally
        {
            if(outData!=null)
                outData.close();
        }
    }

    public void readBin() throws FileNotFoundException, IOException
    {
        try
        {
            DataInputStream inData = new DataInputStream(new FileInputStream("Menu.bin"));
            int tmp;
            while((tmp=in.read())!=-1)
            {
                Food readItem = new Food();
                foodList.add(menuItem);
            }
        }
        catch(IOException e)
        {
            System.out.println("Failed to read from file! (Error: IOException)");
            e.printStackTrace();
        }
        finally
        {
            System.out.println("File read successfully!");
            if(inData!=null)
                inData.close();
        }
    }
}
