package Practicum_1;

import java.util.Random;
class Assignment_3 {
    public static void main(String[] args) {
        int count = 1;
        while (count < 11) {
            Random rand = new Random();
            double double_random=rand.nextDouble();
            System.out.println("Random double value between 0.0 and 1.0 : "+double_random);
            count++;
        }
    }
}

