import custom_list.CustomArrayList;
import custom_list.CustomLinkedList;
import example.User;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        // операции
        // * търсене на информация      - SELECT
        // collection[5]
        // * актуализация               - UPDATE
        // collection[5]                = 5;
        // * добавяне на информация     - INSERT
        // * изтриване на информация    - DELETE
        int[] collection = new int[10];

        // държавен Java клас
        // ArrayList<Integer> collectionList = new ArrayList<>();
        // collectionList.add(10);

//        CustomArrayList<User> listCollection = new CustomArrayList<>();
//        listCollection.add(new User("Mihail", "Petrov"));
//        listCollection.add(new User("Todor", "Petrov"));

        CustomLinkedList<User> llistCollection = new CustomLinkedList<>();
//        llistCollection.add(1);
//        llistCollection.add(2);
//        llistCollection.add(3);
//        llistCollection.add(4);
//        llistCollection.add(5);
//        llistCollection.add(6); // TODO да помислим защо
        // llistCollection.traverse();

        llistCollection.add(new User("Mihail", "Petrov"));
        llistCollection.add(new User("Todor", "Petrov"));
        llistCollection.add(new User("Anton", "Petrov"));
        llistCollection.add(new User("Vasko", "Petrov"));
        llistCollection.add(new User("Petar", "Petrov"));
        // llistCollection.add(6); // TODO да помислим защо

        System.out.println(llistCollection.get(3).getFname());

    }
}
