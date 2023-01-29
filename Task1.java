// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Java_homework_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> l = new ArrayList<Integer>();
        for (Integer item = 0; item < rnd.nextInt(10,15); item++)
        {
            l.add(rnd.nextInt(1,15));
        }
        System.out.println(l);
        for (Iterator<Integer> i = l.iterator(); i.hasNext();)
        {
            if (i.next() % 2 == 0)
            {
                i.remove();
            }
        }
        System.out.println(l);
    }
}

