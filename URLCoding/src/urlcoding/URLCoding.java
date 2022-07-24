package urlcoding;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class URLCoding {

    public static void main(String[] args) throws MalformedURLException, IOException {
          
        try {
        URL url = new URL("http://liveexample.pearsoncmg.com/data/Lincoln.txt");
        
            
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        

        String input;
        int wordCounter = 0;
        while ((input = in.readLine()) != null) {

            int lineLen = input.length();
            int endOfLine = input.lastIndexOf(" ");
            wordCounter++;
            int x = 0;
            while (x < lineLen) {
            
                int y = x + 1;
                
                x = input.indexOf(" ", y);
                if (x == endOfLine) {
                    x = lineLen + 1;
                } else {
                    x++;
                    wordCounter++;
                }
            }

        }
        in.close();
        System.out.println("This many words " + wordCounter);

    }catch(Exception e){ System.out.print(e);}
    }
}
