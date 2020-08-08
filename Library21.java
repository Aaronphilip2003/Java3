import java.io.*;
class Library21
{
    String bookid,booktitle,bookauthor;
    int nodLate,fine;
    public Library21()
    {
        bookid="";
        booktitle="";
        bookauthor="";
        nodLate=0;
    }
    public Library21(int nl)
    {
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
        Library21 obj=new Library21(l);
        int fine=l*2;
        System.out.println("Fine:"+fine);
    }
}