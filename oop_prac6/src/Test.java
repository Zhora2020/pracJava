import java.util.Scanner;
import java.util.*;
import java.lang.*;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1, 2 или 3 для выбора задачи. Введите 0 для завершения");
        int a = scanner.nextInt();
        while(a!=0){
            switch (a) {
                case (1):
                    Student student = new Student();
                    System.out.println("Исходный массив:");
                    student.printIdArr();
                    student.insertSort();
                    System.out.println("Отсортированный массив:");
                    student.printIdArr();
                    break;
                case (2):
                    ArrayList<SortingStudentsByGPA> Arr = new ArrayList();
                    Arr.add(new SortingStudentsByGPA("An2", 99));
                    Arr.add(new SortingStudentsByGPA("An3", 8));
                    Arr.add(new SortingStudentsByGPA("An1", 7));
                    Arr.add(new SortingStudentsByGPA("An5", 48));
                    Arr.add(new SortingStudentsByGPA("An4", 11));
                    System.out.println("Изнфчальный список:");
                    for (int i = 0; i < Arr.size(); i++) {
                        System.out.println(Arr.get(i));
                    }
                    System.out.println("\n");
                    Collections.sort(Arr, new SortingStudentsByGPA.sortByGPA());
                    System.out.println("Отсортированный по GPA список");
                    for (int i = 0; i < Arr.size(); i++) {
                        System.out.println(Arr.get(i));
                    }
                    System.out.println("\n");
                    break;
                case (3):
                    Task3[] arr1 = new Task3[2];
                    arr1[0] = new Task3("An2", 99);
                    arr1[1] = new Task3("An3", 10);
                    //arr1[2] = new Task3("An6", 1);
                    Task3[] arr2 = new Task3[3];
                    arr2[0] = new Task3("An1", 48);
                    arr2[1] = new Task3("An5", 7);
                    arr2[2] = new Task3("An4", 11);
                    //arr2[3] = new Task3 ("An7",333);
                    System.out.print(arr1.length+"\n");
                    Task3.Sort1(arr1);
                    for (int i = 0; i<arr1.length;i++){
                        System.out.print(arr1[i].toString1()+"\n");
                    }
                    System.out.print("\n");
                    Task3.Sort1(arr2);
                    for (int i = 0; i<arr2.length;i++){
                        System.out.print(arr2[i].toString1()+"\n");
                    }
                    System.out.print("\n");
                    Task3[] ans =  Task3.joinArray(arr1,arr2);
                    for (int i = 0; i<ans.length;i++){
                        System.out.print(ans[i].toString1()+"\n");
                    }
                    break;
            }
            System.out.println("Введите 1, 2 или 3 для выбора задачи. Введите 0 для завершения");
            a = scanner.nextInt();
        }
    }
}
