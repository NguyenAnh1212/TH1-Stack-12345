import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
// tạo 1 LinkedList
    public MyGenericStack() {
        stack = new LinkedList();
    }
// Thêm phần tử element vào đỉnh stack
    public void push(T element){
        stack.addFirst(element);
    }

// Kiểm tra nếu mảng ko rỗng thì xóa bỏ phần tử trên đầu của stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

// Xác định độ dài của stack
    public int size() {
        return stack.size();
    }
// Khai báo phương thức kiểm tra stack rỗng
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }


}
