public class StackArray {

    private int size;   // 스택의 크기
    private int top;    // 스택의 top 지점
    private int[] value;    // 값을 저장하는 배열

    // 생성자
    // top과 배열 초기화

    public StackArray(int size){
        top = -1;
        this.size = size;
        value = new int[size];
    }

    // 값 삽입
    void push(int data){
        if (top == size - 1){ return; }
        value[++top] = data;
    }

    // top 반환과 삭제
    int pop(){
        if (top < 0){ return Integer.MIN_VALUE; }
        return value[top--];
    }

    void print(){
        for (int i = 0; i <= top; i++){
            System.out.print(value[i] + " - ");
        }
    }
}
