import java.io.*;
class Library1
{
    String bookid,booktitle,bookauthor;
    int nodLate,fine;
    public Library1()
    {
        bookid="";
        booktitle="";
        bookauthor="";
        nodLate=0;
    }
    public Library1(String bid,String bt,String ba,int nl)
    {
        bid=booktitle;
        bt=booktitle;
        ba=bookauthor;
        nl=nodLate;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter book Id");
        String b=br.readLine();
        System.out.println("Enter Book title");
        String b1=br.readLine();
        System.out.println("Enter Book Author");
        String b2=br.readLine();
        System.out.println("Enter Number of days returned late");
        int l=Integer.parseInt(br.readLine());
        Library1 obj=new Library1(b,b1,b2,l);
        int fine=l*2;
        System.out.println("Fine:"+fine);
    }
}