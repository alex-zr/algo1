package session4;

public class LinkListTest1 {
    public static void main(String[] args) {
        LinkList list = new LinkList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);

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
