import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        
        System.out.println("\n\nWelcome to the Music Player!\n\nWhich song would you like to listen to?\n\n(pick 1 or 2)\n1. Life Lesson - dodie\n2. Chinese New Year - SALES\n");

        Scanner kb  = new Scanner(System.in);
        //kb.nextLine();
        String input = kb.nextLine();
        Song s;

        if(input.equals("1"))
        {
            s = new Song1();
        }
        else
        {
            s = new Song2();
        }

        System.out.print("\n\n\nNOW PLAYING : ");
        s.printSongName();

        System.out.print("\nBY : ");
        s.printArtist();

        System.out.print("\nFROM : ");
        s.printAlbum();

        System.out.println("\n");

        s.printLyrics();

        System.out.println("\n");

        kb.close();
    }

}
