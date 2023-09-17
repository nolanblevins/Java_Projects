/*
 * Nolan Blevins
 * March 16 2022
 * CSCE 146
 * Robot Command Simulator
 */

public interface QueueI <T> 
{
	public void enqueue(T aData); public T dequeue();
	public T peek();
	public void print();
	public int size();
	public void reset(); 
}