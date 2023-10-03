public class QueueArray {

    private int front;  // 배열의 앞 부분, 제거할 데이터
    private int back;   // 배열의 뒷 부분, 최근 추가한 데이터
    private int size;
    private int[] value;

    public QueueArray(int size){
        front = -1;
        back = -1;
        this.size = size;
        value = new int[size];
    }

    void push(int data){
        if (back == size - 1) { return; }
        value[++back] = data;
    }

    int pop(){
        if (front == back) { return Integer.MIN_VALUE; }
        return value[++front];
    }

    void print(){
        for (int i = front + 1; i <= back; i++){
            System.out.print(value[i] + " - ");
        }
    }
}
