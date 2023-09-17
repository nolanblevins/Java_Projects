/*
 * Nolan Blevins
 * February 16th 2022
 * Process Queue Simulator
 * CSCE 146
 */
public interface QueueI  <T> // interface for process scheduler implemented in LLQueue
{
	public void enqueue(T aData);
	public T dequeue();
	public T peek();
	public void print();

}
