class queque{
    int q[]=new int[5];
    int size;
    int front;
    int rear;

    public void enqueque(int data){
      q[rear]=data;
      rear=(rear+1)%5;
      size++;
    }

    public int dequeue(){
        int data=q[front];
        front=(front+1)%5;
        size--;
        return data;
    }
    public void show(){
        System.out.print("Elements: ");
        for(int i=0;i<size;i++){
            System.out.print(q[(front+i)%5]+" ");
        }
        System.out.println();
        for(int i:q){
            System.out.print(i);
        }
    }
}

public class Queue {
    public static void main(String args[]){
        queque q=new queque();
        q.enqueque(5);
        q.enqueque(1);
        q.enqueque(2);
        q.dequeue();
        q.dequeue();
        q.enqueque(3);
        q.enqueque(4);
        q.enqueque(9);
        q.enqueque(5);
        q.show();
    }
}

