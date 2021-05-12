import java.io.*;
import java.nio.charset.StandardCharsets;

public class InClassNotesWeek6 {

    public static void main(String[] args) throws IOException { //used throws to prevent error, better to use try/catch though

        byte[] message = "Hello World".getBytes(StandardCharsets.UTF_8); //displays byte array of message
        for(int i = 0; i < message.length; i++)
            System.out.println(message[i]); //prints out the bytes

        File file = new File("src/main/resources/test.txt"); //location of file
        OutputStream fOs = new FileOutputStream(file); //writes out to file .txt
        fOs.write(65);
        fOs.close();  //must close every time, cannot be used once closed

        InputStream fIs = new FileInputStream(file); //reads a file in
        int i = 0;
        while((i=fIs.read()) != -1){ //keep reading until the byte is not -1
            System.out.print((char)i); //prints out the string
        }
        fIs.close();

                // BufferedOutputStream internally uses buffer to store data, adds more efficiency than to write data directly into a stream
                var bOs = new BufferedOutputStream(new FileOutputStream);
                bOs.write("Hello Java".getBytes());
                bOs.flush(); //if you need to continue using and not close. saves info into a file to clear the stream of any element that may be or may not be inside the stream
                bOs.close(); //flushes and closes at the same time

                // SequenceInputStream reads two files  and prints them sequentially
                FileInputStream input1 = new FileInputStream("src/main/resources/testseq1");
                FileInputStream input2 = new FileInputStream("src/main/resources/testseq2");
                SequenceInputStream inst = new SequenceInputStream(input2, input2);
                int j;
                while((j=inst.read()) != -1){
                    System.out.print((char)j);
                }
                inst.close();
                input1.close();
                input2.close();

                // PrintStream writes data to another stream, automatically flushes data, formats as text rather than byte values
                FileOutputStream fout = new FileOutputStream("src/main/resources/testout.txt");
                PrintStream pout = new PrintStream(fout);
                pout.println(2016);
                pout.println("Hello Java");
                pout.close();
                fout.close();


    }
}
