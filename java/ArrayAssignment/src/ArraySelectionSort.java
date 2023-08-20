//Step 1: Array arr with N size
//Step 2: Initialise i=0
//Step 3: If(i<N-1) Check for any element arr[j] where j>i and arr[j]<arr[i]
// then Swap arr[i] and arr[j]
//Step 4: i=i+1 and Goto Step 3
//Step 5: Exit
public class ArraySelectionSort
{
    public static void main(String[] args)
    {
        int aList[]={6,9,6,8,5};
        int Result;

        for (int Number=0;Number<aList.length-1;Number++)
        {
            for(int Number1=0;Number1<4-1;Number1++)
            {
                if(aList[Number1]>aList[Number1+1])
                {
                    Result=aList[Number1];
                    aList[Number1]=aList[Number1+1];
                    aList[Number1+1]=Result;

                }
            }

        }
for (int i=0;i<=aList.length;i++){
        System.out.println("Result is :" + aList[i]);
    }
    }
    }

