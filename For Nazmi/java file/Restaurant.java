import java.util.*;


public class Restaurant {
    
    protected static ArrayList<String> codeDoofFoodDrink = new ArrayList<String>();
    protected static ArrayList<String> codeKrabbyFoodDrink = new ArrayList<String>();
    protected static ArrayList<String> codeBatFoodDrink = new ArrayList<String>();
   
    protected static ArrayList<String> nameDoofFoodDrink = new ArrayList<String>();
    protected static ArrayList<String> nameKrabbyFoodDrink = new ArrayList<String>();
    protected static ArrayList<String> nameBatFoodDrink = new ArrayList<String>(); 

    protected static ArrayList<Double> PriceDoofFood = new ArrayList<Double>();
    protected static ArrayList<Double> PriceKrabbyFood = new ArrayList<Double>();
    protected static ArrayList<Double> PriceBatFood = new ArrayList<Double>();
    //protected String[] foodItems;
    

    private static boolean status;
    
    public Restaurant(){
        //super(foodId, foodName, foodPrice);
    }  //Default constructor

    public void itsIn(){
        codeDoofFoodDrink.add("DE1");     // E means Eat; D means Drink
        codeDoofFoodDrink.add("DE2");
        codeDoofFoodDrink.add("DE3");
        codeKrabbyFoodDrink.add("KE1");
        codeKrabbyFoodDrink.add("KE2");
        codeKrabbyFoodDrink.add("KE3");
        codeBatFoodDrink.add("BE1");
        codeBatFoodDrink.add("BE2");
        codeBatFoodDrink.add("BE3");

        nameDoofFoodDrink.add("Chicken Wing-inator");
        nameDoofFoodDrink.add("Fish and Chips-inator");
        nameDoofFoodDrink.add("Nasi Lemak-inator");
        nameKrabbyFoodDrink.add("Krabby Patty");
        nameKrabbyFoodDrink.add("Krabby Pizza");
        nameKrabbyFoodDrink.add("French Pirate Fries");
        nameBatFoodDrink.add("Bat-Fried Rice");
        nameBatFoodDrink.add("Bat-Salmon Terriyaki");
        nameBatFoodDrink.add("Bat-Sashimi");

        PriceDoofFood.add(5.00);
        PriceDoofFood.add(33.00);
        PriceDoofFood.add(12.00);
        PriceKrabbyFood.add(100.99);  //Spongebob reference
        PriceKrabbyFood.add(75.30);
        PriceKrabbyFood.add(24.00);
        PriceBatFood.add(15.46);
        PriceBatFood.add(20.46);
        PriceBatFood.add(60.46);
    }

    //Doofenshmirz
    public void addnewDoofMenu(String codeDoof, String DoofFood, double doofPrice){
        codeDoofFoodDrink.add(codeDoof);
        nameDoofFoodDrink.add(DoofFood);
        PriceDoofFood.add(doofPrice);
    }

    public void deleteItemDoof(int index){
        codeDoofFoodDrink.remove(index-1);
        nameDoofFoodDrink.remove(index-1);
        PriceDoofFood.remove(index-1);
    }

    public void updateDoofMenu(int index, String codeDoof, String DoofFood, double doofPrice){
        codeDoofFoodDrink.set(index-1, codeDoof);
        nameDoofFoodDrink.set(index-1, DoofFood);
        PriceDoofFood.set(index-1, doofPrice);
    }

    //Krusty Krab
    public void addnewKrabbyMenu(String codeKrabs, String KrabsFood, double KrabsPrice){
        codeKrabbyFoodDrink.add(codeKrabs);
        nameKrabbyFoodDrink.add(KrabsFood);
        PriceKrabbyFood.add(KrabsPrice);
    }

    public void deleteItemKrabby(int index){
        codeKrabbyFoodDrink.remove(index-1);
        nameKrabbyFoodDrink.remove(index-1);
        PriceKrabbyFood.remove(index-1);
    }

    public void updateKrabbyMenu(int index, String codeKrabs, String KrabsFood, double KrabsPrice){
        codeKrabbyFoodDrink.set(index-1, codeKrabs);
        nameKrabbyFoodDrink.set(index-1, KrabsFood);
        PriceKrabbyFood.set(index-1, KrabsPrice);
    }

    //Batman 
    public void addnewBatMenu(String codeBat, String batFood, double batPrice){
        codeBatFoodDrink.add(codeBat);
        nameBatFoodDrink.add(batFood);
        PriceBatFood.add(batPrice);
    }

    public void deleteItemBat(int index){
        codeBatFoodDrink.remove(index-1);
        nameBatFoodDrink.remove(index-1);
        PriceBatFood.remove(index-1);
    }

    public void updateBatMenu(int index, String codeKrabs, String KrabsFood, double KrabsPrice){
        codeBatFoodDrink.set(index-1, codeKrabs);
        nameBatFoodDrink.set(index-1, KrabsFood);
        PriceBatFood.set(index-1, KrabsPrice);
    }
    
    public void showDoofFood(int action){
        for(int i = 0; i<codeDoofFoodDrink.size() && i < nameDoofFoodDrink.size() && i < PriceDoofFood.size(); i++){
            System.out.print((i+1) + ". ");
            System.out.print(codeDoofFoodDrink.get(i) + " ");
            System.out.print(nameDoofFoodDrink.get(i) + " ");
            System.out.println("RM " +  PriceDoofFood.get(i) + " ");

        }
    }
    public void showKrabbyFood(int action){
        for(int i = 0; i<codeDoofFoodDrink.size() && i < nameDoofFoodDrink.size() && i < PriceDoofFood.size(); i++){
            System.out.print((i+1) + ". ");
            System.out.print(codeKrabbyFoodDrink.get(i) + " ");
            System.out.print(nameKrabbyFoodDrink.get(i) + " ");
            System.out.println("RM " +  PriceKrabbyFood.get(i) + " ");

        }
    }
    public void showBatFood(int action){
        for(int i = 0; i< codeDoofFoodDrink.size() && i < nameDoofFoodDrink.size() && i < PriceDoofFood.size(); i++){
            System.out.print((i+1) + ". ");
            System.out.print(codeBatFoodDrink.get(i) + " ");
            System.out.print(nameBatFoodDrink.get(i) + " ");
            System.out.println("RM " +  PriceDoofFood.get(i)  +  " ");

        }
    }


}
