package Task1;
import java.util.Stack;
public class T1 {
    Stack<Integer> p1, p2;

    public T1(String p1, String p2) {
        this.p1 = new Stack<>();
        this.p2 = new Stack<>();
        for(int i = 4; i >= 0; i --){
            this.p1.push(Integer.parseInt(p1.substring(i, i+1)));
            this.p2.push(Integer.parseInt(p2.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item){
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String play(){
        int count = 0;
        while(!p1.isEmpty() && !p2.isEmpty() && count <= 106){
            if(p1.peek() > p2.peek() && p2.peek() != 0){
                pushBack(p1, p1.pop());
                pushBack(p1, p2.pop());
            }
            else{
                pushBack(p2, p2.pop());
                pushBack(p2, p1.pop());

            }
            count++;
        }
        String res = "";
        if(count >= 106){
            res += "botva";
        }
        else {
            if(p1.isEmpty()){
                res += "second ";
            }
            else if(p2.isEmpty()) {
                res += "first ";
            }
            res += count;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new T1("13579", "24680").play());
        System.out.println(new T1("67890", "12345").play());
        System.out.println(new T1("24680", "13579").play());
    }
}
