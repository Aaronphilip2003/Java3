import java.io.*;
class Letter_Digit_Space_Symbols
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String:");
        String s=br.readLine();
        int len=s.length();
        int c1=0,c2=0,c3=0,c4=0;
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            c1++;
            else if(Character.isDigit(ch))
            c2++;
            else if(Character.isWhitespace(ch))
            c3++;
            else
            c4++;
        }
        System.out.println("No. of Letters= "+c1);
        System.out.println("No. of Digits= "+c2);
        System.out.println("No. of Spaces= "+c3);
        System.out.println("No. of Symbols= "+c4);
    }
}



