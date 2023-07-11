public class ArrayOfThreeDimension
{
    //main method
    public static void main(String[] args)
    {
        //declare 3dimension array element
        int Array[][][]={{{10,20},{30,10,20},{40,50,60,70}}};
        //first loop start with 0, check and print the index value of first [0]
        for(int Dimension1=0;Dimension1< Array.length;Dimension1++)
        {
            //start with 0 index, check and print the index value of first [0][0]
         for(int Dimension2=0;Dimension2<Array[Dimension1].length;Dimension2++)
         {
               //start with 0, check and print the index value of first [0][0][0]
             for(int Dimension3=0;Dimension3<Array[Dimension1][Dimension2].length;Dimension3++)
             {
                 System.out.println("Array index of["+Dimension1+"]["+Dimension2+"]["+Dimension3+"], values : "+ Array[Dimension1][Dimension2][Dimension3]);

             }
             System.out.println();
         }
        }
    }
}
