package app;

public class Stack {
    private Person[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        arr = new Person[capacity];
        top = -1;
    }

    public Stack(Person[] inputArr) {
        capacity = inputArr.length;
        arr = new Person[capacity];
        top = -1;
        for (Person p : inputArr) {
            push(p);
        }
    }

    public void push(Person p) {
        if (top < capacity - 1) {
            arr[++top] = p;
        }
    }

    public void push(Person p1, Person p2) {
        push(p1);
        push(p2);
    }

    public Person pop() {
        if (top >= 0) {
            return arr[top--];
        }
        return null;
    }

    public void pop(int n) {
        for (int i = 0; i < n; i++) {
            Person p = pop();
            if (p != null) p.displayPerson();
        }
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            arr[i].displayPerson();
        }
    }

    public void display(int n) {
        for (int i = top; i >= Math.max(0, top - n + 1); i--) {
            arr[i].displayPerson();
        }
    }
}
