package Day06.collections.IOstream;

import java.io.*;

public class FileStream {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        FileReader inreader = null;
        FileWriter outwriter = null;

        try {
            in = new FileInputStream("INFILE.TXT");
            out = new FileOutputStream("OUTFILE.TXT");
            int v;
            while ((v = in.read()) != -1) {
                out.write(v);
            }

            in.close();
            out.close();

            inreader = new FileReader("INFILE.txt");
            outwriter = new FileWriter("OUTFILE.txt");

            v= 0;
            while ((v = inreader.read()) != -1) {
                outwriter.write(v);
            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}