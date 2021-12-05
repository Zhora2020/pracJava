import java.util.Comparator;


public class SortingStudentsByGPA {

    private String name;
    private int gpa;

    SortingStudentsByGPA(String name, int gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String toString(){
        return this.name + " " + this.gpa;
    }

    static class sortByGPA implements Comparator<SortingStudentsByGPA>{
        public int compare (SortingStudentsByGPA a, SortingStudentsByGPA b){
            return b.gpa - a.gpa;
        }
    }
}
