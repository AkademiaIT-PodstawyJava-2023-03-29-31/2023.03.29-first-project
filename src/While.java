public class While {
    public static void main(String[] args) {

        int i = 20;
        //warunek sprawdzany na początku (może się stać że pętla nie wykona się ani razu
        while(i < 10) {
            System.out.println(i);
            i++;
        }

        int j = 20;
        //warunek sprawdzany na końcu, pętla wykona się zawsze przynajmniej raz
        do {
            System.out.println(j);
            j++;
        } while(j < 10);

        /*while (true) {
            //???
            //???
            if(?) {
                break;
            }
            //??
            //??
            //???

            if(??) {
                break;
            }
        }*/
    }
}
