class SumOfArray{
    int[]array= new int[]{23, 24, 25, 26, 26, 89, 87, 98, 67, 56, 12, 12, 34, 45, 56, 67, 78, 89, 90, 78, 56, 58, 57, 85, 94, 34, 23, 50, 27, 59, 1, 4, 5, 6, 7, 8, 9, 2, 45, 67};
    public int addElement()
    {
        int finalResult=0;
        for(int counter=1;counter<40;counter++)
        {
            if(counter%4==0)
            {
                int counter1 = counter;
                finalResult=finalResult+(array[counter]);
                System.out.println(array[counter-1]);
            }}
        return finalResult;}
}