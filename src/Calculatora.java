import java.util.Scanner;

import java.util.Scanner;

public class Calculatora {
    Scanner sc = new Scanner(System.in);

    public Double plus() {
        System.out.println("输入第一个数字");
        double n1 = sc.nextDouble();
        System.out.println("输入第二个数字");
        double n2 = sc.nextDouble();
        return n1 + n2;
    }

    public Double minus() {
        System.out.println("输入第一个数字");
        double n1 = sc.nextDouble();
        System.out.println("输入第二个数字");
        double n2 = sc.nextDouble();
        return n1 - n2;
    }

    public Double multiply() {
        System.out.println("输入第一个数字");
        double n1 = sc.nextDouble();
        System.out.println("输入第二个数字");
        double n2 = sc.nextDouble();
        return n1 * n2;
    }

    public Double divide() {
        System.out.println("输入第一个数字");
        double n1 = sc.nextDouble();
        System.out.println("输入第二个数字");
        double n2 = sc.nextDouble();
        if (n2 == 0) {
            System.out.println("除数不能为0");
            return null;
        }
        return n1 / n2;
    }
}
