package staff;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class StudentList extends Vector<Student>{
    public StudentList(){
        super();
    }

    public void addStudent(String fname){
        try {
            File f = new File(fname);

            if (!f.exists()) {
               return;
            }
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String details;
            while ((details = bf.readLine()) != null) {
                StringTokenizer id = new StringTokenizer(details, ",");
                String name = id.nextToken();
                Integer age = Integer.parseInt(id.nextToken());
                Integer mark = Integer.parseInt(id.nextToken());
                Student st1 = new Student(name, age, mark);
                this.add(st1);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveToFile(String fname){
        if(this.size() == 0){
            System.out.println("Empty List");
            return;
        }
        try{
            File f = new File(fname);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for(Student s : this){
                pw.println(s.getName() + "," + s.getAge() + "," + s.getMark());
            }
            pw.close();
            fw.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
