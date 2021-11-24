package Exercise;

public class E1_13 {
    public static int[][] transfer(int mn[][]) {
        int newMn[][];
        newMn = new int[mn[0].length][mn.length];
        System.out.println("原始数组");
        print2Arr(mn);
        System.out.println("转置数组");
        for(int i = 0; i < mn.length; i++) {
            for (int j = 0; j < mn[0].length; j++) {
                newMn[j][i] = mn[i][j];
            }
        }
        return newMn;
    }

    public static void print2Arr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int initArr[][] ={{1,2,3,4,5}, {6,7,8,9,10},{10,12,13,14,15}} ;
        int a[][] =  transfer(initArr);
        print2Arr(a);
    }
}
