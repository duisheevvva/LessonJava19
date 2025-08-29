package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) throws IOException {


        FileWriter fileWriter = new FileWriter("song.txt");
        fileWriter.write("Nothing else matters\n");
        fileWriter.write("Metallica\n");
        fileWriter.write("""
                So close, no matter how far
                Couldn't be much more from the heart
                Forever trusting who we are
                And nothing else matters
                Never opened myself this way
                Life is ours, we live it our way
                All these words I don't just say
                And nothing else matters
                """);
        fileWriter.close();

        FileReader fileReader = new FileReader("song.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String title = bufferedReader.readLine();
        String author = bufferedReader.readLine();
        String text = bufferedReader.readLine();
        fileReader.close();
        Song song = new Song(title,author,text);

        System.out.println(song);


    }
}
