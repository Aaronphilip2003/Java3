import java.io.*;
class Merging
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 elements of the first array:");
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter 5 elements of the second array:");
        int b[]=new int[5];
        for(int i=0;i<5;i++)
        {
            b[i]=Integer.parseInt(br.readLine());
        }
        int c[]=new int[10];
        System.out.println("Elements of the first and the second array are:");
        for(int i=0;i<5;i++)
        {
            c[i]=a[i];
            c[i+5]=b[i];
        }
        for(int i=0;i<10;i++)
        System.out.println(c[i]);
    }
}