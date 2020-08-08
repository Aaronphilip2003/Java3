import java.io.*;
class hot
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        String s1="";
        if(s.equalsIgnoreCase("hot"))
        s1=s1+s;
        else
        s1="hot"+s;
        System.out.println(s1);
    }
}
        
