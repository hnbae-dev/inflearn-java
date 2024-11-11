package collection.link;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();

        // 마지막에 추가 - O(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        System.out.println();

        System.out.println("==첫번째 항목 추가==");
        list.add(0, "d"); // O(1)
        System.out.println(list);
        System.out.println();

        System.out.println("==첫번째 항목 삭제==");
        list.remove(0); // O(1)
        System.out.println(list);
        System.out.println();

        System.out.println("==중간 항목 추가==");
        list.add(1, "e"); // O(n)
        System.out.println(list);
        System.out.println();

        System.out.println("==중간 항목 삭제==");
        list.remove(1); // O(n)
        System.out.println(list);
        System.out.println();

    }

}
