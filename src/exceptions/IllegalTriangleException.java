package exceptions;

public class IllegalTriangleException extends RuntimeException{
    private String msg;

    public IllegalTriangleException() {}
    public IllegalTriangleException(String msg) {
        this.msg = msg;
    }
}
