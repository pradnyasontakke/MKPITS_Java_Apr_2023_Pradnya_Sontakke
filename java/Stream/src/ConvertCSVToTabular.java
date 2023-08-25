import java.io.*;
//convert

public class ConvertCSVToTabular
{
   // public static void main(String[] args) {
          String line;
          String slpit = null;

public void convert(){
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("StreamRead.csv"));

            while ((line=bufferedReader.readLine())!=null)
            {
                String[]employee=line.split(" ,");
                System.out.println("employee" +employee[0]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
    ConvertCSVToTabular convertCSVToTabular=new ConvertCSVToTabular();
    convertCSVToTabular.convert();

    }
}


//str=br.readline
//while(str!=null)
//{
//String array[]=str.split(" ,")
//sop(array[0]"\t"+)
    //str=br.readline