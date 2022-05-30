package main;

public class ArrayClass {
    public static void main(String[] args) {
        int score1 = 100;
        int score2 = 90;
        int score3 = 50;
        int score4 = 95;
        int score5 = 85;

        int sum = score1;
        sum += score2;
        sum += score3;
        sum += score4;
        sum += score5;
        double average = sum / 5;

        int [] scores = { 100, 90, 50, 95, 85 };
        int sum2 = 0;

        for (int i = 0; i < 5; i++)
            sum2 += scores[i];
        double average2 = sum2 /5;
        System.out.println(average);
        System.out.println(average2);
    }
}
