public class App4 {
    public static void main(String[] args) {
        int a = 10;

        //System.out.println(a == 5);
        // zawsze tylko jeden blok kodu sie wykona
        // instrukcji else if - dowolna ilość (może być 0)
        // instrukcja else (sam) zawsze ostatni
        /*if(a > 0 && a < 5) {
            //System.out.println("Spelniony pierwszy warunek !!");
            System.out.println("To jest 5 !!!");
        } else if(a > 0) {
            //System.out.println("Spelniony drugi warunek !!");
            System.out.println("To jest 6 !!!");
        } else if(a < 5) {
            System.out.println("To jest 7 !!!");
        } else {
            System.out.println("Cos innego !!!");
        }*/

        /*if(a > 0) {
            if(a > 10) {
                System.out.println("do jest dodatnia liczba wieksza od 10 !!");
            } else {
                System.out.println("to jest dodatnia liczba !!");
                System.out.println("jeszcze ma sie to zrobic jak jest else !!!");
            }
        } else {
            System.out.println("To jest ujemna liczba");
        }

        if(a > 0 && a > 10) {
            System.out.println("do jest dodatnia liczba wieksza od 10 !!");
        } else if(a > 0) {
            System.out.println("to jest dodatnia liczba !!");
        } else {
            System.out.println("To jest ujemna liczba");
        }*/

        int x = 30;
        String imie = "Karol";
        switch(imie) {
            case "Janusz":
                System.out.println("1 !!");
                break;
            case "Karol":
                System.out.println("2 !!");
            case "Zbyszek":
                System.out.println("3 !!");
                break;
            default:
                System.out.println("cos innego !!");
                break;
        }


        // UWAGA NA KONCU JEST WARUNEK Z A !!!
        /*if(imie == "Janusz") {
            System.out.println("1 !!");
        } else if(imie == "Karol") {
            System.out.println("2 !!");
        } else if(imie == "Zbyszek") {
            System.out.println("3 !!");
        } else if(imie == "Zbyszek") {
            System.out.println("3 !!");
        }else if(imie == "Zbyszek") {
            System.out.println("3 !!");
        }else if(imie == "Zbyszek") {
            System.out.println("3 !!");
        }else if(imie == "Zbyszek") {
            System.out.println("3 !!");
        }else if(imie == "Zbyszek") {
            System.out.println("3 !!");
        }else if(imie == "Zbyszek") {
            System.out.println("3 !!");
        }else if(imie == "Zbyszek") {
            System.out.println("3 !!");
        }else if(imie == "Zbyszek") {
            System.out.println("3 !!");
        }else if(imie == "Zbyszek" && a > 3) {
            System.out.println("3 !!");
        } else {
            System.out.println("Cos innego !!");
        }*/

        int y = 5;
        switch (y) {
            case 1:
                System.out.println("To jest 1 !!!");
                break;
            case 2:
            case 3:
                System.out.println("To jest 2 lub 3 !!!");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("to jest 4 lub 5 lub 6 !!!");
                break;
        }

        System.out.println("Koniec programu !!");
    }
}
