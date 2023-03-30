public class SterowaniePetla {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                //przerywa dzialanie petli
                //break;
                //przerywa biezaca iteracje petli
                continue;
            }
            System.out.println(i);
        }
    }
}
