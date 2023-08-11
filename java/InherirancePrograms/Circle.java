package InherirancePrograms;

import java.awt.*;

 class Circle extends Shape
 {
            private int r = 9;

            private float i = 3.14F;

            void calArea()
            {
                int Area = (int) (i * r * r);
                System.out.println( "area is " +  Area);
            }
       }

