import java.io.*;
class Library_2
{
    String name;
    int price;
    int days;
    Double fine;
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the book borrowed:");
        name=br.readLine();
        System.out.println("Enter the printed price of the book:");
        price=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of days for which the fine has to be paid:");
        days=Integer.parseInt(br.readLine());
    }
    void cal()
    {
        if(days<=7)
        fine=days*0.25;
        else if(days>7&&days<=15)
        fine=7*0.25+(days-7)*0.40;
        else if(days>15&&days<=30)
        fine=7*0.25+15*0.40+(days-15)*0.60;
        else if(days>30)
        fine=7*0.25+15*0.40+30*0.60+(days-30)*0.80;
    }
    void display()
    {
        System.out.println("NAME OF THE BOOK:"+name);
        System.out.println("ORIGINAL PRICE OF THE BOOK:"+price);
        System.out.println("NUMBER OF DAYS FOR FINE TO BE PAID:"+days);
        System.out.println("FINE TO BE PAID:"+fine);
    }
}
