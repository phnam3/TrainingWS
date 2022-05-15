package atom;

public class Molecule {
    private String structure;
    private String name;
    private Double weight;

    public Molecule(){};

    public Molecule(String structure, String name, Double weight){
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }

    public void display(){
        System.out.println("Molecule Structure : " + structure);
        System.out.println("Molecule Name : " + name);
        System.out.println("Molecule Weight : " + weight);
    }
}
