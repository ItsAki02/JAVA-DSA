public class LL {
    public static void main(String[] args) {
    LinkedList1 list = new LinkedList1();
    list.insertFirst(3);
    list.insertFirst(8);
    list.insertFirst(17); 
    list.insertLast(99);
    list.insert(100, 3);
    list.diplay();
    System.out.println(list.delFirst());

    list.diplay();
    System.out.println(list.deleteLast());
    list.diplay();
    System.out.println(list.delete(2));
    list.diplay();
}
}
