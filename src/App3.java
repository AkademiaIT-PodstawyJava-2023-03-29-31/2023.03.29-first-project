public class App3 {
    public static void main(String[] args) {
        int wielkosc = 10;
        int[] ages = new int[wielkosc];
        ages[0] = 5;
        ages[1] = 10;
        ages[2] = 15;

        wielkosc = 15;
        int[] tab = new int[wielkosc];

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[1] + ages[2]);

        System.out.println(ages[8]);

        //to nie wypisuje całej tablicy (referencja)
        System.out.println(ages);

        int[] liczby = {1,2,3,4,5,6};
        System.out.println(liczby[0]);
        System.out.println(liczby[4]);

        int n = 4;
        double[] liczby2 = {0, n, n*2};
        System.out.println(liczby2[0]);

        //1 dem - row, 2 dem - col
        int[][] tab2D = new int[3][3];
        int row = 1;
        int col = 2;
        tab2D[row][col] = 5;
        row = 0;
        col = 0;
        tab2D[row][col] = 3;

        int[][][] tab3D = new int[5][5][5];

        int[][] tab2 = {
                {1,2,3},
                {2,3,4},
                {3,4,5},
                {4,5,6}
        };
    }
}
