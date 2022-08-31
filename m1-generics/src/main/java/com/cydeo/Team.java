package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {  //Any class can be passed to the Team. Should accept only Player class and subclasses

    private String name;

    private List<T> members = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){  //somebody wants to join the team and I'm checking if that player is already on the team
            System.out.println(((Player)player).getName() + " is already on the team"); //casting player
            return false;
        }else{
            members.add(player);  //and if not on the team, the player will be added
            System.out.println(((Player)player).getName() + " picked for team" + this.name);
            return true;
        }
    }
}