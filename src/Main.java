import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Создайте PriorityQueue из 100 случайных чисел, выведите её на экран,
        // найдите длину и среднее значение всех чисел.
        PriorityQueue<Integer> MyQueue = new PriorityQueue<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int rand = random.nextInt(1000);
            MyQueue.add(rand);
        }
        System.out.println(MyQueue);
        System.out.println("MyQueue size: " + MyQueue.size());

        int sum = 0;
        for (int i = 0; i < 100; i++) {
             sum += MyQueue.poll();
        }
        System.out.println("Sum : " +  sum);
        int sredZnach = sum/100;
        System.out.println("SredZnach : " + sredZnach);
    }
}