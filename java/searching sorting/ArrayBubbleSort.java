public class ArrayBubbleSort {
    public static void main(String[] args)
    {

        int[]a = { 3,9,7,2,6 };

        for(int i=0;i<4;i++)
        {

        //compare two value and -1 is for the if numbeer are 5 then loop will be 4 tyme

            for(int j=0;j<4-i;j++)
            {
                if(a[j]>a[j+1])
                {
                 int temp=a[j];
                a[j]=a[j+1];
                a[j+1]= temp ;
                }
            }
    }
        System.out.println("buble sort list is :");
        for( int k=0;k<a.length;k++)
        {
            System.out.print(" "+a[k]+ " ");

        }}
}
