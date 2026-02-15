public class ArrayStack {
    private int top = -1;
    private int[] arr = new int[5];

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
            return 0;
        }
        int v = arr[top];
        --top;
        return v;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]);
        }
    }

    public int peek() {
        return arr[top];
    }

    public String searchStack(int val) {
        for (int i = 0; i <= top; i++) {
            if (arr[i] == val) {
                return "Value found.";
            }
        }
        return "Value not found";
    }

    public int elementFreq(int val){
        int count=0;
        for (int i = 0; i <= top; i++) {
            if (arr[i] == val) {
                count++;
            }
        }
        return count;
    }
}

