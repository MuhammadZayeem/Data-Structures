public class CircularQueue {
        LinkedList list;

        public CircularQueue(){
            list=new LinkedList();
        }

        public void enqueue(int input){
           list.InsertAtLast(input);
        }
        public int dequeue(){
            Node node=list.DeleteFromStart();
            if(node==null){
                return -1;
            }
            return node.value;
        }
        public void display(){
            list.display();
            }
        }

