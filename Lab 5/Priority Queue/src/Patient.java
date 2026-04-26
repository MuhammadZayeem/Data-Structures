public class Patient {
    int id;
    String name;
    int severity;

    public Patient(int id,String name,int severity){
        this.id=id;
        this.name=name;
        this.severity=severity;
    }

    public String toString(){
        return "ID : "+id+", Name : "+name+", Severity : "+severity;
    }
}
