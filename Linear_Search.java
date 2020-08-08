import java.io.*;
class Linear_Search
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers");
        int a[]=new int[10];
        int flag=0,i=0;
        for(i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter number to be searched");
        int search=Integer.parseInt(br.readLine());
        for(i=0;i<10;i++)
        {
        if(a[i]==search)
        {
            flag=1;
            break;
        }
        }
        if(flag==1)
        System.out.println("Number found at "+(i+1)+"th position");
        else
        System.out.println("Number not found");
    }
}
       