public class main {
    public static void main(String[] args) {
            Playlist list = new Playlist();
            list.InsertAtStart(001,"A","Havi",2);
            list.InsertAtStart(002,"B","Havi",1);
            list.InsertAtStart(003,"C","Havi",3);
            list.InsertAtStart(004,"D","Havi",6);
            list.InsertAtStart(005,"E","Havi",2);
            list.InsertAtStart(006,"F","Havi",4);
            list.InsertAtStart(007,"G","Havi",3);
            list.display();
            list.DeleteSongByID(5);
            list.display();

    }
}
