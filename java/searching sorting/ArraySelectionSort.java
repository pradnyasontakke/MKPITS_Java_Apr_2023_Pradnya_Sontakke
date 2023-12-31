public class ArraySelectionSort
{
    public static void main(String[] args)
    {
        int[] a ={5,6,7,2,3};
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int Result = a[i];
                    a[i] = a[j];
                    a[j] = Result;
                }
            }
    }
        System.out.print("Result is: ");
        for (int k=0;k<a.length;k++)
        {
            System.out.print( " "+a[k]);
        }
}

}
