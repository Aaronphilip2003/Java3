import java.io.*;
class My_song_list
{
    void eagles()
    {
        System.out.println("Welcome to the database of the band 'Eagles'");
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Hotel California");
        System.out.println("2. Take it Easy");
        System.out.println("3. Peaceful Easy Feeling");
        System.out.println("4. A New Kid in Town");
        System.out.println("5. One of these Nights");
        System.out.println("6. Lyin' Eyes");
    }
    void ed()
    {
        System.out.println("Welcome to the database of Ed Sheeran");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1.Shape of you");
        System.out.println("2.Perfect");
        System.out.println("3.Galway Girl");
        System.out.println("4.Thinking Out Loud");
        System.out.println("5.Lego House");
        System.out.println("6.The A-Team");
    }
    void Alan()
    {
        System.out.println("Welcome to the database of Alan Walker");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1.Faded");
        System.out.println("2.Alone");
        System.out.println("3.Sing me to Sleep");
        System.out.println("4.Tired");
        System.out.println("5.Ignite");
    }
    public static void main(String args[])throws IOException
    {
        My_song_list obj=new My_song_list();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice;
        System.out.println("Welcome to my song database");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Please choose from the names of the bands or single artists  present on this database");
        System.out.println("The number beside the band or the artist can be chosen to access the songs from this database");
        System.out.println("1-Eagles");
        System.out.println("2-Ed Sheeran");
        System.out.println("3-Alan Walker");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Please enter your choice");
        choice=Integer.parseInt(br.readLine());
        switch (choice)
        {
            case 1:obj.eagles();
            break;
            case 2:obj.ed();
            break;
            case 3:obj.Alan();
            break;
            default:System.out.println("Please choose the correct artist/band");
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Thank you for visiting this database");
        System.out.println("Please send your feedback about this database to this e-mail id--aaronphilip2003@gmail.com");
    }
}
            
        