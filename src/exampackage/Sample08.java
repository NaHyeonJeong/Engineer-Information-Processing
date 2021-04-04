package exampackage;

public class Sample08 {
    /**
     * study : class 의 위치 변경
     * Sample08 안에 위치하면 static 을 붙여줬음
     * 메모리 공간에 계속 살려두기 위해서 static 을 붙여줌
     */
    static class AAClass {
        int idNum1;
        int idNum2;
    }

    public static void main(String[] args) {
        AAClass myVal = new AAClass();

        myVal.idNum1 = 10; // 참조변수
        myVal.idNum2 = 20;

        System.out.printf("-----before change()\nidNum1 is %d\n", myVal.idNum1);
        System.out.printf("isNum2 is %d\n", myVal.idNum2);

        myVal = change(myVal); // 객체를 전달하면 객체 안의 값들이 전달되는 효과

        System.out.printf("-----change()\nidNum1 is %d\n", myVal.idNum1);
        System.out.printf("isNum2 is %d\n", myVal.idNum2);
    }

    static AAClass change(AAClass val) { // 전달받은 객체 안의 두 값을 교환
        int temp;

        System.out.printf("-----in change()\nidNum1 is %d\n", val.idNum1);
        System.out.printf("isNum2 is %d\n", val.idNum2);

        temp = val.idNum1;
        val.idNum1 = val.idNum2;
        val.idNum2 = temp;

        return val;
    }
}
