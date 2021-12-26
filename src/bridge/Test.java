package bridge;

public class Test {

    public static void main(String[] args) {
        Stack<String> arrayStack = new Stack<>(new ArrayImpl<>());
        arrayStack.push("a");
        arrayStack.push("b");
        arrayStack.push("c");
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println("====================");

        Stack<String> linkedStack = new Stack<>(new LinkedImpl<>());
        linkedStack.push("a");
        linkedStack.push("b");
        linkedStack.push("c");
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println("====================");

        Queue<String> arrayQueue = new Queue<>(new ArrayImpl<>());
        arrayQueue.push("a");
        arrayQueue.push("b");
        arrayQueue.push("c");
        System.out.println(arrayQueue.popLeft());
        System.out.println(arrayQueue.popLeft());
        System.out.println(arrayQueue.popLeft());
        System.out.println("====================");

        Queue<String> linkedQueue = new Queue<>(new LinkedImpl<>());
        linkedQueue.push("a");
        linkedQueue.push("b");
        linkedQueue.push("c");
        System.out.println(linkedQueue.popLeft());
        System.out.println(linkedQueue.popLeft());
        System.out.println(linkedQueue.popLeft());
        System.out.println("====================");
    }


}
