import java.io.*;
class MOSTVOWELS
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        s=s+" ";String w="";String s1="";
        int len=s.length();
        int max=0;
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                int c=0;
                for(int j=0;j<w.length();j++)
                {
                    char ch1=w.charAt(j);
                    if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
                    c++;
                }
                if(c>max)
                {
                    s1=w;
                    max=c;
                }
                w="";
            }
            else
            {
                w=w+ch;
            }
        }
        System.out.println(s1+" "+max);
    }
}
        