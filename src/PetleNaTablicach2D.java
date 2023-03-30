public class PetleNaTablicach2D {
    public static void main(String[] args) {
        int[][] tab = new int[7][10];

        for(int row = 0; row < tab.length; row++) {
            for(int col = 0; col < tab[row].length; col++) {
                tab[row][col] = row * tab[row].length + col;
            }
        }

        /*for(int row = 0; row < tab.length; row++) {
            for(int col = 0; col < tab[row].length; col++) {
                System.out.print(tab[row][col] + " ");
            }
            System.out.println();
        }*/

        for(int[] row : tab) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
