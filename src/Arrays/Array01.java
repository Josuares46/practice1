package Arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] first = new int[] { 1, 2, 4, 5, 6, 7, 8, 9, 0 };
        System.out.println(first.toString());
        for (int i = 0; i < first.length; i++) {
            System.out.println(first[i]);
            // yeah it works wow

        }
        
        int[][] second = new int[4][5];
        second[2][3] = 45;
        System.out.println(second[2][3]);

    }
}
