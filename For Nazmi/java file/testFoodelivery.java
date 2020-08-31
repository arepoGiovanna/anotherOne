/* 
        Note: I'm just assuming that this class is the main method for the 
        parent class FoodeliverMenu.java. 
*/


import java.util.*;
//import java.io.Printwriter;

public class testFoodelivery{
    public static void main(String[] args) throws java.io.IOException{
        java.io.File file = new java.io.File("testing.txt");
        if(file.exists()){
        }

        java.io.PrintWriter output = new java.io.PrintWriter(file);
        FoodeliverMenu f = new FoodeliverMenu();
        FoodeliverMenu t = new FoodeliverMenu();
        Restaurant r = new Restaurant();


        Scanner scan = new Scanner(System.in);
        r.itsIn();
        System.out.println("Choose role");
        System.out.println("1. Customer");
        System.out.println("2. Restaurant");
        System.out.print("> ");

        int chooseRole = scan.nextInt();
      
        while(true){
        if(chooseRole == 1){
            System.out.print("\n");
            System.out.println("===============================");
            System.out.println("Please choose action");
            System.out.println("1. View restaurant and foods");
            System.out.println("2. View payment");
            System.out.println("3. View order history");
            System.out.println("===============================");
            System.out.print("> ");
            int chooseAction = scan.nextInt();
            switch(chooseAction){
                case 1: System.out.print("\n");
                System.out.println("Doofenshmirtz Evil Restaurant");
                System.out.println("===============================");
                System.out.println("||           Food            ||");
                System.out.println("===============================");
                r.showDoofFood(chooseAction);
                
                System.out.print("\n");
                System.out.println("Krusty Krab");
                System.out.println("===============================");
                System.out.println("||           Food            ||");
                System.out.println("===============================");
                r.showKrabbyFood(chooseAction);

                System.out.print("\n");
                System.out.println("Batman's Teppanyaki");
                System.out.println("===============================");
                System.out.println("||           Food            ||");
                System.out.println("===============================");
                r.showBatFood(chooseAction);
                break;
                case 2: System.out.println("Still in development");
                        break;
                case 3: System.out.println("Still in development");
                        break;
                default: System.out.println("Error: Please enter only 1, 2, or 3.");
            }
        }else if(chooseRole == 2){
            System.out.print("\n");
            System.out.println("===============================");
            System.out.println("Please choose action");
            System.out.println("1. View in the menu");
            System.out.println("2. Add new item in the menu");
            System.out.println("3. Remove an item in the menu");
            System.out.println("4. Update a menu");
            System.out.println("===============================\n");
            System.out.print("> ");
            int chooseAction2 = scan.nextInt();
            
            switch(chooseAction2){
                case 1: 
                        System.out.print("\n");
                        System.out.println("===============================");
                        System.out.println("Please choose your restaurant:");
                        System.out.println("1. Doofensmirtz Evil Restaurant");
                        System.out.println("2. Krusty Krab");
                        System.out.println("3. Batman's Teppanyaki");
                        System.out.println("4. All restaurants");
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
                            r.showDoofFood(p);
                            break;
                        }else if(p == 2){
                            System.out.print("\n");
                            System.out.println("Krusty Krab");
                            System.out.println("===============================");
                            System.out.println("||           Food            ||");
                            System.out.println("===============================");
                            r.showKrabbyFood(p);
                            break;
                        }else if(p == 3){
                            System.out.print("\n");
                            System.out.println("Batman's Teppanyaki");
                            System.out.println("===============================");
                            System.out.println("||           Food            ||");
                            System.out.println("===============================");
                            r.showBatFood(p);


                            break;
                        }else if(p == 4){
                            System.out.print("\n");
                            System.out.println("Doofenshmirtz Evil Restaurant");
                            System.out.println("===============================");
                            System.out.println("||           Food            ||");
                            System.out.println("===============================");
                            r.showDoofFood(p);
                            
                            System.out.print("\n");
                            System.out.println("Krusty Krab");
                            System.out.println("===============================");
                            System.out.println("||           Food            ||");
                            System.out.println("===============================");
                            r.showKrabbyFood(p);
 
                            System.out.print("\n");
                            System.out.println("Batman's Teppanyaki");
                            System.out.println("===============================");
                            System.out.println("||           Food            ||");
                            System.out.println("===============================");
                            r.showBatFood(p);

                            
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
                        int chooseAction3 = scan.nextInt();
                        scan.nextLine();
                        switch(chooseAction3){
                            case 1: r.showDoofFood(chooseAction3);
                                    System.out.println("===============================");
                                    System.out.print("Enter code: ");
                                    String codeDoof = scan.nextLine();
                                    System.out.print("Enter food/drink name: ");
                                    String DoofFood = scan.nextLine();
                                    System.out.print("Enter price: RM ");
                                    double doofPrice = scan.nextDouble();

                                    output.print(codeDoof);
                                    output.print(DoofFood);
                                    output.print(doofPrice);
                                    r.addnewDoofMenu(codeDoof, DoofFood, doofPrice);
                                    r.showDoofFood(chooseAction3);
                                    output.close();
                                    break;

                            case 2: r.showKrabbyFood(chooseAction3);
                                    System.out.println("===============================");
                                    System.out.print("Enter code: ");
                                    String codeKrabs = scan.nextLine();
                                    System.out.print("Enter food/drink name: ");
                                    String KrabsFood = scan.nextLine();
                                    System.out.print("Enter price: RM ");
                                    double KrabsPrice = scan.nextDouble();
            
                                    r.addnewKrabbyMenu(codeKrabs, KrabsFood, KrabsPrice);
                                    r.showKrabbyFood(chooseAction3);
                                    break;
                            case 3: r.showBatFood(chooseAction3);
                                    System.out.println("===============================");
                                    System.out.print("Enter code: ");
                                    String codeBat = scan.nextLine();
                                    System.out.print("Enter food/drink name: ");
                                    String batFood = scan.nextLine();
                                    System.out.print("Enter price: RM ");
                                    double batPrice = scan.nextDouble();
            
                                    r.addnewBatMenu(codeBat, batFood, batPrice);
                                    r.showBatFood(chooseAction3);
                                    break;
                                
                        }    
                        break;    
                                    

                case 3: System.out.print("\n");
                        System.out.println("================================================");
                        System.out.println("Please choose your restaurant to remove an item:");
                        System.out.println("1. Doofensmirtz Evil Restaurant");
                        System.out.println("2. Krusty Krab");
                        System.out.println("3. Batman's Teppanyaki");
                        System.out.println("===============================");
                        System.out.print("\n");
                        System.out.print("> ");
                        int chooseAction4 = scan.nextInt();
                        scan.nextLine();

                        switch(chooseAction4){
                            case 1: System.out.println("=============================================");
                                    r.showDoofFood(chooseAction4);
                                    System.out.println("=============================================");
                                    System.out.println("Please choose one of the menu items in there.");
                                    System.out.println("=============================================");
                                    System.out.print("> ");
                                    int index = scan.nextInt();
                                    
                                    r.deleteItemDoof(index); 
                                    r.showDoofFood(chooseAction4);                                  
                                    break;
                            case 2: System.out.println("=============================================");
                                    r.showKrabbyFood(chooseAction4);
                                    System.out.println("=============================================");
                                    System.out.println("Please choose one of the menu items in there.");
                                    System.out.println("=============================================");
                                    System.out.print("> ");
                                    index = scan.nextInt();
                                    
                                    r.deleteItemKrabby(index); 
                                    r.showKrabbyFood(chooseAction4);  
                                    break;
                            case 3: System.out.println("=============================================");
                                    r.showBatFood(chooseAction4);
                                    System.out.println("=============================================");
                                    System.out.println("Please choose one of the menu items in there.");
                                    System.out.println("=============================================");
                                    System.out.print("> ");
                                    index = scan.nextInt();
                                    
                                    r.deleteItemBat(index); 
                                    r.showBatFood(chooseAction4);
                                    break;
                            default: System.out.println("Error: please choose either 1, 2, or 3");
                        }
                case 4: 
                        System.out.print("\n");
                        System.out.println("===============================================");
                        System.out.println("Please choose your restaurant to update the menu:");
                        System.out.println("1. Doofensmirtz Evil Restaurant");
                        System.out.println("2. Krusty Krab");
                        System.out.println("3. Batman's Teppanyaki");
                        System.out.println("================================================");
                        System.out.print("\n");
                        System.out.print("> ");    
                        int userInput = scan.nextInt();
                        scan.nextLine();
                        switch(userInput){
                            case 1: System.out.println("=============================================");
                                    r.showDoofFood(userInput);
                                    System.out.println("=============================================");
                                    System.out.println("Please choose one of the menu items in there.");
                                    System.out.println("=============================================");
                                    System.out.print("> ");
                                    int index = scan.nextInt();
                                    System.out.print("Please enter new code: ");
                                    scan.nextLine();
                                    String codeDoof = scan.nextLine();
                                    System.out.print("Please enter new food name: ");
                                    
                                    String DoofFood = scan.nextLine();
                                    System.out.print("Please enter new food price: RM ");
                                    double doofPrice = scan.nextDouble();

                                    System.out.println("\n");
                                    r.updateDoofMenu( index, codeDoof, DoofFood, doofPrice);
                                    r.showDoofFood(userInput);                                  
                                    break;


                            case 2:System.out.println("=============================================");
                                    r.showKrabbyFood(userInput);
                                    System.out.println("=============================================");
                                    System.out.println("Please choose one of the menu items in there.");
                                    System.out.println("=============================================");
                                    System.out.print("> ");
                                    index = scan.nextInt();
                                    System.out.print("Please enter new code: ");
                                    scan.nextLine();
                                    String codeKrabs = scan.nextLine();
                                    System.out.print("Please enter new food name: ");
                                    
                                    String KrabsFood = scan.nextLine();
                                    System.out.print("Please enter new food price: RM ");
                                    double KrabsPrice = scan.nextDouble();

                                    System.out.println("\n");
                                    r.updateKrabbyMenu(index, codeKrabs,  KrabsFood, KrabsPrice);
                                    r.showKrabbyFood(userInput);                                  
                                    break;
                            case 3:System.out.println("=============================================");
                                    r.showBatFood(userInput);
                                    System.out.println("=============================================");
                                    System.out.println("Please choose one of the menu items in there.");
                                    System.out.println("=============================================");
                                    System.out.print("> ");
                                    index = scan.nextInt();
                                    System.out.print("Please enter new code: ");
                                    scan.nextLine();
                                    String codeBat = scan.nextLine();
                                    System.out.print("Please enter new food name: ");
                                    
                                    String batFood = scan.nextLine();
                                    System.out.print("Please enter new food price: RM");
                                    double batPrice = scan.nextDouble();

                                    System.out.println("\n");
                                    r. updateBatMenu(index, codeBat, batFood, batPrice);
                                    r.showBatFood(userInput);                                  
                                    break;
                            default:System.out.println("Please choose an item to delete");
                        }            
                        break;
                default: System.out.println("Please choose a restaurant to update its.");        
                        }
                
            }else{
            System.out.println("Error: Please enter only 1, 2, or 3.");
        }
     }
    }

    
}
