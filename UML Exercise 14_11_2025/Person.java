import java.util.ArrayList;

public class Person{
	private String name;
	private ArrayList<String> problemList = new ArrayList<>();

/*
	Person(ArrayList<Problem> problemInput){
		this.problemList = problemInput;
	}

	public ArrayList getProblems(Problem problemName){
		return problemList;
	}
*/

	public ArrayList<String> getPersonProblems(){
		return problemList;
	}

	public void setProblem(Problem problemName){
		problemList.add(problemName);
	}
	
}