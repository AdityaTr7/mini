
import java.io.Serializable;
import java.util.ArrayList;
// 

public class Singleroom implements Serializable {
    String name;
    String contact;
    String gender;   
    

   
    Singleroom()
    {
        this.name="";
    }
    Singleroom(String name,String contact,String gender)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
    }
}


class Doubleroom extends Singleroom implements Serializable
{ 
    String name2;
    String contact2;
    String gender2;  
    
    Doubleroom()
    {
        this.name="";
        this.name2="";
    }
    Doubleroom(String name,String contact,String gender,String name2,String contact2,String gender2)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
        this.name2=name2;
        this.contact2=contact2;
        this.gender2=gender2;
    }
}
class NotAvailable extends Exception
{
    @Override
    public String toString()
    {
        return "Not Available !";
    }
}
 class RoomType 
{
    Doubleroom luxury_doubleroom[]=new Doubleroom[10]; //Luxury
   
    Singleroom luxury_singleroom[]=new Singleroom[10]; //Deluxe
}







