public class DynamicStack {
    private int top =-1;
    private int arr1[]=new int[4];


    public void push(int val) {
       if (top>= arr1.length) {
            int arr2[]=new int[arr1.length+1];
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
    public int peek() {
        return arr1[top];
    }

    public String searchStack(int val) {
        for (int i = 0; i <= top; i++) {
            if (arr1[i] == val) {
                return "Value found.";
            }
        }
        return "Value not found";
    }

    public int elementFreq(int val){
        int count=0;
        for (int i = 0; i <= top; i++) {
            if (arr1[i] == val) {
                count++;
            }
        }
        return count;
    }

}
