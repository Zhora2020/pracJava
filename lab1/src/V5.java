public class V5 {

    public static int CountF(int x){
        int ans = 1;
        for (int i = 1; i <= x; i++){
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(CountF(5)); // !5 = 120
        System.out.println(CountF(2)); // !2 = 2
        System.out.println(CountF(3)); // !3 = 6
    }
}
