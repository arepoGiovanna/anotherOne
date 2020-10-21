//St. Isidore of Seville and Blessed Carlo Acutis
// Help me and guide me to do this program. Amen.



import java.util.Scanner;
import java.util.*; //ArrayList
                    //Collections
                    //LinkedList
import java.io.*;  //port every save io files in here
import java.io.IOException;
import java.nio.file.Files; //import java.nio.file.*;
import java.nio.file.Paths;


public class AdminFood{

    public AdminFood(){}




    //Most likely mao add rider here need to use the csv file thing di sini.

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        Rider kamenRider = new Rider(702, "Jotaro", "0102152907", 30);
        Rider mcRider = new Rider(703, "John", "01023646", 25);
        Rider theRider = new Rider(704, "Bruce Wayne", "94536723",40);
        
        ArrayList<Rider> testingRider = new ArrayList<Rider>();

        System.out.println("Hello Admin. Please choose your option: ");
        System.out.println(" ");
        System.out.println("1. ADDING RIDERS");
        System.out.println("2. VIEW RIDER QUEUE");
        System.out.println("3. VIEW ORDER HISTORY");
        System.out.println("4. VIEW ORDER STATISTICS");
        System.out.println("5. DELETE AND FIRE THE RIDER");
        System.out.print("> ");
        int chooseOption = input.nextInt();

        switch (chooseOption) {
            case 1:
                System.out.println("ADDING RIDERS");
                System.out.print("Enter new Rider ID :: ");
                int addRiderID = input.nextInt();

                System.out.print("Enter new Rider name :: ");
                String addRiderName = input.nextLine();
                //addRiderName = input.nextLine(); //Takut nanti addRiderName kena ignored

                System.out.print("Enter new Rider phone number :: ");
                String addRiderPhoneNum = input.nextLine();
                input.nextLine();
                testingRider.add(new Rider(addRiderID, addRiderName, addRiderPhoneNum));
                System.out.println("Saving...");
                System.out.println("NEW RIDERS ADDED!");
                System.out.println(testingRider);
                System.out.println();

                //addRiders(testingRider);

                break;
            case 2: System.out.println("Not available");
                    break;
            case 3: System.out.println("Not available");
                    break;

            case 4: System.out.println("Please select option:");
                    System.out.println("1. RIDER WITH MOST DELIVERIES");
                    System.out.println("2. MOST POPULAR RESTAURANT");
                    System.out.print("> ");
                    int statisticsChoice = input.nextInt();

                    switch(statisticsChoice){
                        case 1: System.out.println("RIDER WITH MOST DELIVERIES");
                                System.out.println("");
                                System.out.println("");
                                int results = kamenRider.compareTo(mcRider);

                                if(results < 0 ){
                                    System.out.println("RIDER: " + kamenRider.getRiderName());
                                }else if(results > 0){
                                    System.out.println("RIDER: " + mcRider.getRiderName());
                                }else
                                    System.out.println("Almost all riders achieved the same goal");
                                break;
                        case 2: System.out.println("Not available yet.");
                                break;
                        default: System.out.println("Error: Please choose an option.");
                    }
                    break;


            default: System.out.println("Error: Please choose an option.");
                
        }

        /*
        System.out.println("What return: " + kamenRider.compareTo(mcRider));
        int results = kamenRider.compareTo(mcRider);

        if(results > 0){
            System.out.println("Testing1");
        }else if(results < 0 ){
            System.out.println("Testing2");
        }else
            System.out.println("Testing3");
            */


        /*
        Scanner inputRider = new Scanner(System.in);

        //Set Rider ID
        System.out.print("Enter ID of rider: ");
        int IDofRider = inputRider.nextInt();
        kamenRider.setRiderID(IDofRider);
        
        //Set Rider name
        System.out.print("Enter name of rider: ");
        inputRider.nextLine();
        String nameOfRider = inputRider.nextLine();
        kamenRider.setRiderName(nameOfRider);

        //Set rider phone number
        System.out.print("Enter phone number of rider: ");
        String phoneNumberofRider = inputRider.nextLine();
        kamenRider.setRiderPhoneNumber(phoneNumberofRider);

        System.out.print("ID of rider: " + kamenRider.getRiderID() + "\n");  
        System.out.print("Name of rider: " + kamenRider.getRiderName() + "\n");        
        System.out.print("Phone number of rider: " + kamenRider.getRiderPhoneNumber() + "\n");
        */

    }

    private static void addRiders(ArrayList<Rider> testingRider) throws IOException{ 
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < testingRider.size(); i++){
            sb.append(testingRider.get(i).toCSVString() + "\n");

        }
        Files.write(Paths.get("riderLists.csv"), sb.toString().getBytes());

        

        System.out.println("Testing");
    }


    public void riderAtTheMoment(){// May test in the futures
        System.out.println("Testing.");
    }


}