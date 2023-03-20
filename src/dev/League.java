package dev;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>
{//A league is a collection of teams, like football team or baseball team. it should contain a list of footballteams.
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable() {
        //sort method internally usually compareto, since we have overrddden it already, it uses overridden implemnetation
        Collections.sort(league);
        for(T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
