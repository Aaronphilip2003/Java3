import java.io.*;
class MostAlpha
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int len=s.length();
        int max=0;
        char ch1=' ';
        for(int j=65;j<=90;j++)
        {
            int c=0;
            for(int i=0;i<len;i++)
            {
                char ch=s.charAt(i);
                if(ch==(char)j||ch==(char)(j+32))
                c++;
            }
            if(c>max)
            {
                max=c;
                ch1=(char)j;
            }
        }
        System.out.println(max+"\t"+ch1);
    }
}
                