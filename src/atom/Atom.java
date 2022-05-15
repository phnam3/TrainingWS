package atom;

public class Atom {
    private Integer number;
    private String symbol;
    private String fullname;
    private Double weight;

    public Atom(){}

    public Atom(Integer number, String symbol, String fullname, Double weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullname = fullname;
        this.weight = weight;
    }

    public void display(){
        System.out.println(number + " " + symbol + " " + fullname + " " + weight);
    }

    public static boolean accepts(Integer number){
        if(number <= 0) return false;
        return true;
    }
}
