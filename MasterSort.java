import java.io.*;
class MasterSort
{
    public static void Bsort()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int temp;
        System.out.println("Enter 10 digits:");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for(int i=0;i<10;i++)
        System.out.println(a[i]);
    }
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("PROGRAM TO SORT");
        Bsort();
    }
}
