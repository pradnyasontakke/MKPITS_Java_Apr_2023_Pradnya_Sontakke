public class NumberPattern{
public static void main(String args[]){
int count=0;
for(int row=1;row<=4;row++)
{
for(int col=1;col<=row;col++)
{
count=count+1;
System.out.print(count+"");
}
System.out.println();
}
}}