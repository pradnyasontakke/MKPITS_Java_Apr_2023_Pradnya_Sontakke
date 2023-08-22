import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
      //  System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
       // for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
          //  System.out.println("i = " + i);


        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));//read from keyboard
        try {
            System.out.println("enter source file");
            String fname1=b.readLine();
            File file=new File(fname1);
            if (file.exists())
            {
                System.out.println("target file");
                String fname2=b.readLine();
               // FileRaadWrite.filecopy(fname1,fname2);
            }
            else
                System.out.println("does not exist");
            } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
    }
