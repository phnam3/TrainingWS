package triangle;

import exceptions.IllegalRightTriangleException;
import exceptions.IllegalTriangleException;

import static java.lang.Math.sqrt;

public class RightTriangle {
    private Integer a;
    private Integer b;
    private Integer c;

    public RightTriangle(Integer a, Integer b, Integer c) throws IllegalRightTriangleException, IllegalTriangleException {
        if(a+b < c || a+c < b || b+c < a){
            throw new IllegalTriangleException();
        } else if(((a*a)+(b*b))==(c*c) || ((a*a)+(c*c))==(b*b) || ((c*c)+(b*b))==(a*a)){
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalRightTriangleException();
        }

    }
}
