import java.io.*;
class Neon
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int a=Integer.parseInt(br.readLine());
        int sq=a*a,d=a,s=0;
        while(sq>0)
        {
            int r=sq%10;
            s+=r;
            sq=sq/10;
        }
        if(d==s)
        System.out.println("NEON NO.");
        else 
        System.out.println("NOT NEON NO.");
    }
}
            