package Java_homework_2;
import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task1 {
    public static void main(String[] args) throws SecurityException, IOException {
            Logger log = Logger.getLogger(Task1.class.getName());
            FileHandler fh = new FileHandler("log.txt");
            SimpleFormatter sf = new SimpleFormatter();
            log.addHandler(fh);
            fh.setFormatter(sf);
            Random rnd = new Random();
            String result = "";
            int [] arr = new int[10];
            for (int i = 0; i < 10; i++)
            {
                arr[i] = rnd.nextInt(1, 11);
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            for (int j = 0; j < arr.length; j++)
            {
                int change = 0;
                for (int k = 1; k < arr.length; k++)
                {
                    if (arr[k - 1] > arr[k])
                    {
                        change = arr[k - 1];
                        arr[k - 1] = arr[k];
                        arr[k] = change;
                    }
                }
                for (int item : arr)
                {
                    result += item + " ";
                }
                log.info(result);
                result = "";
                if (change == 0){
                    break;
                }
            }
    }
}
