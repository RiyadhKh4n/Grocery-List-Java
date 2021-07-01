package Section8;

import java.util.ArrayList;

public class GroceryList{
    private ArrayList<String> groceryList = new ArrayList<String>();
    
    public void addItem(String item){
        groceryList.add(item);
    }
    
    public ArrayList<String> getGroceryList(){
        return groceryList;
    }
    
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in the list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    
    public void modifyList(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyList(position,newItem);
        }
    }
    
    private void modifyList(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }
    
    public void removeItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeItem(position);
        }
    }
    
    private void removeItem(int position){
        groceryList.remove(position);
    }
    
    private int findItem(String searchItem){
       return groceryList.indexOf(searchItem);      
    }
    
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        
        return false;
    }
}