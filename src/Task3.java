import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        /** ����� ��������� ������� ��� ��������
         *
         */
        List<String> collection1 = new ArrayList<>();                       //  ������� ������ ���������
        collection1.add("Oleg");                                            //
        collection1.add("Dima");                                            //
        collection1.add("Masha");                                           //  ��������� ���������� � �� ������ ���
        collection1.add("Mira");                                            //
        collection1.add("Olga");                                            //

        List<String> collection2 = new ArrayList<>();                       //
        collection2.add("Mira");                                            //
        collection2.add("Oleg");                                            // ����������
        collection2.add("Olga");                                            //

        Iterator<String> iterator = collection1.iterator();                 // ������� ����������� ������ ��������,
                                                                            // ������� ��������� ���������� ������ �������
                                                                            // ��������� � ������� �� ����� ��������.
                                                                            // ��� ��� �������� ���������� �����, ��
                                                                            // ������� ��� ���� �� ���������!
        while (iterator.hasNext()) {                                        // � ������� ����� "���� ���� ��������� �������"
            if (collection2.contains(iterator.next())) iterator.remove();   // ���� ���������2 �������� ����� �������,
                                                                            // �� ������� ���.
        }                                                                   //

        for (String name :                                                  // � ��� ���� ���-�� ����� ��� ������,
                collection1) {                                              // ����� � �������, �� ���� ������ ��������
                                                                            // ��� ���������
            System.out.println(name);                                       // ����� ������ ������ ������� ���
        }                                                                   // � ����� ������

        /** ����� ������ �������
         * ������ ���, ����� �� ������������. ������ 2 ������ ������ ������� ���������, ��� ��� ���������� �������
         * ������������� ������. ������ ������� ���� ����� ����.
         * ������ �������� � ������ ��� � ������� ������. ������� ����� �� ���������1 (����� stream()), �����
         * ������� filter() �� ������ ������ ������� ����� �����, � ������� �������� ������ ��������, ������� ��� �
         * ���������2(s -> !collection2.contains(s)), ��� -> ������-���������. ����� ������� forEach(System.out::println)
         * �������� ������ ���������� ������� � ����� ������. ��������� ��� ��!
         */

//        List<String> collection1 = Arrays.asList("Oleg", "Dima", "Masha", "Mira", "Olga");
//        List<String> collection2 = Arrays.asList("Mira", "Oleg", "Olga");
//        collection1.stream().filter(s -> !collection2.contains(s)).forEach(System.out::println);

    }

}
