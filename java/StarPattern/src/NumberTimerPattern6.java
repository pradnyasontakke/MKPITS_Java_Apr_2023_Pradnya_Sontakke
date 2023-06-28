import java.util.Scanner;

public class NumberTimerPattern6 {
    public void numberTimer(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row of pattern6");
        int rows=scanner.nextInt();

           for(int row=1;row<=rows;row++){
               for(int space=1;space<=row;space++){
                   System.out.print(" ");
               }
               for (int column=row;column<=rows;column++){
                   System.out.print(column+" ");
               }
               System.out.println();
           }

        for (int row=rows-1;row>=1;row--){
            for (int space=0;space<row;space++){
                System.out.print(" ");
            }
            for (int column=row;column<=rows;column++){
                System.out.print(column+" ");
            }
            System.out.println();
        }
        }
    }

