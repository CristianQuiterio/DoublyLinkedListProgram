package prog1;

import java.util.Stack;

public class Tester2 {

    public static void main(String[] args) {        
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        DoublyLinkedList<Integer> dll2 = new DoublyLinkedList<>();
        
        //add(E e) in constant time
        
        for(int i = 0; i < 10000; i++)
        {
            dll.add(i);
            dll2.add(i);
        }
        for(int i = 0; i < 99000; i++)
        {
            dll2.add(i);
        }
        
        long startTime = System.nanoTime();
        for(int i = 0; i < 1000; i++)
        {
            dll.add(i);
        }
        long endTime = System.nanoTime();
        long time1 = endTime-startTime;
        
        startTime = System.nanoTime();
        for(int i = 0; i < 1000; i++)
        {
            dll2.add(i);
        }
        endTime = System.nanoTime();
        long time2 = endTime-startTime;
        System.out.println("add(E e)  O(n) Runtime Comparison");
        System.out.println("Runtime for 1000 integers: " + time1);
        System.out.println("Runtime for 100000 integers: " + time2);
        
        //add(E e, int 1) in linear time
        
        dll = new DoublyLinkedList<>();
        
        for(int i = 0; i < 100000; i++)
        {
            dll.add(i);
        }
        
        System.out.println("DLL Size: " + dll.size());
        startTime = System.nanoTime();
        dll.add(1, 100000);
        endTime = System.nanoTime();
        long time3 = endTime-startTime;
        
        for(int i = 0; i < 99999; i++)
        {
            dll.add(i);
        }
        
        System.out.println("DLL Size: " + dll.size());
        startTime = System.nanoTime();
        dll.add(1, 200000);
        endTime = System.nanoTime();
        long time4 = endTime-startTime;

        System.out.println("add(E e, int i) Runtime Comparison");
        System.out.println("Runtime for 100000 integers: " + time3);
        System.out.println("Runtime for 200000 integers: " + time4);


        System.out.println("3) remove(int i) is O(n)");
        System.out.println("add(E e) runs in constant time because the operations are independent of the size of the DLL");
        System.out.println("add(E e, int i) runs in linear time because there are a set number of operations for each element of the size of the DLL, in this case being just one per element.");
    
        Stack S = new Stack();
        S.push(5); S.push(3); S.push(4);
        int x;
        if( (x = (int)S.pop()) < (int)S.peek()) x = (int)S.pop();
    
    }
    
}
