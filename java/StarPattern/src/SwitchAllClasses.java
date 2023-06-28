import java.util.Scanner;

public class SwitchAllClasses {
    static String patternNumber;
    public static void SwitchStar( String patternNumber){
                                    {
        switch (patternNumber) {
            case"pattern1":
                StarDiamondPattern1 starDiamondPattern1=new StarDiamondPattern1();
                starDiamondPattern1.starDiamond();
            case "pattern2":
            StarRightTrianglePattern2 starRightTrianglePattern2=new StarRightTrianglePattern2();
                starRightTrianglePattern2.rightTriangle();
                break;
            case "pattern3":
                StarReverseHalfDiamondPattern3 starReverseHalfDiamondPattern3=new StarReverseHalfDiamondPattern3();
                starReverseHalfDiamondPattern3.starReverseDiamond();
                break;
            case "pattern4":
                StarRightHalfDiamondPattern4 starRightHalfDiamondPattern4=new StarRightHalfDiamondPattern4();
                starRightHalfDiamondPattern4.starHalfDiamond();
                break;
            case "pattern5":
                StarTimerPattern5 starTimerPattern5=new StarTimerPattern5();
                starTimerPattern5.starTimer();
                break;
        }

        }

    }
}
