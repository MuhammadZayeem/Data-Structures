//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Patient p1=new Patient(01,"Ahad",1);
        Patient p2=new Patient(02,"Zayeem",2);
        Patient p3=new Patient(03,"Muneeb",3);
        Patient p4=new Patient(04,"Subhan",2);
        Patient p5=new Patient(05,"Hamza",5);

        PriorityQueue p=new PriorityQueue(5);
        p.enqueue(p1);
        p.enqueue(p2);
        p.enqueue(p3);
        p.enqueue(p4);
        p.enqueue(p5);

        p.display();

        p.dequeue();
        p.dequeue();

        p.display();

    }
}