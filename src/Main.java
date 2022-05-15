import atom.Atom;
import dictionary.Book;
import dictionary.DictionaryWord;
import exceptions.IllegalRightTriangleException;
import exceptions.IllegalTriangleException;
import fractions.Fraction;
import generics.Car;
import generics.GenericCar;
import staff.Officer;
import staff.Student;
import staff.StudentList;
import staff.Worker;
import triangle.RightTriangle;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


class Main {
    public static void printName(){
        System.out.println("My name is Phan Hoai Nam");
    }
    public static void evenNumber(){
        for(int i = 2; i <= 10; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    public static boolean isAnagram(String s, String a){
        a.trim();
        String punct = a.replaceAll("\\p{Punct}","");
        String anagram = punct.replaceAll(" ","");
        if(s.length() == 0 || anagram.length() == 0) {
            return false;
        }
        System.out.println(anagram);
        for(int i = 0; i < anagram.length(); i++){
            if(!s.contains(Character.toString(anagram.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    public static void readFile(String fname){
        try {
            FileReader fr = new FileReader(fname);
            BufferedReader bf = new BufferedReader(fr);
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            String ls = System.getProperty("line.separator");
            while((line = bf.readLine()) != null){
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            System.out.println(stringBuilder);
            bf.close();
        } catch (Exception e){
            System.out.println(e);
        }

    }
    public static void copyFile(String src, String dst) throws Exception{
        Path source = Paths.get(src);
        Path destination = Paths.get(dst);
        Files.copy(source, destination);
    }

    public static void main(String args[]) throws Exception
    {
        //Workshop 1
        /*
        printName();
        */

        //Workshop 2
        /*
        evenNumber();
        System.out.println("--------------");
        int[] arr = new int[]{5,2,6,1,9};
        for(int i : arr) System.out.println(i);
        System.out.println("--------------");
        Arrays.sort(arr);
        for(int i : arr) System.out.println(i);
        System.out.println("--------------");
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        */

        //Workshop 3
        /*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> a = new ArrayList<>();
        List<Atom> atoms= new ArrayList<>();
        System.out.print("Enter number of atoms: ");
        int n = Integer.parseInt(in.readLine());
        if(n > 10) System.out.println("Too many inputs");
        else {
            for(int i = 0; i < n; i++){
                System.out.print("Enter atomic number ");
                Integer number = Integer.parseInt(in.readLine());
                if(Atom.accepts(number)) {
                    System.out.print("Enter atomic symbol ");
                    String symbol = in.readLine();
                    System.out.print("Enter atomic fullname ");
                    String fullname = in.readLine();
                    System.out.print("Enter atomic weight ");
                    Double weight = Double.parseDouble(in.readLine());
                    Atom a1 = new Atom(number, symbol, fullname, weight);
                    atoms.add(a1);
                } else {
                    break;
                }
            }
        }
        for(Atom atom : atoms){
            atom.display();
        }
        */

        //Workshop 4
        /*
        rectangle.Rectangle r1 = new rectangle.Rectangle();
        r1.setHeight(12.0);
        r1.setWidth(6.0);
        System.out.println("Area : " + r1.area() + " Perimeter :" + r1.perimeter());

        rectangle.Rectangle r2 = new rectangle.Rectangle(3.0, 6.0);
        System.out.println("Area : " + r2.area() + " Perimeter :" + r2.perimeter());
        */
        /*
        Fraction f1 = new Fraction(2,5);
        Fraction f2 = new Fraction(5,6);
        f1.add(f2).display();
        f1.sub(f2).display();
        f1.mul(f2).display();
        f1.div(f2).display();
         */

        //Workshop 5
        /*
        Officer officer = new Officer(100.0, "Ben");
        officer.display();
        Worker worker = new Worker("Fate", 400.0);
        worker.display();
        */

        //Workshop 6 + 6.2
        /*
        String hi = "Hi, ";
        String mom = "mom.";
        StringBuffer hello = new StringBuffer(hi);
        StringBuffer mommy = new StringBuffer(mom);
        System.out.println(hi.concat(mom));
        System.out.println(hello.append(mommy));
        System.out.println(hi+mom);
        */
        /*
        String name = "Phan Hoai Nam";
        String[] words = name.split(" ");
        for(String s : words){
            System.out.print(s.charAt(0));
        }
        */
        /*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        String string = in.readLine();
        System.out.print("Enter Anagram: ");
        String anagram = in.readLine();
        System.out.println(isAnagram(string, anagram));

        String[] split = string.split(" ");
        int count = 0;
        for(String s : split){
            if(s.equals("you")){
                count++;
            }
        }

        String res = "";
        for(String s : split){
            int last = s.length()-1;
            char u = Character.toUpperCase(s.charAt(last));
            char l = Character.toLowerCase(s.charAt(0));
            String temp = s.replace(s.charAt(0), l);
            res += temp.replace(s.charAt(last), u);
        }

        int idx = string.indexOf('a');
        res = string.substring(0, idx)+string.substring(idx+1);
        System.out.println(res);

        if(split.length == 0){
            System.out.println("empty string");
        } else {
            System.out.println(split.length);
        }

        for(int i = string.length()-1; i >= 0; i--){
            res += string.charAt(i);
            if(Character.isUpperCase(string.charAt(i))){
                count++;
            }
        }
        System.out.println(res);
        System.out.println(count);
        */

        //Workshop 7
        /*
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            try {
                RightTriangle rt = new RightTriangle(a,b,c);
                System.out.println("This is a right triangle");
            }
            catch (IllegalTriangleException e1) {
                System.out.println("This is not a triangle");
            }
            catch (IllegalRightTriangleException e2) {
                System.out.println("This is not a right triangle");
            }
            System.out.println("Continue?(Y/N):");
            char opt = sc.next().charAt(0);
            if(opt != 'Y')
                break;
        }
         */

        //Workshop 8
        /*
        String filename = "D://text//f1.txt";
        Scanner sc = new Scanner(System.in);
        StudentList students = new StudentList();
        students.addStudent(filename);
        for(Student s : students){
            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getMark());
        }
        String filename2 = "D://text/f2.txt";
        students.saveToFile(filename2);
        readFile(filename);
        copyFile(filename, "D://text//f3.txt");
        */

        //Workshop 9
//        /*
        //Create three new dictionary words, with 1 duplicate word (different meaning)
        DictionaryWord w1 = new DictionaryWord("forger", "Makes an illegal copy of something");
        DictionaryWord w2 = new DictionaryWord("bank robber", "Steals money from the bank");
        DictionaryWord w3 = new DictionaryWord("forger", "Makes an legal copy of something");
        Book b1 = new Book();

        //Add dictionary words to an array list
        b1.addToBook(w1);
        b1.addToBook(w2);
        b1.addToBook(w3);

        //Print out unordered list following by ordered list of dictionary words
        //Duplicate should not be presented
//        System.out.println(b1);
//        Collections.sort(b1.getDictionaryWordList());
//        System.out.println(b1);

        //Print out ordered list of dictionary words, duplicate should not be presented
        b1.addToBookSet(w1);
        b1.addToBookSet(w2);
        b1.addToBookSet(w3);
        System.out.println(b1.toStringSet());
//        */

        //Workshop 10
        /*
        GenericCar<Car> carList = new GenericCar<Car>();
        Car car1 = new Car("Nam", 100.0, "Honda");
        Car car2 = new Car("Nam2", 110.0, "Honda2");
        Car car3 = new Car("Nam3", 120.0, "Honda3");
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.delete(0);
        for(int i = 0; i < carList.getSize(); i++){
            Car c = carList.getA().get(i);
            System.out.println(c.getName());
            System.out.println(c.getPrice());
            System.out.println(c.getProduction());
        }
         */

    }
}
