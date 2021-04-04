package exampackage;

public class Hello001 {

    public static void main(String[] args) {

        System.out.printf("Hello Java, Hello IntelliJ\n");
        System.out.println("으아아아아 살려줘");

        for(int i = 0; i < 10; i++){
            System.out.println("i is = " + i);
            if(i == 7) {
                System.out.println("This time i is seven, so break \"for\" statement");
                break;
            }
        }

    }
}
