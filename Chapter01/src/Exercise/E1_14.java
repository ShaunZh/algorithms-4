package Exercise;

public class E1_14 {
    // 输出不大于logN的整数
    public static int lg(int N) {
        int count = 0;
        int total = 2;
        while(total <= N) {
            total = total * 2 ;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(lg(18));
    }
}

