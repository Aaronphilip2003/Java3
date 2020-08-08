import java.io.*;
class Next_Vowel_Letter
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int len=s.length();
        String s1="";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            s1=s1+(char)(ch+1);
            else 
            s1=s1+ch;
        }
        System.out.println(s1);
    }
}
        