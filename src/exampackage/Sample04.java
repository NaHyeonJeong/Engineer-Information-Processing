package exampackage;

public class Sample04 {
    /**
     * study : array
     */
    public static void main(String[] args) {
        // new : 메모리 공간을 할당 받겠다는 의미
        int[] a = new int[5]; // 객체
        int i;

        for(i = 0; i < a.length; i++) {
            a[i] = i + 10;
            System.out.printf("a[%d] = %4d\n", i, a[i]);
        }

        /*for(int k: a){
            System.out.printf("%4d\n", k);
        }*/
    }
}
