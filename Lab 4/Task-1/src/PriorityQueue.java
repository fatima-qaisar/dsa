public class PriorityQueue {
    private static int back=-1;
    private int front=-1;

    private static Patient[] arr= new Patient[5];


    public void enqueue(Patient patient){
        if(back== arr.length-1){
            throw new RuntimeException("Queue overflow");
        }else{
          if(back==-1){
              arr[back+1]=patient;
              back=back+1;
          }else{
              back=back+1;
              sorted_insert(patient);
          }
          System.out.println("Patient [ID: "+patient.getId()+", Name: "+patient.getName()+", Severity: "+patient.getSeverity()+"] added to queue.");
        }
    }

    public void sorted_insert(Patient patient){
        int i=0;
        while(arr[i]!=null && patient.getSeverity()>=arr[i].getSeverity() && i<back){
            i=i+1;
        }
        for(int j=back; j>i; j--){
            arr[j]=arr[j-1];
        }
        arr[i]=patient;
    }

    public Patient dequeue(){
        Patient p =null;
        if (back==-1&&front==-1){
            throw new RuntimeException("Queue underflow.");
        }
        else{
            p=arr[back];
            back=back-1;
        }
      return p;
    }

    public static void printQueue(){
        for(int i=back; i>=0; i--){
           System.out.println(arr[i].toString());
        }
    }
    public static void treatPatient(){
        for(int i=back; i>=0; i--){
            System.out.println("Treating " + arr[i].toString());
        }
    }


}
