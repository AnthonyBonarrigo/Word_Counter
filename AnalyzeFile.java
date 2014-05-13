package assignment05;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class AnalyzeFile
{
   private Map<String, Integer> map;
   private Scanner scan;
   private Integer count;
   
   public AnalyzeFile(String path) throws IOException
   {
       map = new TreeMap<String, Integer>();
       for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++)
       {
           Character c = alphabet;
           map.put(c.toString(), 0);
       }
       scan = new Scanner(new File(path));
   }
    
    public void readFile()
    {
        Character letter; 
        while(scan.hasNext())
        {
            String word = new String(scan.next()).toUpperCase();
            letter = word.charAt(0);
            String c = letter.toString();
            count = map.containsKey(c)? map.get(c): 0;
            map.put(c, count + 1);  
        }
    }
    
    public void outputData()
    {
        System.out.printf("%s\t%s\n", "Letter", "Count");
        for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++)
        {
            Character c = alphabet;
            System.out.printf("%c\t%d\n", alphabet,
                    map.containsKey(c.toString())? map.get(c.toString()): 0);           
        }
    }
    
    public void closeFile()
    {
        if(scan != null)
            scan.close();    
    }
   
}
