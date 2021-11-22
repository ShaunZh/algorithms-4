package Exercise;
public class E1_11 {

    // 打印二维boolean数组，true使用*表示，false使用空白表示
    public static void printArray2(boolean[][] arr) {
        System.out.print(" ");
        System.out.print("  1  ");
        System.out.println("  2  ");
        for (int row = 0; row < arr.length; row++) {
            System.out.print(row + 1 + "");
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] ? "  *  ": "     ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] arr = new boolean[][]{
                {false, true},
                {true, true},
                {false, false},
                {true, false},
                {false, false},
                {false, true}
        };
        printArray2(arr);
    }
}
