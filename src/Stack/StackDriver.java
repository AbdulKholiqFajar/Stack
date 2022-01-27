package Stack;
public class StackDriver {
    public static void main(String[] args) {
    Stack st=new Stack(5);
    st.push(8);
    st.push(7);
    st.push(10);
    st.push(6);
    st.pop();
    st.push(5);
    st.push(12);
    while(!st.isEmpty()){
        long value=st.pop();
        System.out.print(value+" ");
    }
    System.out.println();
}
    }
    
