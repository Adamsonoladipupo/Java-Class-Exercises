import java.util.ArrayList;

public class Person{
	private String name;
	private ArrayList<Problem> problemList = new ArrayList<>();

/*
	Person(ArrayList<Problem> problemInput){
		this.problemList = problemInput;
	}

	public ArrayList getProblems(Problem problemName){
		return problemList;
	}
*/

	public ArrayList<Problem> getPersonProblems(){
		return problemList;
	}

	public void setProblem(Problem problemName){
		problemList.add(problemName);
	}
	
}