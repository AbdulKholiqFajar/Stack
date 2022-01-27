package Stack;
public class Stack {
    private int ukuran;
    private long[] data;
    private int top;
    public Stack(int a){
        ukuran=a;
        data=new long[ukuran];
        top=-1;
    }
    public void push(long j){
        data[++top]=j;
    }
    public long pop(){
        return data[top--];
    }
    public long peak(){
        return data[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==ukuran-1);
    }
}
