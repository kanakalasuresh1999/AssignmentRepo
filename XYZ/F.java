import java.util.scanner;
interface IPPlayerStatistics
{
public void displayPlayerStatistics();
}
abstract class Player implements IPlayerStatistics
{
   protected String name;
   protected int matchesPlayed;
   protected String name;

  public  Player(String name, int matchesPlayed,  String name)
    {
         super();
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.team name = team name;
    }
}
    class   CricketPlayer extends palyer
   {
  private   int totalRunsScored ;
  private   int noOfWicketsTaken ;

     public CricketPlayer(String nam, String teamname,int no of matchs)
    {
        super(name, noofmatchs, teamname);
}
public void get displayPlayerStatistics()
{
        System.out.println("player name:"+this.name+"team name is:"+this.teamname+noofmaths);

    }
public int getTotalRunsScored()
{
returntotalRunsscord;
}
public void settotalRunsscord(int totalRunsscord)
{
this.totalRunsscord=totalRunsscord;
}
public int getnoofWicktes taken(int noofWicketesTaken)
this.noofWicketsTaken=noofWicketsTaken;
}
}
class HockeyPlayer extends player implements IPlayerStatistics
{

private noofGoals
private String postion;
public Hockeyplayer(String name,Stering teamname,int noofmatchs)
{
super(name,teamname,noofmatchs);
}
public void displayPlayerStatistics()
{
System.out.printin("player name:"+this.name+"team name is:"+this.team name+"  noofmatchs is:"+this.noofmatchs+");
}
public int getnoofGoals()
{
return noofGoals;
}
public int setnoofGoals(noofGolas)
{
this.noofGoals=noofGoals;
}
public String getposition()
{
return position;
}
public void setposition()
{
this.postion=position;
}
}
public class Mainclass1
{
public static void main (String arg[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Menu");
System.out.println("1.cricket player details");
System.out.println("2.hockey player details");
System.out.println("enter your choice");
int option=scan.NextInt();
if(option==1)
{
System.out.println("enter the player name");
String name=scn.next();
System.out.println("enter the team name");
String teamname=scn.next();
System.out.println("enter the no of matchs");
int noofmatchs=scn.nextInt();
Cricketplayer c1= new CricketPlayer(name,teamname,noofmatchs);
c1.dispalyPlayerStastics();
System.out.println("enter the number of runs scored");
int y=scan.nextInt();
c1.setTotalRunscored(y);
System.out.println("enter the total number of wickets"):
int x=Scan.nextInt();
c1.setNoofWicketsTaken(x);
System.out.println("total runs scored:"+c1.getToRunsScored());
System.out.println("total wickets takn:"+c1.getNoofWicktesTaken());
}
else if(option==2)
{

System.out.println("enter the player name");
String name=scan.next();
System.out.println("enter the teamname");
String name=scan.next();
System.out.println("entre the no of matchs");
int noofmatchs=scan.nextInt();
Hockeyplayer h1=new Hockeypalyer(name,teamname,no of matchs);
h1.displayPlayerStatistics();
System.out.println("enter the position");
String p=scan.next();
h1.setpostion(p);
System.out.println("enter the no of Goals scored");
int q=scan.nextInt();
System.out.println("player position:"+h1.getposition());
System.out.println("total goals Scored:"h1.getnoofGoals());
}
}
}









    

