import java.util.Scanner;

public class Task03 {
    //3．读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的*。
    public static void main(String[] args) {
        printStar();
    }
    private static void printStar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请依次输入7个数，每次输入完就按一下回车");
        double[] arr = new double[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextDouble();
            if (arr[i] < 1 || arr[i] > 50) {
                System.out.println("输入错误，请重新输入");
                i--;
            } else {//
                for (int j = 0; j <(int) arr[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


}
