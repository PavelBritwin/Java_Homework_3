// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

package Java_homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> l = new ArrayList<Integer>();
        Integer sum = 0;
        for (Integer item = 0; item < 10; item++)
        {
            l.add(rnd.nextInt(1,15));
            sum += l.get(item);
        }
        System.out.println(l);
        System.out.println("Максимальный элемент списка: "+ Collections.max(l));
        System.out.println("Минимальный элемент списка: "+ Collections.min(l));
        System.out.println("Среднее арифметическое списка: "+ (double)sum/l.size());
    }
}
