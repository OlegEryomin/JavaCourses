package com.geekbrains.courses.work02;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println(isSumLimitTenBeforeTwenty(1, 5));
    }

    /**
     * @param a первое целое число
     * @param b второе целое число
     * @return true если сумма a и b лежит в пределах от 10 до 20 (включительно)
     */
    private static boolean isSumLimitTenBeforeTwenty(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }  else {
            return false;
        }
    }
}
