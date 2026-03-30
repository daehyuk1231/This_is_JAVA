package ch04.sec04;

public class PrintFromTo10Example {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("1부터 100까지 3의 배수의 합: " + sum);

        // while문으로 1부터 100까지 3의 배수의 합
        int sum2 = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                sum2 += i;
            }
            i++;
        }
        System.out.println("1부터 100까지 3의 배수의 합: " + sum2);
    }
}
