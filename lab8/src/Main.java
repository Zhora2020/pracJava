import java.io.*;
import java.util.Scanner;


public class Main {

    public  Main(){
        System.out.println("1 - запись в файл/замена информации\n2 - вывод из файла\n3 - добавление в конец файла\n0 - для завершения");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while(a!=0){
            switch (a){
                case(1):
                    System.out.println("Введите строку для записи");
                    System.out.println("Для завершения записи введите *");
                    String st = "";
                    while (!st.equals("*")){
                        T1(st);
                        st = scanner.nextLine();
                    }
                    break;
                case(2):
                    T2();
                    break;
                case(3):
                    System.out.println("Введите строку для записи");
                    System.out.println("Для завершения записи введите *");
                    String st1 = "";
                    while (!st1.equals("*")){
                        T3(st1);
                        st1 = scanner.nextLine();
                    }
                    break;
            }
            System.out.println("1 - запись в файл/замена информации\n2 - вывод из файла\n3 - добавление в конец файла\n0 - для завершения");
            a = scanner.nextInt();
        }
    }

    public void T1(String s) {
        try(FileWriter writer = new FileWriter("C:\\Users\\Zhora\\OneDrive\\Рабочий стол\\Учеба МИРЭА\\Java 3 сем\\Работы жаба\\жаба лаба\\t1.txt", false)){
            writer.write(s);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void T2() {
        try(FileReader reader = new FileReader("C:\\Users\\Zhora\\OneDrive\\Рабочий стол\\Учеба МИРЭА\\Java 3 сем\\Работы жаба\\жаба лаба\\t1.txt")){
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
            System.out.println("\n");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void T3(String s) {
        try(FileWriter writer = new FileWriter("C:\\Users\\Zhora\\OneDrive\\Рабочий стол\\Учеба МИРЭА\\Java 3 сем\\Работы жаба\\жаба лаба\\t1.txt", true)){
            writer.write(s);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}