
public class Checkout extends Hotel {
	
	static void bill(int rn,int rtype)
    {
        double amount=0;
        String list[]={"Sandwich","Pasta","Noodles","Coke"};
        System.out.println("\n*******");
        System.out.println(" Bill:-");
        System.out.println("*******");
               
        switch(rtype)
        {
            case 1:
                amount+=2000;
                    System.out.println("\nRoom Charge - "+2000);
                    /*
                    System.out.println("\n===============");
                    System.out.println("Food Charges:- ");
                    System.out.println("===============");
                     System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(Food obb:hotel_ob.luxury_doubleroom[rn].food)
                    {
                        amount+=obb.price;
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
                    }
                    */
                break;
        
            case 2:amount+=1200;
                    System.out.println("Room Charge - "+1200);
                    /*
                    System.out.println("\nFood Charges:- ");
                    System.out.println("===============");
                    System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(Food obb: hotel_ob.luxury_singleroom[rn].food)
                    {
                        amount+=obb.price;
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
                    }
                    */
                break;
            default:
                System.out.println("Not valid");
        }
        System.out.println("\nTotal Amount- "+amount);
    }

	
	
	
	
	public static void deallocate(int rn,int rtype)
	    {
	        int j;
	        char w;
	        switch (rtype) {
	            case 1:               
	                if(hotel_ob.luxury_doubleroom[rn]!=null)
	                    System.out.println("Room used by "+hotel_ob.luxury_doubleroom[rn].name);                
	                else 
	                {    
	                    System.out.println("Empty Already");
	                        return;
	                }
	                System.out.println("Do you want to checkout ?(y/n)");
	                 w=sc.next().charAt(0);
	                if(w=='y'||w=='Y')
	                {
	                    bill(rn,rtype);
	                    hotel_ob.luxury_doubleroom[rn]=null;
	                    System.out.println();
	                    System.out.println("********************");
	                    System.out.println("Checkout successfull");
	                    System.out.println("********************");
	                }
	                
	                break;
	            
	            case 2:
	                if(hotel_ob.luxury_singleroom[rn]!=null)
	                    System.out.println("Room used by "+hotel_ob.luxury_singleroom[rn].name);                
	                else 
	                 {    
	                    System.out.println("Empty Already");
	                        return;
	                }
	                System.out.println(" Do you want to checkout ? (y/n)");
	                 w=sc.next().charAt(0);
	                if(w=='y'||w=='Y')
	                {
	                    bill(rn,rtype);
	                    hotel_ob.luxury_singleroom[rn]=null;
	                    System.out.println();
	                    System.out.println("********************");
	                    System.out.println("Checkout successfull");
	                    System.out.println("********************"); 
	                    
	              }
	                break;
	            default:
	                System.out.println("\nEnter valid option : ");
	                break;
	        }
	    }
	
	
	
}
