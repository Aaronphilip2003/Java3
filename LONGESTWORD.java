import java.io.*;
class LONGESTWORD
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        s=s+" ";
        int len=s.length();
        int max=0;int lenw=0;
        String s1="",w="";
        for(int i=0;i<len;i++)
        {
           char ch=s.charAt(i);
           if(ch==' ')
           {
               lenw=w.length();
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
        System.out.println(s1+"\t"+lenw);
    }
}
                
                