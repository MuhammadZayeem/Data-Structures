public class Playlist {
        public Song head;
        public Song tail;
        public int size;

    public Playlist() {
        this.size = 0;
    }
    //-----------------------------------Add new Song
    public void InsertAtStart(int ID, String Title, String Artist, int duration){

        Song song = new Song(ID, Title, Artist, duration);
        if(head == null){
            head = tail = song;
            tail.nextaddress = head;
        }
        else {
            song.nextaddress = head;
            head = song;
            tail.nextaddress = head;
        }
        size++;
    }
    public void InsertAtLast(int ID, String Title, String Artist, int duration){
        Song song=new Song(ID,Title,Artist,duration);
        if(head==null){
            head=tail=song;
            tail.nextaddress = head;
            size++;
            return;
        }
        tail.nextaddress = song;
        tail = song;
        tail.nextaddress = head;
        size++;
    }
    public void addSongAtIndex(int index,int ID, String Title, String Artist, int duration){
        if(head==null){
            InsertAtStart(ID,Title,Artist,duration);
            return;
        }
        if(index==size) {
            InsertAtLast(ID, Title, Artist, duration);
            return;
        }
            Song temp=head;
            int count=0;
            while(count!=index){
                temp=temp.nextaddress;
                count++;
            }
            Song song=new Song(temp.nextaddress,ID,Title,Artist,duration);
            temp.nextaddress=song;
            size++;
    }
//-------------------------------------Remove Song from Playlist
        public void DeleteFromStart(){
            if(head==null){
                System.out.println("There is nothing to delete...");
                return;
            }
            head=head.nextaddress;
            size=size-1;
        }

    public void DeleteFromEnd(){
        if(head == null){
            System.out.println("There is nothing to delete...");
            return;
        }
        if(head == tail){
            head = tail = null;
            size--;
            return;
        }
        Song temp = head;
        while(temp.nextaddress != tail){
            temp = temp.nextaddress;
        }
        temp.nextaddress = head;
        tail = temp;
        size--;
    }
    public void DeleteSongByID(int givenID){
        if(head == null){
            System.out.println("There is nothing to delete...");
            return;
        }
         if(head.ID == givenID){
            if(head == tail){
                head = tail = null;
            } else {
                head = head.nextaddress;
                tail.nextaddress = head;
            }
            size--;
            return;
        }
        Song temp = head;
            while(temp.nextaddress.ID!=givenID){
                temp=temp.nextaddress;
            }
            if(temp.nextaddress==null){
                System.out.println("ID not Found..");
                return;
            }
            temp.nextaddress=(temp.nextaddress).nextaddress;
            size--;
        }
//------------------------------------------------Display Songs
public void display(){
    Song temp=head;
    do{
        System.out.println("["+temp.toString()+"]->");
        temp=temp.nextaddress;
    }while(temp!=head);
    System.out.println("List Finished");
}

}
