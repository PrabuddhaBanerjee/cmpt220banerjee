import java.util.Date;

public class SoccerMatch {

	private Date startTime;
	private Date endTime = new Date();
	private String location;
	private static String home;
	private String visitor;
	public Player[] homeplayers;
	public Player[] visitorplayers;
	private Goal[] homegoals ;
	private Goal[] visitorgoals;
	private int homePlayerCounter, visitorPlayerCounter, homeGoalCounter, visitorGoalCounter;
	SoccerMatch() {
	  homeplayers = new Player[11];
	  visitorplayers = new Player[11];
	  homegoals = new Goal[10];
	  visitorgoals = new Goal[10];
	  startTime = new Date();
	  homePlayerCounter = 0;
	  visitorPlayerCounter = 0; 
	  homeGoalCounter = 0;
	  visitorGoalCounter = 0;
	}
	SoccerMatch(Date startTime, Date endTime, String location, String home, String visitor) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.location = location;
		this.home = home;
		this.visitor = visitor;
	}
	public void addHomePlayer(Player p) {
		//count = homeplayers.length;
		if(homePlayerCounter<11)
		  homeplayers[homePlayerCounter++] = p;
	}
	public void addVisitorPlayer(Player p) {
		//count = visitorplayers.length;
		if(visitorPlayerCounter<11)
		  visitorplayers[visitorPlayerCounter++] = p;
	}
	public String getWinner() {
		String result = "" ;
		int homeScore = getHomeGoals();
		int vistorScore = getVisitorGoals();
		if(homeScore > vistorScore)
		  return result+=home;
	    else if(homeScore < vistorScore)
		  return result+=visitor;
	    else return result+="Tie";
		
	} 
	public void addHomeGoals(Goal g) {
		homegoals[homeGoalCounter++] = g;
		
	}
	public void addVisitorGoals(Goal g) {
		//int count = visitorgoals.length;
		if(visitorGoalCounter<11)
			visitorgoals[visitorGoalCounter++] = g;
	}
	public int getHomeGoals() {
	        int goals[] = new int[10];
	        int count = 0;
		for (int i = 0; i <goals.length; i++) {
		      System.out.println(homegoals[i].getPlayer().getGoal());
			goals[i] = homegoals[i].getPlayer().getGoal();
		}
		for (int i = 0; i <goals.length; i++){
		    if(goals[i]>0)
		    count++;
		  }
		System.out.println(count);
		return count;
	}
	public int getVisitorGoals() {
		return visitorgoals.length;
	}
}