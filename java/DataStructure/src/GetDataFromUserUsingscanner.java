import java.util.LinkedList;
import java.util.Scanner;

public class GetDataFromUserUsingscanner
{
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(88);


        Scanner scanner=new Scanner(System.in);
        String name,choice;
        do {
            System.out.println("enter the name");
            name=scanner.next();
            linkedList.add(name);
            System.out.println("do you want to add other" );
            choice= scanner.next();
        }while(choice.equalsIgnoreCase("yes"));
        for(Object object:linkedList){
            System.out.println(object);
        }
        System.out.println(linkedList);
    }
}
