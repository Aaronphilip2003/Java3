import java.io.*;
class Longest_word
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int max=0;
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
                int lenw=w.length();
                if(lenw>max)
                {
                max=lenw;
                s1=w;
            }
            w="";
        }
        else
        {
            w=w+ch;
        }
    }
    System.out.println(s1);
    System.out.println(max+" characters");
}
}
        