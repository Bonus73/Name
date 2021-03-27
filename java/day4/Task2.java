package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
    int[] array = new int[100];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int max = 0;
        for(int ellement : array) {
            if(ellement > max)
                max = ellement;
        }
        System.out.println(max);

        int min = 10000;
        for (int element : array) {
            if(element < min)
                min = element;
        }
        System.out.println(min);

        int counter = 0;
        for (int ellement : array) {
            if(ellement % 10 == 0)
                counter++;
        }
        System.out.println(counter);

        int sum = 0;
        for (int ellement : array) {
            if(ellement % 10 == 0)
                sum += ellement;
        }
        System.out.println(sum);
    }
}
