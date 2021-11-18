
public class Reservation extends Hotel{
	static void bookroom(int i)
    {
        int j;
        int rn;
        System.out.println("\nChoose room number from : ");
        switch (i) {
            case 1:
                for(j=0;j<hotel_ob.luxury_doubleroom.length;j++)
                {
                    if(hotel_ob.luxury_doubleroom[j]==null)
                    {
                        System.out.print(j+1+",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try{
                rn=sc.nextInt();
                rn--;
                if(hotel_ob.luxury_doubleroom[rn]!=null)
                    throw new NotAvailable();
                CustDetails(i,rn);
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
           
            case 2:
                  for(j=0;j<hotel_ob.luxury_singleroom.length;j++)
                {
                    if(hotel_ob.luxury_singleroom[j]==null)
                    {
                        System.out.print(j+11+",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try{
                rn=sc.nextInt();
                rn=rn-11;
                if(hotel_ob.luxury_singleroom[rn]!=null)
                    throw new NotAvailable();
                CustDetails(i,rn);
                }
                catch(Exception e)
                {
                   System.out.println("Invalid Option");
                    return;
                }
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
        System.out.println(); 
        System.out.println("********************"); 
        System.out.println("Room Booked Successfully");
        System.out.println("********************"); 
    }

public static void features(int i)
{
    switch (i) {
        case 1:System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2000 ");
            break;
      
        case 2:System.out.println("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ");
            break;
        default:
            System.out.println("Enter valid option");
            break;
    }
}
//counting the no. of rooms.
public static void availability(int i)
{
  int j,count=0;
    switch (i) {
        case 1:
            for(j=0;j<10;j++)
            {
                if(hotel_ob.luxury_doubleroom[j]==null)
                    count++;
            }
            break;
    
        case 2:
            for(j=0;j<hotel_ob.luxury_singleroom.length;j++)
            {
                if(hotel_ob.luxury_singleroom[j]==null)
                    count++;
            }
            break;
        default:
            System.out.println("Enter valid option");
            break;
    }
    System.out.println("Number of rooms available : "+count);
}}
    
    
