import java.io.*;
class Leapyear
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a year to check if it is a leap year or not");
        int a=Integer.parseInt(br.readLine());
        if(a%4==0)
        {
            System.out.println("The year you have entered is a leap year");
        }
        else
        {
            System.out.println("The year you have entered is not a leap year");
        }
    }
}  