public class Main {
    public static void main(String[] args){
       Patient p1=new Patient(101, "Ali", 3);
       Patient p2=new Patient(102, "Sara", 5);
       Patient p3=new Patient(103, "Ahmad", 2);
       Patient p4=new Patient(104, "Sara", 4);
       Patient p5=new Patient(105, "Ahmad", 1);
       PriorityQueue priorityQueue=new PriorityQueue();

        priorityQueue.enqueue(p1);
        priorityQueue.enqueue(p2);
        priorityQueue.enqueue(p3);
        priorityQueue.enqueue(p4);
        priorityQueue.enqueue(p5);
        System.out.println("Current waiting list: ");
        PriorityQueue.printQueue();
        System.out.println("Dequeue: "+priorityQueue.dequeue().toString());
        System.out.println("\nTreating patients in order of severity:");
        PriorityQueue.treatPatient();
    }
}
