package Task2;
import java.util.ArrayDeque;
import java.util.Queue;

public class T2 {
    Queue<Integer> p3, p4;

    public T2(String p3, String p4) {
        this.p3 = new ArrayDeque<>();
        this.p4 = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.p3.add(Integer.parseInt(p3.substring(i, i+1)));
            this.p4.add(Integer.parseInt(p4.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!p3.isEmpty() && !p4.isEmpty() && count < 106){
            if(p3.peek() > p4.peek() && p4.peek() != 0){
                p3.add(p3.remove());
                p3.add(p4.remove());

            }
            else{
                p4.add(p4.remove());
                p4.add(p3.remove());

            }
            count++;
        }
        String res = "";
        if(count >= 106){
            res += "botva";
        }
        else {
            if(p3.isEmpty()){
                res += "second ";
            }
            else if(p4.isEmpty()) {
                res += "first ";
            }
            res += count;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new T2("13579", "24680").play());
        System.out.println(new T2("14589", "23670").play());
        System.out.println(new T2("18356", "92740").play());
    }
}
