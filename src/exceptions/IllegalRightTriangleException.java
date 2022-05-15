package exceptions;

public class IllegalRightTriangleException extends RuntimeException{
    private String msg;

    public IllegalRightTriangleException() {}
    public IllegalRightTriangleException(String msg) {
        this.msg = msg;
    }
}
