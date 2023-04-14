package prog1;

import java.util.Iterator;
public class Tester1 {
	
	public static void task1Test() {
		DoublyLinkedList<String> dll = new DoublyLinkedList<>();
		
		
		System.out.println("task1Test; add(E e) method");
		System.out.println("****************************");
		
		dll.add("a");
		dll.add("b");
		dll.add("c");
		
		System.out.println("added a,b,c:");
		System.out.println(dll);
		System.out.println("size: " + dll.size());
		System.out.println("****************************");
		dll.removeFirst();
		dll.removeLast();
		System.out.println("Removed first, then last");
		System.out.println(dll);
		System.out.println("size: " + dll.size());
		System.out.println("****************************");
		
		
	}
	
	public static void task2Test() {
		System.out.println("\n\n\n\n\ntask2Test; add(E e, int i) method");
		System.out.println("****************************");
		DoublyLinkedList<String> dll = new DoublyLinkedList<>();
		
		dll.add("b");
		dll.add("c");
		dll.add("d");
		
		System.out.println("added b,c,d:");
		System.out.println(dll);
		System.out.println("size: " + dll.size());
		System.out.println("****************************");
		try {
			dll.add("d", -1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught adding at i=-1: " + e.getMessage());
		}
		try {
			dll.add("d", dll.size()+1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught adding at i=size+1: " + e.getMessage());
		}
		dll.add("a", 0);
		dll.add("e", dll.size());
		System.out.println("****************************");
		System.out.println("after add(e, i) method was called at [0] and [size]:\n" + dll);
		System.out.println("size: " + dll.size());
		System.out.println("****************************");
	}
	
	public static void task3Test() {
		System.out.println("\n\n\n\n\ntask3Test; remove(int i) method");
		System.out.println("****************************");
		DoublyLinkedList<String> dll = new DoublyLinkedList<>();
		
		dll.add("b");
		dll.add("c");
		dll.add("d");
		
		System.out.println("added b,c,d:");
		System.out.println(dll);
		System.out.println("size: " + dll.size());
		System.out.println("****************************");
		try {
			dll.add("d", -1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught adding at i=-1: " + e.getMessage());
		}
		try {
			dll.add("d", dll.size()+1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught adding at i=size+1: " + e.getMessage());
		}
		dll.add("before a", 0);
		dll.add("e", dll.size());
		System.out.println("****************************");
		System.out.println("after add(e, i) method was called at [0] and [size]:\n" + dll);
		System.out.println("size: " + dll.size());
		
		System.out.println("****************************");
		try {
			dll.remove(-1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught removing at i=-1: " + e.getMessage());
		}
		try {
			dll.remove(dll.size());
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught removing at i=size: " + e.getMessage());
		}
		
		
		dll.remove(0);
		dll.remove(dll.size() - 1);
		System.out.println("****************************");
		System.out.println("after remove(i) method was called at [0] and [size-1]:\n" + dll);
		System.out.println("size: " + dll.size());
			
		
	}
	
	public static void task4Test() {
		System.out.println("\n\n\n\n\ntask4Test; get(int i) method");
		System.out.println("****************************");
		DoublyLinkedList<String> dll = new DoublyLinkedList<>();
		
		dll.add("a");
		dll.add("b");
		dll.add("c");
		
		System.out.println("added a,b,c:");
		System.out.println(dll);
		System.out.println("size: " + dll.size());
		System.out.println("****************************");
		try {
			dll.add("d", -1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught adding at i=-1: " + e.getMessage());
		}
		try {
			dll.add("d", dll.size()+1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught adding at i=size+1: " + e.getMessage());
		}
		dll.add("before a", 0);
		dll.add("d", dll.size());
		System.out.println("****************************");
		System.out.println("after add(e, i) method was called at [0] and [size]:\n" + dll);
		System.out.println("size: " + dll.size());
		
		System.out.println("****************************");
		try {
			dll.remove(-1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught removing at i=-1: " + e.getMessage());
		}
		try {
			dll.remove(dll.size());
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught removing at i=size: " + e.getMessage());
		}
		
		
		dll.remove(0);
		dll.remove(dll.size() - 1);
		System.out.println("****************************");
		System.out.println("after remove(i) method was called at [0] and [size-1]:\n" + dll);
		System.out.println("size: " + dll.size());
			
		System.out.println("****************************");
		try {
			dll.get(-1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught get() at i=-1: " + e.getMessage());
		}
		try {
			dll.get(dll.size());
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught get() at i=size: " + e.getMessage());
		}
		System.out.println("size: " + dll.size());
		
		
		System.out.println("****************************");
		System.out.println("get(0): " + dll.get(0));
		System.out.println("get("+ (dll.size()-1) + "): " + dll.get(dll.size()-1));
		System.out.println("size: " + dll.size());
		
		while(dll.size() > 0) {
			dll.removeFirst();
		}
		System.out.println("****************************");
		System.out.println("should be empty, size: " + dll.size());
		//empty list
		System.out.println("****************************");
	}
	
	public static void task5Test() {
		System.out.println("\n\n\n\n\ntask5Test; addSecond(E e) method");
		System.out.println("****************************");
DoublyLinkedList<String> dll = new DoublyLinkedList<>();
		
		dll.add("a");
		dll.add("b");
		dll.add("c");
		
		System.out.println("added a,b,c:");
		System.out.println(dll);
		System.out.println("size: " + dll.size());
		System.out.println("****************************");
		try {
			dll.add("d", -1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught adding at i=-1: " + e.getMessage());
		}
		try {
			dll.add("d", dll.size()+1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught adding at i=size+1: " + e.getMessage());
		}
		dll.add("before a", 0);
		dll.add("d", dll.size());
		System.out.println("****************************");
		System.out.println("after add(e, i) method was called at [0] and [size]:\n" + dll);
		System.out.println("size: " + dll.size());
		
		System.out.println("****************************");
		try {
			dll.remove(-1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught removing at i=-1: " + e.getMessage());
		}
		try {
			dll.remove(dll.size());
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught removing at i=size: " + e.getMessage());
		}
		
		
		dll.remove(0);
		dll.remove(dll.size() - 1);
		System.out.println("****************************");
		System.out.println("after remove(i) method was called at [0] and [size-1]:\n" + dll);
		System.out.println("size: " + dll.size());
			
		System.out.println("****************************");
		try {
			dll.get(-1);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught get() at i=-1: " + e.getMessage());
		}
		try {
			dll.get(dll.size());
		} catch (IndexOutOfBoundsException e){
			System.out.println("Exception caught get() at i=size: " + e.getMessage());
		}
		System.out.println("size: " + dll.size());
		
		
		System.out.println("****************************");
		System.out.println("get(0): " + dll.get(0));
		System.out.println("get("+ (dll.size()-1) + "): " + dll.get(dll.size()-1));
		System.out.println("size: " + dll.size());
		
		while(dll.size() > 0) {
			dll.removeFirst();
		}
		System.out.println("****************************");
		System.out.println("should be empty, size: " + dll.size());
		//empty list
		System.out.println("****************************");
		try {
			dll.addSecond("b");
		} catch (IllegalStateException e){
			System.out.println("Exception caught addSecond empty list: " + e.getMessage());
		}
		
		dll.addFirst("a");
		dll.addSecond("b");
		System.out.println("after adding a,b:\n" + dll);
		System.out.println("size: " + dll.size());
		System.out.println("****************************");
		
	}
	
	public static void task6Test() {
		System.out.println("\n\n\n\n\ntask6Test; ReverseIterator Class");
		System.out.println("****************************");
		System.out.println("Nothing to test here");
		System.out.println("****************************");
		
	}
	
	public static void task7Test() {
		System.out.println("\n\n\n\n\ntask7Test; reverseIterator() method");
		System.out.println("****************************");
		DoublyLinkedList<String> dll = new DoublyLinkedList<>();
		
		dll.addFirst("a");
		dll.addSecond("b");
		System.out.println("after adding a,b:\n" + dll);
		System.out.println("size: " + dll.size());
		System.out.println("****************************");
		
		dll.add("c");
		dll.add("d");
		dll.add("e");
		System.out.println("after adding c,d,e:\n" + dll);
		System.out.println("size: " + dll.size());
		System.out.println("****************************");
		
		//Reverse Iterator
		Iterator<String> iter = dll.reverseIterator();
		System.out.println("Reverse Iterator");
		boolean first = true;
		System.out.print("[");
		while(iter.hasNext()) {
			if(!first) {
				System.out.print(", ");
			}
			System.out.print(iter.next());
			first = false;
		}
		System.out.println("]");
		System.out.println("size: " + dll.size());
		
		dll = new DoublyLinkedList<String>(); //empty list
		System.out.println("****************************");
		System.out.println("New list should be empty");
		System.out.println("size: " + dll.size());
		//following should not print
		iter = dll.reverseIterator();
		System.out.println("Reverse Iterator (empty list)");
		first = true;
		System.out.print("[");
		while(iter.hasNext()) {
			if(!first) {
				System.out.print(", ");
			}
			System.out.print(iter.next());
			first = false;
		}
		System.out.println("]");
		
		
	}
	
	public static void task8Test() {
		System.out.println("\n\n\n\n\ntask8Test; remove() method from Iterator");
		System.out.println("****************************");
		DoublyLinkedList<String> dll = new DoublyLinkedList<String>(); //empty list
		System.out.println("****************************");
		System.out.println("New list should be empty");
		System.out.println("size: " + dll.size());
		
		System.out.println("****************************");
		dll.add("a");
		dll.add("b");
		dll.add("c");
		dll.add("d");
		dll.add("e");
		dll.add("f");
		System.out.println("added: a,b,c,d,e,f");
		System.out.println(dll);
		
		Iterator<String> iter = dll.iterator();
		while(iter.hasNext()) {
			iter.next();
			iter.remove();
		}
		
		System.out.println("Iterator emptied list, it should be empty:\n" + dll);
		System.out.println("size: " + dll.size());
		
		System.out.println("****************************");
		dll.add("a");
		dll.add("b");
		dll.add("c");
		dll.add("d");
		dll.add("e");
		dll.add("f");
		System.out.println("added: a,b,c,d,e,f");
		System.out.println(dll);
		
		iter = dll.iterator();
		boolean even = true;
		while(iter.hasNext()) {
			iter.next();
			if(even) {
				iter.remove();
			}
			even = !even; 
		}
		System.out.println("Iterator removed every other element:\n" + dll);
		System.out.println("size: " + dll.size());
		
		iter = dll.iterator();
		
	}

	public static void main(String[] args) {
		task1Test();
		task2Test();
		task3Test();
		task4Test();
		task5Test();
		task6Test();
		task7Test();
		task8Test();
	}
}

