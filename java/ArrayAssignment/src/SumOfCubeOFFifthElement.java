import static java.lang.Long.sum;

public class SumOfCubeOFFifthElement {
    int array[]={12,23,34,45,56,78,89,13,25,47,12,23,23,34,45,56,54,47,67,78,12,23,34,
            45,56,78,89,13,25,47,12,23,23,34,45,56,54,47,67,78};
    public int sumOfCube(){
        int sum=0;
        for(int counter=5;counter<array.length;counter+=5){
            if(counter%2==0){
                sum=sum - (array[counter-1] * array[counter-1]*  array[counter-1]);
                System.out.println(array[counter-1]);
            }
            else {
                    sum=sum + (array[counter-1] * array[counter-1]*  array[counter-1]);
                    System.out.println(array[counter-1]);
            }
        }
        System.out.println("Sum Of Cube OF Fifth Element");
        return sum;
    }



}
