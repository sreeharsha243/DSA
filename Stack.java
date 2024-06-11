public class Stack {
    static class stack{
        int[] s=new int[5];
        int top=0;
        public void push(int a){
            if(top==5) {
                System.out.println("Stack is full");
            }
            else{
                s[top] = a;
                top++;
            }
        }

        public int pop(){
            int a;
            if(isempty()){
                System.out.println("Stack is empty");
            }
            top--;
            a = s[top];
            s[top] = 0;
            return a;
        }

        public int peek(){
            int a;
            a=s[top-1];
            return a;
        }

        public int size(){
            return top;
        }

        public boolean isempty(){
            return top<=0;
        }
        public void show(){
            for(int n:s){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        stack s1=new stack();
        s1.push(10);
        s1.push(5);
        s1.push(2);
        s1.push(5);
        s1.push(7);
        s1.push(10);
        s1.pop();

        s1.show();
        System.out.println(s1.peek());
        System.out.println(s1.size());
        System.out.println(s1.isempty());
    }
}
