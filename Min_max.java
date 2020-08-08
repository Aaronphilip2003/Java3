import java.io.*;
class Min_max
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers:");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        int min=0,max=0;
        min=a[0];max=a[0];
        for(int i=0;i<10;i++)
        {
           if(a[i]>max)
           max=a[i];
           if(a[i]<min)
           min=a[i];
        }
        System.out.println("MAXIMUM: "+max);
        System.out.println("MINIMUM: "+min);
    }
}
          
        