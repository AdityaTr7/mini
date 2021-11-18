import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;





class write extends Hotel implements Runnable
{
    RoomType hotel_ob;
    write(RoomType hotel_ob)
    {
        this.hotel_ob=hotel_ob;
    }
    @Override
    public void run() {
          try{
        FileOutputStream fout=new FileOutputStream("file.txt");
        
        
		ObjectOutputStream oos=new ObjectOutputStream(fout);
        oos.writeObject(hotel_ob);
        
        oos.flush();
        
        oos.close();
        
        
        
        }
        catch(Exception e)
        {
            System.out.println("Error in writing "+e);
        }         
        
    }
    
}

public class Main extends Reservation  {
    public static void main(String[] args){
        
        try
        {           
        File f = new File("backup");
        if(f.exists())
        {
            FileInputStream fin=new FileInputStream(f);
         
			ObjectInputStream ois=new ObjectInputStream(fin);
            Hotel.hotel_ob=(RoomType)ois.readObject();
            
            ois.close();
        }
        Scanner sc = new Scanner(System.in);
        int ch,ch2;
        char wish;
        x:
        do{
//Menu
        System.out.println("\nEnter your choice :\n1.Display room details\n2.Display room availability \n3.Book\n4.Checkout\n5.Exit\n");
        ch = sc.nextInt();
        switch(ch){
            case 1: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Luxury Single Room\n");
                    ch2 = sc.nextInt();
                   Reservation.features(ch2);
                break;
            case 2:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Luxury Single Room\n");
            ch2 = sc.nextInt();
            Reservation.availability(ch2);
              break;
            case 3:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Luxury Single Room\n");
            ch2 = sc.nextInt();
           Reservation.bookroom(ch2);                     
            break;
                     
            case 4:                 
                System.out.print("Room Number -");
                     ch2 = sc.nextInt();
                     if(ch2>20)
                         System.out.println("Room doesn't exist");
                   
                     else if(ch2>10)
                         Checkout.deallocate(ch2-11,2);
                     else if(ch2>0)
                         Checkout.deallocate(ch2-1,1);
                     else
                         System.out.println("Room doesn't exist");
                     break;
            
            case 5:break x;
                
        }
           
            System.out.println("\nContinue : (y/n)");
            wish=sc.next().charAt(0); 
            if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N'))
            {
                System.out.println("Invalid Option");
                System.out.println("\nContinue : (y/n)");
                wish=sc.next().charAt(0); 
            }
            
        }while(wish=='y'||wish=='Y');    
        
        Thread t=new Thread(new write(Hotel.hotel_ob));
        t.start();
        }        
            catch(Exception e)
            {
                System.out.println("Not a valid input");
            }
    }
}
