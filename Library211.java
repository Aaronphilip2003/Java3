import java.io.*;
class Library211
{
    String bookid,booktitle,bookauthor;
    int nodLate,fine;
    public Library211()
    {
        bookid="";
        booktitle="";
        bookauthor="";
        nodLate=0;
    }
    public Library211(String bid,String bt,String ba,int nl,int f)
    {
        f=fine;
        bid=booktitle;
        bt=booktitle;
        ba=bookauthor;
        nl=nodLate;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Library211 obj=new Library211();
        System.out.println("Enter book Id");
        obj.bookid=br.readLine();
        System.out.println("Enter Book title");
        obj.booktitle=br.readLine();
        System.out.println("Enter Book Author");
        obj.bookauthor=br.readLine();
        System.out.println("Enter Number of days returned late");
        obj.nodLate=Integer.parseInt(br.readLine());
        obj.fine=obj.nodLate*2;
        System.out.println("Fine:"+obj. fine);
    }
}