import java.io.*;

public class FileProc {

  public static void main(String[] args) throws IOException{

    PrintWriter outFile = new PrintWriter("Names.txt");

    outFile.println("Chris");
    outFile.println("Kathryn");
    outFile.close();

  }

}
