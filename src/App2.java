public class App2 {
    public static void main(String[] args) {
        int i = 0;

        //to jest to samo
        i++;
        i = i + 1;
        //--------------
        System.out.println(i+1);
        i = i+1;
        
        System.out.println(i++); // 1
        System.out.println(++i); // 2
        System.out.println(--i); // 1
        System.out.println(i--); // 0
        System.out.println(i);
    }
}
