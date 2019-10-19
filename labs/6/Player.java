
public class Player {
	
  private String name;
  private int goals;
  private String team;
  Player(){
    name = "";
    team = "";
    goals = 0;	
  }
  Player(String name, String team){
    this.name = name ;
    this.team = team;
    this.goals = goals;	
  }
  public String getName() {
	return this.name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public int getGoal() {
	return goals;
  } 
  public void setGoal(int goals) {
	goals = this.goals;
  }
  public String getTeam() {
	return this.team;
  }
  public void setTeam(String team) {
	this.team = team;
  }
}
