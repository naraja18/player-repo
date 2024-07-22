// Write your code here.
package com.example.player;

public class Player {
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    public Player(int playerId, String playerName, int jerseyNumber, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public int getplayerId() {
        return playerId;
    }

    public void setplayerId() {
        this.playerId = playerId;
    }

    public int getjerseyNumber() {
        return jerseyNumber;
    }

    public void setjerseyNumber() {
        this.jerseyNumber = jerseyNumber;
    }

    public String getplayerName() {
        return playerName;
    }

    public void setplayerName() {
        this.playerName = playerName;
    }

    public String getrole() {
        return role;
    }

    public void setrole() {
        this.role = role;
    }

}