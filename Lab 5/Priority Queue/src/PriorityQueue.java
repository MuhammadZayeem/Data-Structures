public class PriorityQueue {
    int rear;
    int size;
    Patient Queue[];
    Patient p;


    public PriorityQueue(int size){
        rear=-1;
        this.size=size;
        Queue=new Patient[size];
    }
    public void enqueue(Patient patient){
        if(rear==size-1){
            System.out.println("Queue is Already full...");
        }
        else {
            if(rear==-1){
                Queue[rear+1]=patient;
                System.out.println(patient.toString()+" Added Successfully");
            }
            else {
                rear=rear+1;
                sorted_insert(patient);
                System.out.println(patient.toString()+" Added Successfully");
            }
        }
    }
    public void sorted_insert(Patient patient){
        int i=0;
        while(i<rear&&patient.severity>=Queue[i].severity){
            i=i+1;
        }
        for(int j=rear;j>i;j--){
            Queue[j]=Queue[j-1];
        }
        Queue[i]=patient;
    }
    public void dequeue(){
        if(rear==-1){
            System.out.println("Queue is Already empty");
        }
        else{
            p=Queue[rear];
            rear=rear-1;
            System.out.println(p.toString()+" Removed Successfully");
        }
    }
    public void display(){
        if(rear==-1){
            System.out.println("Queue is Empty");
        }
        else{
            for(int i=0;i<=rear;i++){
                System.out.println(Queue[i].toString());
            }
        }
    }
}
