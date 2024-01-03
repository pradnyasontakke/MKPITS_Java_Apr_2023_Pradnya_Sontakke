import java.util.Hashtable;
import java.util.Map;
 class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {


        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class HashTableBook{
public static void main(String[] args) {
    Map<Integer,Book> bookMap=new Hashtable<Integer,Book>();  //create map of book
  Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
       Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);


       //Adding Books to map
    bookMap.put(1,b1);
    bookMap.put(2,b2);
//    //Traversing map
    for(Map.Entry<Integer, Book> entry:bookMap.entrySet()){
       int key=entry.getKey();
      Book b=entry.getValue();
      System.out.println(key+" Details:");
       System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
}}}
