import java.io.*;
class Nike
{
    String notp;
    void merc()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice1;
        System.out.println("Please enter your name:");
        notp=br.readLine();
        System.out.println("The price of your Nike Mercurial is 500$");
        System.out.println("If you wish to purchase it press 5");
        System.out.println("If you want to exit the website press 6");
        System.out.println("Enter your choice");
        choice1=Integer.parseInt(br.readLine());
        switch(choice1)
        {
            case 5:System.out.println("Thank you for purchasing our item");
            System.out.println("---------PURCHASE CARD---------");
            System.out.println("Name of the customer:"+notp);
            System.out.println("Name of the article:Nike Mercurial");
            System.out.println("Price of the article:500$");
            System.out.println("-------------------------------");
            break;
            case 6:System.out.println("Thank you for visiting our website");
            break;
            default:System.out.println("Choose a correct option");
        } 
    }
    void Hyp()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice1;
        System.out.println("Please enter your name:");
        notp=br.readLine();
        System.out.println("The price of your Nike Hyper Venom is 550$");
        System.out.println("If you wish to purchase it press 5");
        System.out.println("If you want to exit the website press 6");
        System.out.println("Enter your choice");
        choice1=Integer.parseInt(br.readLine());
        switch(choice1)
        {
            case 5:System.out.println("Thank you for purchasing our item");
            System.out.println("---------PURCHASE CARD---------");
            System.out.println("Name of the customer:"+notp);
            System.out.println("Name of the article:Nike Hyper Venom");
            System.out.println("Price of the article:550$");
            System.out.println("-------------------------------");
            break;
            case 6:System.out.println("Thank you for visiting our website");
            break;
            default:System.out.println("Choose a correct option");
        } 
    }
    void cr7()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice1;
        System.out.println("Please enter your name:");
        notp=br.readLine();
        System.out.println("The price of your Nike Cr7 Indoor Shoes is 600$");
        System.out.println("If you wish to purchase it press 5");
        System.out.println("If you want to exit the website press 6");
        System.out.println("Enter your choice");
        choice1=Integer.parseInt(br.readLine());
        switch(choice1)
        {
            case 5:System.out.println("Thank you for purchasing our item");
            System.out.println("---------PURCHASE CARD---------");
            System.out.println("Name of the customer:"+notp);
            System.out.println("Name of the article:Nike Cr7 Indoor Shoes");
            System.out.println("Price of the article:600$");
            System.out.println("-------------------------------");
            break;
            case 6:System.out.println("Thank you for visiting our website");
            break;
            default:System.out.println("Choose a correct option");
        } 
    }
    public static void main(String args[])throws IOException
    {
        Nike obj=new Nike();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice;
        System.out.println("Welcome to Nike.com");
        System.out.println("Please choose a Shoe you wish to purchase");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Press 1 to buy Nike Mercurial");
        System.out.println("Press 2 to buy Nike Hyper Venom");
        System.out.println("Press 3 to buy Nike CR7 Indoor Shoes");
        System.out.println();
        System.out.print("Please Enter your Choice:");
        choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:obj.merc();
            break;
            case 2:obj.Hyp();
            break;
            case 3:obj.cr7();
            break;
            default:System.out.println("Choose the correct option");
        }
    }
}
            