
class Book{
    String bookname;
    int prize;
    String booktype;
}
class TextBook extends Book{
    String TextbookName;
    Double size;
    int standatd;
} 
class Novel extends TextBook{
    String novelName;
    int NovelPrize;
    String authorname;
}
public class BookDemo {
    public static void main(String[] args) {
        Book book=new Book();
        book.bookname="eat that frog";
        TextBook textBook=new TextBook();
        textBook.size=1.6;
        Novel novel=new Novel();
        novel.prize=500;

        System.out.println(book.bookname);
        System.out.println(textBook.size);
        System.out.println(novel.prize);
    }



}
