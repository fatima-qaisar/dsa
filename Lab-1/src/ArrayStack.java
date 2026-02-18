public class ArrayStack {
    private  int top = -1;
    private  int[] arr;
    private int size;

    ArrayStack(int size){
          this.size=size;
          arr=new int[size];
    }

    public void push(int val) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = val;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr[top--];
    }

    public void printStack() {
        if(top == -1){
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public int peek() {
        if (top == -1){
            return -1;
        }
        return arr[top];
    }

    public String searchStack(int val) {
        for (int i = top; i >= 0; i--) {
            if (val == arr[i]) {
                return "Value found.";
            }
        }
        return "Value not found";
    }

    public int elementFreq(int val){
        int count=0;
        for (int i = top; i >= 0; i--) {
            if (arr[i] == val) {
                count++;
            }
        }
        return count;
    }
}

