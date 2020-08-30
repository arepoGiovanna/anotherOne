import java.util.*;
public class testFoodelivery{
    public static void main(String[] args){

        FoodeliverMenu f = new FoodeliverMenu();
        FoodeliverMenu t = new FoodeliverMenu();
        Restaurant r = new Restaurant();


        Scanner scan = new Scanner(System.in);
        System.out.println("Choose role");
        System.out.println("1. Customer");
        System.out.println("2. Restaurant");
        System.out.print("> ");

        int chooseRole = scan.nextInt();
      //  String[] theRestaurants = new String[3]{"Doofenshmirtz Evil Restaurant", "Krusty Krab", "Batman's Teppanyaki"};
        while(true){
        if(chooseRole == 1){
            System.out.print("\n");
            System.out.println("===============================");
            System.out.println("Please choose action");
            System.out.println("1. View restaurant and foods");
            System.out.println("2. View payment");
            System.out.println("3. View order history");
            System.out.println("===============================");
            System.out.println(" ");
            System.out.print("> ");
            int chooseAction = scan.nextInt();
            switch(chooseAction){
                case 1: System.out.println("Still in development");
                        break;
                case 2: System.out.println("Still in development");
                        break;
                case 3: System.out.println("Still in development");
                        break;
                default: System.out.println("Error: Please enter only 1, 2, or 3.");
            }
        }else if(chooseRole == 2){
            System.out.print("\n");
            System.out.println("Please choose action");
            System.out.println("1. View Menu");
            System.out.println("2. Update Menu");
            System.out.print("> ");
            int chooseAction2 = scan.nextInt();
            
            switch(chooseAction2){
                case 1: //r.showFood();
                        //r.showRestaurant(chooseAction2);
                        //f.showFood();
                       // Scanner i = new Scanner(System.in);
                       System.out.print("\n");
                       System.out.println("===============================");
                        System.out.println("Please choose your restaurant:");
                        System.out.println("1. Doofensmirtz Evil Restaurant");
                        System.out.println("2. Krusty Krab");
                        System.out.println("3. Batman's Teppanyaki");
                        System.out.println("===============================");
                        System.out.print("\n");
                        System.out.print("> ");
                        int p = scan.nextInt();
                        if(p == 1){
                            System.out.print("\n");
                            System.out.println("Doofenshmirtz Evil Restaurant");
                            System.out.println("===============================");
                            System.out.println("||           Food            ||");
                            System.out.println("===============================");
                            
                            f.showFood(p);
                            
                            System.out.println("===============================");
                            System.out.println("||           Drink           ||");
                            System.out.println("===============================");
                            
                            t.showDrink(p);
                            break;
                        }else if(p == 2){
                            System.out.print("\n");
                            System.out.println("Krusty Krab");
                            System.out.println("===============================");
                            System.out.println("||           Food            ||");
                            System.out.println("===============================");
                            
                            f.showFood(p);
                            
                            System.out.println("===============================");
                            System.out.println("||           Drink           ||");
                            System.out.println("===============================");
                            
                            t.showDrink(p);

                            break;
                        }else if(p == 3){
                            System.out.print("\n");
                            System.out.println("Batman's Teppanyaki");
                            System.out.println("===============================");
                            System.out.println("||           Food            ||");
                            System.out.println("===============================");
                            
                            f.showFood(p);
                            
                            System.out.println("===============================");
                            System.out.println("||           Drink           ||");
                            System.out.println("===============================");
                            
                            t.showDrink(p);

                            break;
                        }else{
                            System.out.print("Error Please enter the correct key.");
                        }
                        break;
                case 2: System.out.print("\n");
                        System.out.println("===============================");
                        System.out.println("Please choose your restaurant:");
                        System.out.println("1. Doofensmirtz Evil Restaurant");
                        System.out.println("2. Krusty Krab");
                        System.out.println("3. Batman's Teppanyaki");
                        System.out.println("===============================");
                        System.out.print("\n");
                        System.out.print("> ");
                        int q = scan.nextInt();
                        if(q == 1){
                            System.out.print("\n");
                            System.out.println("Doofenshmirtz Evil Restaurant");
                            System.out.println("\nPlease update your menu.");
                            String doofIn = scan.nextLine();
                            String doofIn2 = scan.nextLine();
                            String doofIn3 = scan.nextLine();
                            double d = Double.parseDouble(doofIn3);
                            r.updateMenuDoofFood(doofIn, doofIn2, d);

                            r.viewMenuDF();
                        }
                        break;
                default: System.out.println("Please choose a restaurant to update its.");
            }
        }else if(chooseRole == 2){
            System.out.println("Still in development");
        }else{
            System.out.println("Error: Please enter only 1, 2, or 3.");
        }
     }
    }
}
