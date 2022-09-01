import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*try {
            FileWriter output = new FileWriter("temp.txt",true);
            output.write("java 123\n");
            output.close();

            FileReader input = new FileReader("temp.txt");
            int code = input.read();
            System.out.println((char) code);
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader input = null;
        try {
           input = new FileReader("temp.txt1");
           int code;
           while ((code = input.read()) != -1) {
               System.out.print((char) code);
           }

        } catch (FileNotFoundException ex) {
            System.out.println("File Dose not exist!");
        } catch (IOException e) {
            e.printStackTrace();
        }**/

        //create input stream
        BufferedReader input = new BufferedReader(new FileReader("temp.txt"));

        //create output stream
        BufferedWriter output  = new BufferedWriter(new FileWriter("temp2.txt"));
        String line;
        while ((line = input.readLine()) != null) {
            System.out.println(line);
            output.write(line+"\n");
        }
        input.close();
        output.close();
    }
}
