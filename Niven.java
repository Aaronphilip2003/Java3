import java.io.*;
class Niven
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int a=Integer.parseInt(br.readLine());
        int s=0,d=a;
        while(a>0)
        {
            int r=a%10;
            s+=r;
            a=a/10;
        }
        if(d%s==0)
        System.out.println("NIVEN NO");
        else 
        System.out.println("NOT NIVEN NO.");
    }
}
    