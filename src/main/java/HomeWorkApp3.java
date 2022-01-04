public class HomeWorkApp3 {
    public static void main(String[] args) {

    }

    public static void invertArray() {
        int[] arr1 = {1, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[1] = 1;
            }
            System.out.println("arr " + arr1[i]);
        }
    }

    public static void fillArray() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
            System.out.println(arr2[i]);
        }
    }

    public static void changeArray() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (i < 6) {
                arr3[i] = i * 2;
            }
        }
    }

    public static void fillDiagonal() {
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr4[4][4] = i = j;
            }
        }
    }
}