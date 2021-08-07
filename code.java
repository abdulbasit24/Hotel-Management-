import java.util.Scanner;
class project
{
public static void main(String HM[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("   #*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*# ::ATLANTIC PARADISE RESORT:: #*#*#**#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
    System.out.println("                                         #------------------------#");
    System.out.println("                             :: 22/5D broad street hereford Hamilton India. ::");
    System.out.println(" ----------------------------------------------------------------------------------------------- ");
    System.out.println(" *-  APR is an experience that welcome you to a new approach of hospitality.");
    System.out.println(" *-  Our hotel elegency and courteous service make the finest business hotel group in the world.");
    System.out.println(" *-  Elegent room and suits feature woood floor,free wifi and flat screen TV's.");
    System.out.println(" *-  In addition for sitting area,stocked minibars and Italian marbels bathrooms.");
    System.out.println(" *-  Suits and separate living room with coffee tables.");
    System.out.println(" *-  Mobile and online booking also available.");
    System.out.println(" *-  for mobile booking contact us on - +91-99999xxxxx");
     System.out.println("  ");
    System.out.println(" *-                               'Premium charges apply.'                 ");
    System.out.println("  ");
    System.out.println(" *-  For online booking. ");
    System.out.println(" *-  Visit =>  http/-www.APResort.com ");
    System.out.println(" If there is any problem then feed us on ----  feed@atlantic.com");
    System.out.println("  ");
    System.out.println("                       <<<<<<<<<<======= RULES & REGULATIONS =======>>>>>>>>>>");
    System.out.println(" </> Check out/time should be inform to the reception if you wish to read in.");
    System.out.println(" </> Please present your ID card or any other proof at the time of reservation.");
    System.out.println(" </> Bill must be settled either in cash or card (Personal cheque will not be accepted).");
    System.out.println(" ");
    System.out.println(" -----------------------------------------------------------------------------------------------");
    System.out.println("                   ..........THANK YOU TO READ OUR RULES AND REGULATION..........");
    System.out.println(" ");
    System.out.println("There are 4 types of room available.");
    System.out.println(" ");
    System.out.println("*1- Super Deluxe room (Rs.4500/night)  (press 1)");
    System.out.println("*2- Deluxe room (Rs.3800/night)        (Press 2)");
    System.out.println("*3- Ac room (Rs.3000/night)            (Press 3)");
    System.out.println("*4- Non Ac (Rs.1900/night)             (Press 4)");
    System.out.println(" ");
    System.out.println("Enter your choice. ");
    int cho=s.nextInt();
   // System.out.println(".....Which type of room you want to select......");
    switch(cho)
    {
        case 1:
        System.out.println(" Facilities of Super deluxe Room are...");
        System.out.println(" ");
        System.out.println("*1- Double bed with a comfortable mattress.");
        System.out.println("*2- Air conditioning with 2 spilits Ac's");
        System.out.println("*3- A large sofa,center table,one bed table beside bed.");
        System.out.println("*4- Refrigerator,Microwaves.");
        System.out.println("*5- 50 inches LED Tv.");
        System.out.println("****************************************************");
    break;
        case 2:
        System.out.println(" Facilities of Deluxe Room are...");
        System.out.println(" ");
        System.out.println("*1- Double bed with a comfortable mattress.");
        System.out.println("*2- Air conditioning with 1 spilits Ac's");
        System.out.println("*3- A large sofa,one bed table beside bed.");
        System.out.println("*4- 42 inches LED Tv.");
        System.out.println("*************************************************** ");
        System.out.println(" ");
        break;
        case 3:
        System.out.println(" Facilities of AC Room are...");
        System.out.println(" ");
        System.out.println("*1- Double bed with a comfortable mattress.");
        System.out.println("*2- Air conditioning with 2 spilits Ac's");
        System.out.println("*3- Electronic safe.");
        System.out.println("*4- A large sofa,centre table.");
        System.out.println("*5- 32 inches LED Tv.");
        System.out.println("*************************************************** ");
        break;
        case 4:
        System.out.println(" Facilities of Non AC Room are...");
        System.out.println(" ");
        System.out.println("*1- choice of single or double bed with soft mattress.");
        System.out.println("*2- A sofa set .one bed table beside bed.");
        System.out.println("*3- 24 inches LED Tv.");
        System.out.println("***************************************************");
         break;
         
        }
         
         
         
         
         
    System.out.println(" *-  What do you want to do.-");
    System.out.println("     -----------------------");
    System.out.println("*1-   To book a room (Press 1):");
    System.out.println("*2-   Check customer recods (Press 2):");
    System.out.println("*3-   Total room alloted (Press 3): ");
    //Scanner s=new Scanner(System.in);
    System.out.println("      ::Enter your choice::"); 
    int choice=s.nextInt();
    switch(choice)
    {
        case 1 :
        System.out.println(" You choose to book a room");
        System.out.println("                      ....... Fill up the regestration form given below......");
        System.out.println(" Enter your name");
        String name=s.next();
        System.out.println(" Enter your Mobile number.");
        long num=s.nextLong();
        System.out.println(" Check in date");
        int date=s.nextInt();
        System.out.println(" Number of days you want to stay");
        int days=s.nextInt();
        System.out.println(" Number of childrens /below 18 years");
        int child=s.nextInt();
        System.out.println(" Number of adults /above 18 years");
        int adult=s.nextInt();
        System.out.println(" Total number of room required");
        int room=s.nextInt();
        System.out.println(" Enter your E-mail address");
        String e=s.next();
        System.out.println(" ID(Adhaar,pan card,voter id etc..)for verification");
        System.out.println(" what you choose for verification");
        String id=s.next();
        System.out.println("          ....Thank you for filling the form....");
        
       // System.out.println("
}
}
}

