package generics;

import java.util.LinkedList;

public class GenericCar<T> {
    private LinkedList<T> a = new LinkedList<>();

    public LinkedList<T> getA() {
        return a;
    }

    public void setA(LinkedList<T> a) {
        this.a = a;
    }

    public void add(T t){
        a.add(t);
    }

    public void display(){
        for(T t : a){
            System.out.println(t);
        }
    }

    public Integer getSize(){
        return a.size();
    }

    public boolean checkEmpty(){
        return a.isEmpty();
    }

    public void delete(int pos){
        a.remove(pos);
    }
}
