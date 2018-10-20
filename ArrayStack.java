public class ArrayStack implements Stack {

    private int top = -1;
    private Object [] arr = new Object[10];

    public void push(Object item){
        if(top == arr.length - 1){
            doubleArrSize();
        }
        arr[++top] = item;
    }
    private void doubleArrSize(){
        Object [] newArr = new Object[arr.length * 2];
        for(int i = 0; i < arr.length;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public Object pop(){
        if(!empty()){
            return arr[top--];
        }
        throw new IllegalArgumentException("Bad");
    }
    public Object peek(){
        if(!empty()){
            return arr[top];
        }
        throw new IllegalArgumentException("Bad");
    }
    public boolean empty(){
        return(top == -1);
    }
}
