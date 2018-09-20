// ToDo Class Definition
package ToDo;

public class ToDo {
	public static int count = 0;
	private String item;
	private boolean isDone = false;
	
	public ToDo(String i){
		item = i;
		count++;
	}
	public void markDone(){
		isDone = true;
	}
	public int getCount(){
		return count;
	}
	public String getToDo(){
		return item;
	}
}