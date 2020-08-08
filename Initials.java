import java.io.*;
class Initials
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        String s1="";
        s1=s1+s.charAt(0)+".";
        int len=s.length();
        int sp=0;
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
            sp++;
            if(sp==1)
            s1=s1+s.charAt(i+1)+".";
            else if(sp==2)
            s1=s1+s.substring(i+1);
        }
    }
    System.out.println(s1);
}
}
        
            
        
    