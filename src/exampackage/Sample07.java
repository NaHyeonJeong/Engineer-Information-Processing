package exampackage;

class Employee {
    // 속성 : 클래스 이용해서 객체 생성 시 초기값을 설정하지 않으면 기본값을 초기값으로 설정함
    String name; // String = null
    int idNum; // int = 0, float = 0.0f, double = 0.0
    int salary;
    boolean sex; // boolean = false
}

public class Sample07 {
    /**
     * study : object
     * Employee 클래스는 Sample07 밖에 위치함
     */
    public static void main(String[] args) {
        // 객체 만들기
        Employee employee = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee.name = "홍길동";
        employee.idNum = 17001;
        employee.salary = 1230498;
        employee.sex = true;

        System.out.println("-----------------------------");
        System.out.printf("employee's name is %s\n", employee.name);
        System.out.printf("%d\n", employee.idNum);
        System.out.printf("%d\n", employee.salary);
        System.out.printf("%b\n", employee.sex);
        System.out.println("-----------------------------");

        employee2.name = "고길동";
        System.out.printf("employee2's name is %s\n", employee2.name);
        System.out.println("-----------------------------");

        System.out.printf("employee3's salary is %d\n", employee3.salary);
        System.out.printf("employee3's sex is %b\n", employee3.sex);
    }
}
