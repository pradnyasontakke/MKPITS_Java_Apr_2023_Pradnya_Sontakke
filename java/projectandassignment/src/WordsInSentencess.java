import java.util.ArrayList;
import java.util.List;

public class WordsInSentencess {
    public static void main(String[] args) {

        String Sentences = "Java is object oriented programming language.";

        String[] wordsOfArray = Sentences.split(" ");

        List list = new ArrayList<>();
        for (int counter = 0; counter<=Sentences.length(); counter++) {
            list.add(wordsOfArray[counter]);

        }
        System.out.println(list);
        }
    }

