import java.util.ArrayList;

//start of class
public class ArrayPriorityQueue implements PriorityQueue{
	
	//instance variables
    private ArrayList<String> ArrPQ;
    private String Al_data;

	//constructors
    public ArrayPriorityQueue(){
	ArrPQ = new ArrayList<String>();
    }

	//O(n): Adds string to Arraylist based on its value, uses Arraylist implementation
    public void add(String x){
	for (int i = 0; i < ArrPQ.size(); i++){
	    Al_data = ArrPQ.get(i);
	    if (Al_data.compareTo(x) >= 0){
		ArrPQ.add(i, x);
		break;
	    }
	}
	ArrPQ.add(x);
    }
	//O(1): returns whether the arraylist is empty
    public boolean isEmpty(){
	return ArrPQ.size() == 0;
    }
	
	//O(1): returns the minimum value of the arraylist
    public String peekMin(){
	return ArrPQ.get(0);
    }
	
	//O(n): removes the minimum value of the arraylist
	//Uses ArrayList implementation of remove()
    public String removeMin(){
	return ArrPQ.remove(0);
    }

	//main method
    public static void main(String[] args){
	ArrayPriorityQueue fun = new ArrayPriorityQueue();
	System.out.println("Is fun empty? " + fun.isEmpty());
	
	fun.add("foo");
	fun.add("goo");
	fun.add("hoo");
	fun.add("doo");

	System.out.println("min of fun: " + fun.peekMin());
	fun.removeMin();
	System.out.println("new min of fun: " + fun.peekMin());
    }
}
