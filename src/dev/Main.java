package dev;

public class Main {
    public static void main(String[] args)
    {
        FootballPlayer joe=new FootballPlayer("joe") ;
        FootballPlayer ronaldo=new FootballPlayer("ronaldo") ;
        FootballPlayer mappe=new FootballPlayer("mappe") ;
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham= new  SoccerPlayer("beckham");
        Team<FootballPlayer> adelaidecrows= new  Team<>("adelaidecrows");
        Team<FootballPlayer> footballteam2= new  Team<>("footballteam2");
        Team<FootballPlayer> footballteam3= new  Team<>("footballteam3");
        adelaidecrows.addPlayers(joe);
        footballteam2.addPlayers(ronaldo);
        footballteam3.addPlayers(mappe);
        adelaidecrows.matchResult(footballteam2,2,3);
        adelaidecrows.matchResult(footballteam3,3,1);
        footballteam2.matchResult(footballteam3,5,2);
        System.out.println(adelaidecrows.ranking());
        System.out.println(footballteam2.ranking());
        System.out.println(footballteam3.ranking());

        League<Team<FootballPlayer>> league = new League<>("AFL");
        league.add(footballteam2);
        league.add(footballteam3);
        league.add(adelaidecrows);
        league.showLeagueTable();

    }
}
