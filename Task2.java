import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Task2 {
    public static List<Interger> getRandomList() {
        int size = 20;
        List<Interger> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list.toString());
        return list;
    }

    public static List<Interger> deletEvenNum(List<Interger> list) {
        for (Iterator<Interger> iterator = list.iterator(); iterator.hasNext();) {
            Interger number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }

        }
        System.out.println(list.toString());
        return list;
    }

    public static void main(String[] args) {
        deletEvenNum(getRandomList());
    }
}
// я не понимаю в чем у меня ошибка в 13 и 22 строке 