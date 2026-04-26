public class Song {
    public int ID;
    public String Title;
    public String Artist;
    public int duration;
    public Song nextaddress;

    public Song(Song nextaddress, int ID, String Title, String Artist, int duration) {
        this.nextaddress = nextaddress;
        this.ID=ID;
        this.Title=Title;
        this.Artist=Artist;
        this.duration=duration;
    }
    public Song(int ID, String Title, String Artist, int duration){
        this.ID=ID;
        this.Title=Title;
        this.Artist=Artist;
        this.duration=duration;
    }
//-------------------------------------Display
    public String toString(){
            return "ID : "+ID+", Artist : "+Artist+", Title : "+Title+", Duration : "+duration;
        }
}
