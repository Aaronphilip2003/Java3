import java.io.*;
class Mod_Calculator
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter the second number");
        int b=Integer.parseInt(br.readLine());
        System.err.println("Enter your operator    [+ - * / ]");
        char o=(char)br.read();
        switch(o)
        {
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            default:System.err.println("Enter the correct operator");
        }
    }
}
