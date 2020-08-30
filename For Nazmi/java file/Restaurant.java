import java.util.*;


public class Restaurant {
    ArrayList<FoodeliverMenu> DoofFood = new ArrayList<FoodeliverMenu>();
    ArrayList<FoodeliverMenu> KrabbyFood = new ArrayList<FoodeliverMenu>();
    ArrayList<FoodeliverMenu> BatFood = new ArrayList<FoodeliverMenu>();

    //protected String[] foodItems;
    
    private boolean status;
    
    public Restaurant(){
        //super(foodId, foodName, foodPrice);
    }  //Default constructor

    public Restaurant(String foodId, String foodName, int foodPrice, boolean orderStatus){
        //super(foodId, foodName, foodPrice);
        this.status = orderStatus;
    }

    public void updateMenuDoofFood(String foodId, String foodName, int foodPrice){
        DoofFood.add(new FoodeliverMenu(foodId, foodName, foodPrice));
    }

    public void updateMenuKrabbyFood(String foodId, String foodName, int foodPrice){
        KrabbyFood.add(new FoodeliverMenu(foodId, foodName, foodPrice));
    }

    public void updateMenuBatFood(String foodId, String foodName, int foodPrice){
        BatFood.add(new FoodeliverMenu(foodId, foodName, foodPrice));
    }

    public void viewMenuDF(){
        for(int i = 0; i < DoofFood.size(); i++){
            System.out.println(DoofFood.get(i));
        }
    }
    public boolean updateMenu(){
        
        
        if(status == true){
            System.out.println("Pick-up order is ready :D !!!");
        }else if(status == false){
            System.out.println("Your food is now cooking B) !!!");
        }
        return status;
    }
}