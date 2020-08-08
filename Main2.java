 
import java.io.*;
public class Main2{
public static int add(int a,int b)
{
 return a+b;
}
public static int pro(int a,int b)
{
    return a*b;
}
public static int sub(int a,int b)
{
    return a-b;
}
public static int div(int a,int b)
{
return a/b;
}
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int sum=add(a,b);
        System.out.println("Answer: "+sum);
        int pro=pro(a,b);
        System.out.println("Product: "+pro);
        int sub=sub(a,b);
         System.out.println("Difference: "+sub);
          int div=div(a,b);
          System.out.println("Division: "+div);
    }

}
