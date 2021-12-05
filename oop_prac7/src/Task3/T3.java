package Task3;
import java.util.ArrayDeque;
import java.util.Deque;

public class T3 {
    Deque<Integer> p5, p6;

    public T3(String p5, String p6) {
        this.p5 = new ArrayDeque<>();
        this.p6 = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.p5.add(Integer.parseInt(p5.substring(i, i+1)));
            this.p6.add(Integer.parseInt(p6.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!p5.isEmpty() && !p6.isEmpty() && count < 106){
            if(p5.peek() > p6.peek() && p6.peek() != 0){
                p5.add(p5.remove());
                p5.add(p6.remove());

            }else{
                p6.add(p6.remove());
                p6.add(p5.remove());

            }
            count++;
        }
        String res = "";
        if(count >= 106){
            res += "botva";
        }
        else {
            if(p5.isEmpty()){
                res += "second ";
            }
            else if(p6.isEmpty()) {
                res += "first ";
            }
            res += count;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new T3("13579", "24680").play());
        System.out.println(new T3("14589", "23670").play());
        System.out.println(new T3("18356", "92740").play());
    }
}
