package collection.set.javaset;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;

public class JavaSetMain {

    public static void main(String[] args) {

        run(new HashSet<>()); // 내부적으로 해시코드 & 해시인덱스 기반 순서 만들어짐 - O(1)
        run(new LinkedHashSet<>()); // 입력 순서 유지 - O(1)
        run(new TreeSet<>()); // 데이터 값 기준 정렬 - O(log N)

    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

}
