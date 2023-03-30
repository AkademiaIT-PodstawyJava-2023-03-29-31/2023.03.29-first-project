public class PetlaFor {
    public static void main(String[] args) {
        int[] tab = new int[10];

        //zmienna i ma zasięg bloku kodu w którym została zadeklarowana ({ })
        //int i = 7;

        // i zostaje zapomniane kieudy skończy się pętla (zasięg mniennej i)
        for(int i = 0; i < 10; i++) {
            tab[i] = i*5;
        }
/*
        // petla for each nie mozemy uzupelnic tablicy
        for(int element : tab) {
            tab[element] = 5;
        }*/

        /*for(int i = 0; i < 10; i++) {
            System.out.println(tab[i]);
        }*/

        for(int elementTablicy : tab) {
            System.out.println(elementTablicy);
        }

        System.out.println("Koniec programu !!");
    }
}
