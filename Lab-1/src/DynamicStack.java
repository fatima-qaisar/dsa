public class DynamicStack {
    private int top =-1;
    private int arr1[]=new int[4];


    public void push(int val) {
       if (top == arr1.length-1) {
           int arr2[] = new int[arr1.length * 2];
           for (int i = 0; i < arr1.length; i++) {
               arr2[i] = arr1[i];
           }
           arr1 = arr2;
           System.out.println("Stack full. Resizing to " + arr2.length);
       }
       arr1[++top]=val;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr1[top--];
    }

    public void printStack() {
        if(top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr1[i]);
        }
    }
    public int peek() {
        if(top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr1[top];
}

    public String searchStack(int val) {
        for (int i = top; i >= 0; i--) {
            if (arr1[i] == val) {
                return "Value found.";
            }
        }
        return "Value not found";
    }

    public int elementFreq(int val){
        int count=0;
        for(int i = top; i >=0; i--) {
            if (arr1[i] == val) {
                count++;
            }
        }
        return count;
    }

}
