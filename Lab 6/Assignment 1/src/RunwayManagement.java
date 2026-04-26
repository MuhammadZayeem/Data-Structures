//Muhammad Zayeem
//SP25-BCS-112
public class RunwayManagement {
    int size;
    int rear;
    Plane Queue[];

    public RunwayManagement(int size) {
        this.size=size;
        rear=-1;
        Queue=new Plane[size];
    }

    public void enqueue(Plane p){
        if(rear==size-1){
            System.out.println("Queue is already full..!");
            return;
        }
        rear++;
        Queue[rear]=p;
    }
    public void dequeue(){
        if(rear==-1){
            System.out.println("No Planes in queue...");
            return;
        }
        int HighestSeverity =0;
        for(int i=1; i<=rear; i++){
            if(Queue[i].FuelLevel<Queue[HighestSeverity].FuelLevel){
                HighestSeverity = i;
            }
        }
        System.out.println("Next Plane to be landed : [PIA-" + Queue[HighestSeverity].PlaneID+"], Fuel Level : ["+Queue[HighestSeverity].FuelLevel);
        for(int i=HighestSeverity;i<rear;i++){
            Queue[i]=Queue[i+1];
        }
        rear--;
    }
    public void display(){
        if(rear==-1){
            System.out.println("Queue is empty,Nothing to show...!");
            return;
        }
        for(int i=0; i<=rear; i++){
            System.out.println(Queue[i]);
        }
    }
}
