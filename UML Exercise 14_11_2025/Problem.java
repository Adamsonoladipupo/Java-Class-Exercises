
public class Problem{
	private String name;
	private String description;
	private String type;
	private boolean isSolved;

	Problem(String problemName, String problemDescription, String problemType, boolean check){
		this.name = problemName;
		this.description = problemDescription;
		this.type = problemType;
		this.isSolved = check;
	}

	Problem(String problemName, String problemType){
		this.name = problemName;
		this.type = problemType;
	}
	
	public void setProblemName(String problemName){
		this.name = problemName;
	}

	public String getProblemName(){
		return name;
	}

	public String getProblemType(){
		return type;
	}


}