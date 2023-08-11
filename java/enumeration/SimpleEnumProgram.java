package enumeration;

public class SimpleEnumProgram
{
    //enum inside class
    enum Days{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}

    public static void main(String[] args)
   {
       //show the value
     for (Days d:Days.values())
         System.out.println(d);
    }
}
