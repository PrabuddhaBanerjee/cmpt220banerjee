import java.util.Date;
public class Goal {
  
  private int minute;
  private Player player;
  
  Goal(){
	minute = 0;  
  }
  
  Goal(int minute, Player player){
    this.minute = minute;
    this.player = player;	
  }
  
  public Player getPlayer() {
    return player;
  }
  
  public void setPlayer(Player p) {
    this.player = player;
  }
  public int getMinute(){
	return minute;  
  }
  public void setMinute(int minute){
	this.minute = minute;  
  }
  
}
