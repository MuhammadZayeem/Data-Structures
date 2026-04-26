//Muhammad Zayeem
//SP25-BCS-112
import java.util.Random;
public class main {
    public static void main(String[] args) {
        RunwayManagement Runway =new RunwayManagement(10);
        Random rand=new Random();
        for(int i=0;i<10;i++) {
            int number=rand.nextInt(20);
            Plane p=new Plane(number,i+1);
            Runway.enqueue(p);
        }

        System.out.println("Planes that are waiting to land:");
        Runway.display();
        System.out.println("\nLanding planes based on fuel priority:\n");
        for(int i=0;i<10;i++) {
            Runway.dequeue();
        }
    }
}