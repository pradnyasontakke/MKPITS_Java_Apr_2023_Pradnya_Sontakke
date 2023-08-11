package ExceptionHandling;

public class ExceptionUsingArray
{
    public static void main(String[] args) {
        int a[]={55,7,8,988,65};
        System.out.print("Number list is:" );
        for(int number=0;number<9;number++)

            try {
                System.out.println(a[number]);

            } catch (ArithmeticException e)
            {
                System.out.println("ArithmeticException");
            } catch (NullPointerException e)
            {
                System.out.println(e.getMessage());
            } catch (Exception e)
            {
                System.out.println("exception e");
            } finally
            {
                System.out.println("list is not exist");
            }
        }
    }

