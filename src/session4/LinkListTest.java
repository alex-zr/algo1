package session4;

public class LinkListTest {
    public static void main(String[] args) {
        LinkList list = new LinkList();
//        list.addTail(1);
//        list.addTail(2);
//        list.addTail(3);
//        list.addTail(4);
//        list.addTail(5);
//        list.addTail(6);

        list.addHead(1);
        list.addHead(2);
        list.addHead(3);
        list.addHead(4);
        list.addHead(5);
        list.addHead(6);
        System.out.println(list.get(2)); // 4
        System.out.println(list);
    }
}
