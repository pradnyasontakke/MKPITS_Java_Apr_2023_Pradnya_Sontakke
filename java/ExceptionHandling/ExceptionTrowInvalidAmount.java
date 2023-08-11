package ExceptionHandling;

public class ExceptionTrowInvalidAmount extends Exception
{
    @Override
    public String getMessage()
    {
       return "please enter amount at least 100";
    }
}
