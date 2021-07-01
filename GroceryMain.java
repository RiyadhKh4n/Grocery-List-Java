package Section8;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryMain{
    
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    
    public static void main(String [] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                
                case 1:
                    groceryList.printGroceryList();
                    break;
            
                case 2:
                    addItem();
                    break;
                
                case 3:
                    modifyItem();
                    
                case 4:
                    removeItem();
                    break;
                    
                case 5:
                    seachForItem();
                    break;
                
                case 6:
                    processArrayList();
                    break;
                    
                    
                case 7:
                    quit = true;
                    break;
            } 
        }
    }

public static void printInstructions(){
    System.out.println("\nPress ");
    System.out.println("\t 0 - To print the list of grocery items: ");
    System.out.println("\t 1 - To print the list of grocery items: ");
    System.out.println("\t 2 - To add an item to the list: ");
    System.out.println("\t 3 - To modify an item in the list: ");
    System.out.println("\t 4 - To remove an item from the list: ");
    System.out.println("\t 5 - To search for an item in the list: ");
    System.out.println("\t 6 - To process the array list: ");
    System.out.println("\t 7 - To quit the application: ");
}

public static void addItem(){
    System.out.print("Please enter the item: ");
    groceryList.addItem(scanner.nextLine());
}

public static void modifyItem(){
    System.out.println("Current item name: ");
    String itemNo = scanner.nextLine();
    System.out.println("Enter new item: ");
    String newItem = scanner.nextLine();
    groceryList.modifyList(itemNo, newItem);
}

public static void removeItem(){
    System.out.println("Enter item name: ");
    String itemNo = scanner.nextLine();
    groceryList.removeItem(itemNo);
}

public static void seachForItem(){
    System.out.print("Item to seach for: ");
    String searchItem = scanner.nextLine();
    
    if(groceryList.onFile(searchItem)) {
        System.out.println("Found " + searchItem);
    }else{
        System.out.println(searchItem + ", is not in the list");
    }
}

public static void processArrayList(){
    ArrayList<String> newArray = new ArrayList<String>();
    newArray.addAll(groceryList.getGroceryList());
    
    ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
    
    String[] myArray = new String[groceryList.getGroceryList().size()];
    myArray = groceryList.getGroceryList().toArray(myArray);
}

}