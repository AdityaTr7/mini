import java.io.Serializable;
import java.util.Scanner;


public class Hotel 
{
    static RoomType hotel_ob=new RoomType();
    static Scanner sc = new Scanner(System.in);
    //customer details
    static void CustDetails(int i,int rn)
    {
        String name, contact, gender;
        String name2 = null, contact2 = null; 
        String gender2="";
        System.out.print("\nEnter customer name: ");
        name = sc.next();
        System.out.print("Enter contact number: ");
        contact=sc.next();
        System.out.print("Enter gender: ");
        gender = sc.next();
        if(i<2)
        {
        System.out.print("Enter second customer name: ");
        name2 = sc.next();
        System.out.print("Enter contact number: ");
        contact2=sc.next();
        System.out.print("Enter gender: ");
        gender2 = sc.next();
        }      //different types of room 
        
          switch (i) {
            case 1:hotel_ob.luxury_doubleroom[rn]=new Doubleroom(name,contact,gender,name2,contact2,gender2);
                break;
           
            case 2:hotel_ob.luxury_singleroom[rn]=new Singleroom(name,contact,gender);
                break;
            default:System.out.println("Wrong option");
                break;
          }
    }
}
         
          
    
    
    