package assignment05;

import java.io.IOException;

public class AnalyzeFileTest
{
    public static void main(String[] args)
    {
       AnalyzeFile analyze;
        
       try
       {
            analyze = new AnalyzeFile("words.txt");
            analyze.readFile();
            analyze.outputData();
       } 
       catch(IOException e)
       {
           System.err.print("File doesn't exist or some other error."); 
       }
       finally
       {
           analyze.closeFile();
       }
    }
}
