package com.javatutorial;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private ArrayList<T> teams = new ArrayList<>();

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println("Error: " + team.getName() + " is already in the league.");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to league.");
            return true;
        }
    }

    public void printByRank() {
        ArrayList<T> teamsCopy = new ArrayList<>(teams);
        Collections.sort(teamsCopy);
        for (T team : teamsCopy) {
            System.out.println(team);
        }
    }
}
