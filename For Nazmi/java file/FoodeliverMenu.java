import java.util.*;

//St Isidore of Seville, guide us through this program.

public class FoodeliverMenu{
    protected String foodId;
    protected String foodName;
    protected int foodPrice;

    //protected boolean status
//    protected String Selection;


    public FoodeliverMenu(){ }

    public FoodeliverMenu(String foodId, String foodName, int foodPrice){
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }



    public void showFood(int chooseRestaurant){
        ArrayList<String> codeDoofFood = new ArrayList<String>();
        ArrayList<String> codeKrabbyFood = new ArrayList<String>();
        ArrayList<String> codeBatFood = new ArrayList<String>();

        ArrayList<String> nameDoofFood = new ArrayList<String>();
        ArrayList<String> nameKrabbyFood = new ArrayList<String>();
        ArrayList<String> nameBatFood = new ArrayList<String>();


        ArrayList<Double> PriceDoofFood = new ArrayList<>();
        ArrayList<Double> PriceKrabbyFood = new ArrayList<>();
        ArrayList<Double> PriceBatFood = new ArrayList<>();

        codeDoofFood.add("DE1");     // E means Eat; D means Drink
        codeDoofFood.add("DE2");
        codeKrabbyFood.add("KE1");
        codeBatFood.add("BE1");

        nameDoofFood.add("Chicken Wing-inator");
        nameDoofFood.add("Fish and Chips-inator");
        nameKrabbyFood.add("Krabby Patty");
        nameBatFood.add("Bat-Fried Rice");

        PriceDoofFood.add(5.00);
        PriceDoofFood.add(33.00);
        PriceKrabbyFood.add(100.99);  //Spongebob reference
        PriceBatFood.add(15.46);


        if(chooseRestaurant == 1){
            
            for(int i = 0; i < nameDoofFood.size() && i < codeDoofFood.size() && i < PriceDoofFood.size(); i++){
                System.out.print(codeDoofFood.get(i) + " ");    
                System.out.print(nameDoofFood.get(i) + " " + " ");
                System.out.print("RM " + PriceDoofFood.get(i) + "\n");
            }
            
        }else if(chooseRestaurant == 2){
            for(int i = 0; i < codeKrabbyFood.size() && i < nameKrabbyFood.size(); i++){
                System.out.print(codeKrabbyFood.get(i) + " ");    
                System.out.print(nameKrabbyFood.get(i) + " " + " ");      
                System.out.print("RM " + PriceKrabbyFood.get(i) + "\n");         
            }
        }else if(chooseRestaurant == 3){
            for(int i = 0; i < codeBatFood.size() && i < nameKrabbyFood.size(); i++){
                System.out.print(codeKrabbyFood.get(i) + " ");    
                System.out.println(nameKrabbyFood.get(i) + " " + " ");
                System.out.print("RM " + PriceKrabbyFood.get(i) + "\n");               
            }
        }


    }

    public void showDrink(int chooseRestaurant){
        ArrayList<String> codeDoofDrink = new ArrayList<String>();
        ArrayList<String> codeKrabbyDrink = new ArrayList<String>();
        ArrayList<String> codeBatDrink = new ArrayList<String>();

        ArrayList<String> nameDoofDrink = new ArrayList<String>();
        ArrayList<String> nameKrabbyDrink = new ArrayList<String>();
        ArrayList<String> nameBatDrink = new ArrayList<String>();

        ArrayList<Double> PriceDoofDrink = new ArrayList<>();
        ArrayList<Double> PriceKrabbyDrink = new ArrayList<>();
        ArrayList<Double> PriceBatDrink = new ArrayList<>();

        codeDoofDrink.add("DD1");       // E means Eat; D means Drink
        codeKrabbyDrink.add("KD1");
        codeBatDrink.add("BD1");

        nameDoofDrink.add("Mango Juice-inator");
        nameKrabbyDrink.add("Krabby Cola");
        nameBatDrink.add("Red Hood's Apple-pie Juice");

        PriceDoofDrink.add(7.00);
        PriceKrabbyDrink.add(61.50);
        PriceBatDrink.add(5.00); 
        if(chooseRestaurant == 1){
            
            for(int i = 0; i < nameDoofDrink.size() && i < codeDoofDrink.size(); i++){
                System.out.print(codeDoofDrink.get(i) + " ");    
                System.out.print(nameDoofDrink.get(i) + " ");
                System.out.print("RM " + PriceDoofDrink.get(i) + " ");
            }
            
        }else if(chooseRestaurant == 2){
            for(int i = 0; i < nameKrabbyDrink.size() && i < codeKrabbyDrink.size(); i++){
                System.out.print(codeKrabbyDrink.get(i) + " ");    
                System.out.print(nameKrabbyDrink.get(i) + " ");
                System.out.print("RM " + PriceKrabbyDrink.get(i) + " ");
            }
           
        }else if(chooseRestaurant == 3){
            for(int i = 0; i < nameBatDrink.size() && i < codeBatDrink.size(); i++){
                System.out.print(codeBatDrink.get(i) + " ");    
                System.out.print(nameBatDrink.get(i) + " ");
                System.out.print("RM " + PriceBatDrink.get(i) + " ");
            }
           
        }

    }

}