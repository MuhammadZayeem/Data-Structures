public class main {
    public static void main(String[] args) {
        LinkedlList list1=new LinkedlList();
        list1.InsertAtStart(6);
        list1.InsertAtStart(5);
        list1.InsertAtStart(3);
        list1.InsertAtStart(2);
        list1.InsertAtStart(1);
        list1.InsertAtLast(7);
        list1.InsertAtIndex(4,2);
        list1.display();
        LinkedlList list =new LinkedlList();
        list.InsertAtStart(13);
        list.InsertAtStart(12);
        list.InsertAtStart(10);
        list.InsertAtStart(9);
        list.InsertAtStart(8);
        list.InsertAtLast(14);
        list.InsertAtIndex(11,2);
        list.display();
       LinkedlList list2=LinkedlList.MergeLists(list1,list);
        list2.display();
        list2.InsertAtIndex(2,2);
        list2.search(2);
//        list.ReverseDisplay();
//        list.DeleteFromIndex(2);
//        list.display();
//        list.DeleteFromStart();
//        list.display();
//        list.DeleteFromEnd();
//        list.display();
//        list.search(5);
    }
}
