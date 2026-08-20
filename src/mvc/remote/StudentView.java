package mvc.remote;

public class StudentView {

private String st;
private int numOfst;
private boolean isSt;

	public StudentView() {}
	
	public StudentView(String st) {
		this.st=st;
	}

	
	public void print() {
		System.out.println("학생들이 있어요.");
	}
	

}

