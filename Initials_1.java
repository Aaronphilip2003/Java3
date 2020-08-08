//SUBHASH CHANDRA BOSE
//S.C.B.
import java.io.*;
class Initials_1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int len=s.length();
        String s1="";
        s1=s1+s.charAt(0)+".";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                s1=s1+s.charAt(i+1)+".";
            }
        }
        System.out.println(s1);
    }
}
        