//INDIA IS MY COUNTRY
import java.io.*;
class INDIA2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        s=s+" ";
        int len=s.length();
        String s1="",w="";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                s1=s1+" "+w;
                w="";
            }
            else
            w=ch+w;
        }
        System.out.println(s1.trim());
    }
}
        
        