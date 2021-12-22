package com.org;

import java.util.Scanner;

interface IPlayerStatistics
{
	public void displayPlayerStatistics();
}
abstract class Player
{
	protected String name;
	protected String teamName;
	protected int noOfMatches;
	public void Player(String name, String teamName, int noOfMatches) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}
	
}
class CricketPlayer extends Player implements IPlayerStatistics
{
	private int totalRunsScored;
	private int noOfWicketsTaken;
	public CricketPlayer(String name, String teamName, int noOfMatches) {
		super(name, teamName, noOfMatches);
		
	}
	public void displayPlayerStatistics()
	{
		System.out.println("player Name: "+this.name+" team name is: "+this.teamName+"no of matches played"+this.noOfMatches);
	}
	public int getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	public int getNoOfWicketsTaken() {
		return noOfWicketsTaken;
	}
	public void setNoOfWicketsTaken(int noOfWicketsTaken) {
		this.noOfWicketsTaken = noOfWicketsTaken;
	}
	
}
class HockeyPlayer extends Player implements IPlayerStatistics
{
	private int noOfGoals;
	private String position;
	public HockeyPlayer(String name, String teamName, int noOfMatches) {
		super(name, teamName, noOfMatches);
		
	}
	public void displayPlayerStatistics()
	{
		System.out.println("player Name: "+this.name+" team name is: "+this.teamName+"no of matches played"+this.noOfMatches);
	}
	public int getNoOfGoals() {
		return noOfGoals;
	}
	public void setNoOfGoals(int noOfGoals) {
		this.noOfGoals = noOfGoals;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
public class MainClass1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1.Cricket Player Details");
		System.out.println("2.Hockey Player Details");
		System.out.println("Enter your Choice");
		int option = scan.nextInt();
		if(option == 1)
		{
			System.out.println("Enter Player Name");
			String name = scan.next();
			System.out.println("Enter Team Name");
			String teamName = scan.next();
			System.out.println("Enter no of matches");
			int noOfMatches = scan.nextInt();
			
			CricketPlayer c1 = new CricketPlayer(name,teamName,noOfMatches);
			c1.displayPlayerStatistics();
			System.out.println("enter total number of runs scored");
			int y =scan.nextInt();
			c1.setTotalRunsScored(y);
			System.out.println("enter total number of wickets taken");
			int x = scan.nextInt();
			c1.setNoOfWicketsTaken(x);
			System.out.println("total runs Scored: "+c1.getTotalRunsScored());
			System.out.println("total wickets taken: "+c1.getNoOfWicketsTaken());
		}
		else if(option == 2)
		{
			System.out.println("Enter Player Name");
			String name = scan.next();
			System.out.println("Enter Team Name");
			String teamName = scan.next();
			System.out.println("Enter no of matches");
			int noOfMatches = scan.nextInt();
			HockeyPlayer h1 = new HockeyPlayer(name,teamName,noOfMatches);
			h1.displayPlayerStatistics();
			System.out.println("enter position");
			String p = scan.next();
			h1.setPosition(p);
			System.out.println("enter total number of goals scored");
			int q = scan.nextInt();
			h1.setNoOfGoals(q);
			System.out.println("player position: "+h1.getPosition());
			System.out.println("total goals scored: "+h1.getNoOfGoals());
		}
	}
}





