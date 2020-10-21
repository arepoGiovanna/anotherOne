import java.util.*;
//St. Isidore of Seville and Blessed Carlo Acutis
// Help me and guide me to do this program. Amen.

public class Rider implements Comparable<Rider>{

    private String riderName;
    private int riderID;
    private String riderPhoneNumber;
    private int numberOfDeliveries;
    

    public Rider(){}
    public Rider(int riderID, String riderName, String riderPhoneNumber, int numberOfDeliveries){
        this.riderName = riderName;
        this.riderID = riderID;
        this.riderPhoneNumber = riderPhoneNumber;
        this.numberOfDeliveries = numberOfDeliveries;
    }

    //This is for adding new rider
    public Rider(int riderID, String riderName, String riderPhoneNumber){
        this.riderName = riderName;
        this.riderID = riderID;
        this.riderPhoneNumber = riderPhoneNumber;
    }


    // Basic rule to set and get the private data from this class
    public void setRiderName(String riderName){ //Set the rider name
        this.riderName = riderName;
    }

    public String getRiderName(){ //Get rider name
        return riderName;
    }

    public void setRiderID(int riderID){ //Set rider ID
        this.riderID = riderID;
    }

    public int getRiderID(){// Get Rider ID
        return riderID;
    }

    public void setRiderPhoneNumber(String riderPhoneNumber){ //Set rider Phone Number
        this.riderPhoneNumber = riderPhoneNumber; 
    }

    public String getRiderPhoneNumber(){ // Get Rider Phone Number
        return riderPhoneNumber;
    }


    public void setNumberOfDeliveries(int numberOfDeliveries){ //Set the number of deliveries made by the riders
        this.numberOfDeliveries = numberOfDeliveries;
    }

    public int getNumberOfDeliveries(){//Get the number of deliveries
        return numberOfDeliveries;
    }
       
    public void deliverOrder(){ //Ini testing ja for the rider in the future
        System.out.println("Delivering order.");
    }


    public String toString(){
        return riderID + " " + riderName + " " + riderPhoneNumber;
    }

    public String toCSVString(){
        return riderID + "," + riderName + "," + riderPhoneNumber;
    }


    @Override //this is a must if implement Comparable
    public int compareTo(Rider o){ //TO COMPARE WHO MADE THE MOST DELIVERIES 
        if(numberOfDeliveries < o.numberOfDeliveries){
            System.out.println("Test1");
            return 1;
        }else if(numberOfDeliveries > o.numberOfDeliveries){
            System.out.println("Test 2");
            return -1;
        }else
            return 0;
    }
}