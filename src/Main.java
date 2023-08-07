import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Makeup Website");


///-----------------Admin Side

        String eAdmin = "Admin@112233";
        String pAdmin = "Admin112233";

//------------------------------------Seller Side

        String eSeller = "Seller@112233";
        String pSeller = "112233";
//------------------------------------Product Side
        Product user_S = new Product();
        Product seller1 = new Product();
        seller1.products="eyeliner ";
        seller1.prices= 11.4;

        Product seller2 = new Product();
        seller2.products="lip liner";
        seller2.prices=5.5;

        Product seller3 = new Product();
        seller3.products="lip gloss";
        seller3.prices=5.5;

        List<Product> ss = new ArrayList<>();
        ss.add(seller2);
        ss.add(seller1);
        ss.add(seller3);



//-------------------------------------user side
        User user1 = new User();
        user1.username ="Safa";
        user1.uPass = "123";

        User user2 = new User();
        user2.username ="MayasaAl";
        user2.uPass = "1234";


//=================================================================================================
        Scanner read = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Admin\n2.Seller\n3.User\n4.exit");
            int input = read.nextInt();
            switch (input)
            {
                case 1 :

                    System.out.print("Email :");
                    String x = read.next();
                    System.out.print("Password :");
                    String x2 = read.next();
                    if(x.equals(eAdmin) && x2.equals(pAdmin))
                    {
                        System.out.println("Welcome Admin");
                        break;
                    }else
                    {
                        System.out.println("error,try again");
                        break;
                    }

                case 2 :
                    System.out.print("Email :");
                    String y = read.next();
                    System.out.print("Password :");
                    String y2 = read.next();
                    if(y.equals(eSeller) && y2.equals(pSeller))
                    {

                        System.out.println("Welcome Seller " + y);
                        System.out.println("add Product  with price");
                        Product new_item = new Product();
                        new_item.products = read.next();
                        new_item.prices = read.nextDouble();
                        ss.add(new_item);



                        System.out.println("  Products  " + " Price ");
                        for (int i = 0; i < ss.size(); i++)
                        {
                            System.out.print( i + 1 + "." + ss.get(i).products);
                            System.out.println(  "." + ss.get(i).prices);

                        }
                        System.out.println("added Successfully ");


                        break;
                    }
                    else
                    {
                        System.out.println("error,try again");
                        break;
                    }



                case 3:

                    System.out.print("User name :");
                    String z = read.next();
                    System.out.print("Password :");
                    String z2 = read.next();
                    if(z.equals(user1.username) && z2.equals(user1.uPass) || z.equals(user2.username) && z2.equals(user2.uPass))
                    {
                        System.out.println(" Welcome User " + z);
                        System.out.println("Product details ");
                        System.out.println("  Products  " + " Price ");
                        for (int i = 0; i < ss.size(); i++)
                        {
                            System.out.print( i + 1 + "." + ss.get(i).products);
                            System.out.println( "." + ss.get(i).prices);

                        }
                        System.out.println(" ================================");
                        System.out.println(" Chose Product :");
                        int ch1 = read.nextInt();

                        switch (ch1){
                            case 1:
                                System.out.println(" Add in basket "+seller1.products+"  "+seller1.prices);
                                break;
                            case 2:
                                System.out.println(" Add in basket "+seller2.products+"  "+seller2.prices);
                                break;
                            case 3:
                                System.out.println(" Add in basket "+seller3.products+"  "+seller3.prices);
                                break;
                            default:
                                System.out.println(" this order is not available ");



                        }
                        break;
                    }
                    else
                    {
                        System.out.println("error,try again");
                        break;
                    }
                case 4 :
                    System.out.println(" Thank you ");
                    System.exit(0);

                default:
                    System.out.println("Out !!");

            }




        }

    }
}