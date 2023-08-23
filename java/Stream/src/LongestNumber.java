import java.io.*;

public class LongestNumber {
    public static void main(String[] args) {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName=null;
        String longestWord = " ";



                System.out.println("enter file name");
        try {
            fileName=bufferedReader.readLine();
            BufferedReader bufferedReader1=new BufferedReader(new FileReader(fileName));
            while (fileName!=null) {
                String[] string = fileName.split(" ");
                for( int number=0;number<string.length;number++){
                    if(longestWord.length()<string[number].length()){
                        longestWord=string[number];
                    }
                }
                fileName=bufferedReader1.readLine();
            }
            System.out.println("The longest word in this file is :- " +longestWord);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    }
