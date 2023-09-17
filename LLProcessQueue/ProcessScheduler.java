/*
 * Nolan Blevins
 * February 16th 2022
 * Process Queue Simulator
 * CSCE 146
 */
public class ProcessScheduler 
{
	private QueueI<Process> Processes;
	Process CurrentProcess = new Process();
	// returns currently running process
	public ProcessScheduler()
	{
		Processes = new LLQueue<Process>();
		CurrentProcess = Processes.dequeue();

	}
	public Process getCurrentProcess() // returns currently running process
	{
		return CurrentProcess;
	}
	public void addProcess(Process aProcess) // adds new process to current process, if current process is occupied it gets added to a queue
	{
		if(aProcess == null)
			return;
		if(CurrentProcess == null)
		{
			CurrentProcess = aProcess;
		}
		else
		{
		Processes.enqueue(aProcess);
		}
	}
	public void runNextProcess() // runs the next process in queue
	{
		CurrentProcess = Processes.dequeue();
		
	}
	public void cancelCurrentProcess() // sets current process to first element of processes and dequeues
	{
		CurrentProcess = Processes.peek();
		Processes.dequeue();
	}
	public void printProcessQueue() // prints process queue
	{
		Processes.print();
	}
	
	 
}

