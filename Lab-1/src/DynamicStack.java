public class DynamicStack {
    private int top =-1;
    private int arr1[]=new int[4];
    private int arr2[]=new int[arr1.length+1];

    public void push(int val) {
        if (top == arr1.length - 1) {
            System.out.println("Stack is full");
        }
        else if (top>= arr1.length) {
            arr1 =arr2;
            arr1[++top] = val;
        }
        else {
            arr1[++top] = val;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return 0;
        }
        int v = arr1[top];
        --top;
        return v;
    }
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr1[i]);
        }
    }

}
