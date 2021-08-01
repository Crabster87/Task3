import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        /** Самый подробный вариант для чайников
         *
         */
        List<String> collection1 = new ArrayList<>();                       //  создаёшь первую коллекцию
        collection1.add("Oleg");                                            //
        collection1.add("Dima");                                            //
        collection1.add("Masha");                                           //  поочереди добавляешь в неё каждое имя
        collection1.add("Mira");                                            //
        collection1.add("Olga");                                            //

        List<String> collection2 = new ArrayList<>();                       //
        collection2.add("Mira");                                            //
        collection2.add("Oleg");                                            // аналогично
        collection2.add("Olga");                                            //

        Iterator<String> iterator = collection1.iterator();                 // создаёшь специальный объект итератор,
                                                                            // который позволяет перебирать каждый элемент
                                                                            // коллекции и удалять во время перебора.
                                                                            // Без его создания перебирать можно, но
                                                                            // удалять при этом не получится!
        while (iterator.hasNext()) {                                        // В условии цикла "пока есть следующий элемент"
            if (collection2.contains(iterator.next())) iterator.remove();   // Если коллекция2 содержит такой элемент,
                                                                            // то удаляем его.
        }                                                                   //

        for (String name :                                                  // А тут цикл фор-ич чисто для печати,
                collection1) {                                              // можно и обычным, но этот больше подходит
                                                                            // для коллекций
            System.out.println(name);                                       // здесь просто печать каждыый раз
        }                                                                   // с новой строки

        /** Более крутой вариант
         * Смотри сам, стоит ли выделываться. Первые 2 строки просто создают коллекции, это так называемая быстрая
         * инициализация списка. Короче гораздо хотя смысл один.
         * Логика удаления и печати вся в третьей строке. Создаем стрим из коллекции1 (метод stream()), далее
         * методом filter() из нашего стрима создаем новый стрим, в который попадают только элементы, которых нет в
         * коллекции2(s -> !collection2.contains(s)), где -> лямбда-выражение. Далее методом forEach(System.out::println)
         * печатаем каждый оставшийся элемент с новой строки. Результат тот же!
         */

//        List<String> collection1 = Arrays.asList("Oleg", "Dima", "Masha", "Mira", "Olga");
//        List<String> collection2 = Arrays.asList("Mira", "Oleg", "Olga");
//        collection1.stream().filter(s -> !collection2.contains(s)).forEach(System.out::println);

    }

}
