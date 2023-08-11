package enumeration;
enum Week{sun,mon,tues,wed,thurs,fri,sat}
public class EnumOutsideClass
{
    public static void main(String[] args) {
        Week w=Week.fri;
        System.out.println(w);
    }
}

