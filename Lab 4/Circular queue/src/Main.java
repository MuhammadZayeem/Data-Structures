//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1=new Student(1,"zayeem");
        Student s2=new Student(2,"Hamza");
        Student s3=new Student(3,"Subhan");
        Student s4=new Student(4,"Ahad");
        Student s5=new Student(5,"Muneeb");
        Student s6=new Student(6,"Ahmad");


        CircularQueue queue=new CircularQueue(5);
        queue.enqueue(s1);
        queue.enqueue(s2);
        queue.enqueue(s3);
        queue.enqueue(s4);
        queue.enqueue(s5);
        queue.enqueue(s6);


        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.display();

    }
}