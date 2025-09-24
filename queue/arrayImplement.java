public class arrayImplement{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        public Queue(int n){
            arr= new int[n];
            size=n;
            rear=-1;
            front=-1;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            // return rear==size;
            return ((rear+1)%size)==front;
        }
        public static void add(int val){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear= (rear+1)%size;
            arr[rear]= val;
        }
        public static void remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            // for(int i=0; i<rear; i++){
            //     arr[i]= arr[i+1];
            // }
            if(front==rear){
                front = rear = -1;
            }else{
            front= (front+1)%size;
            }
        }

        public static int peek(){
            // return arr[0];
            return arr[front];
        }
    }
    public static void main(String[] args){
        Queue q= new Queue(5);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}