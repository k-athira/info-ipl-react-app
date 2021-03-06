package com.atk.infoipl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String status;
    private String intro_year;
    private String last_played_year;
    private boolean is_current_champion;
    private int totalMatch;
    private int totalWins;
    private int noLosses;
    private int noDraw;
    private String color;

    public Team() {

    }    
    
    public Team(String name, String status, String intro_year, String last_played_year, boolean is_current_champion,
            int totalMatch, int totalWins, int noLosses, int noDraw, String color) {
        this.name = name;
        this.status = status;
        this.intro_year = intro_year;
        this.last_played_year = last_played_year;
        this.is_current_champion = is_current_champion;
        this.totalMatch = totalMatch;
        this.totalWins = totalWins;
        this.noLosses = noLosses;
        this.noDraw = noDraw;
        this.color = color;
    }

    

    public boolean isIs_current_champion() {
        return is_current_champion;
    }

    public void setIs_current_champion(boolean is_current_champion) {
        this.is_current_champion = is_current_champion;
    }

    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
    }



    public int getTotalMatch() {
        return totalMatch;
    }



    public void setTotalMatch(int totalMatch) {
        this.totalMatch = totalMatch;
    }



    public int getTotalWins() {
        return totalWins;
    }



    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }



    public int getNoLosses() {
        return noLosses;
    }



    public void setNoLosses(int noLosses) {
        this.noLosses = noLosses;
    }



    public int getNoDraw() {
        return noDraw;
    }



    public void setNoDraw(int noDraw) {
        this.noDraw = noDraw;
    }



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIntro_year() {
        return intro_year;
    }

    public void setIntro_year(String intro_year) {
        this.intro_year = intro_year;
    }

    public String getLast_played_year() {
        return last_played_year;
    }

    public void setLast_played_year(String last_played_year) {
        this.last_played_year = last_played_year;
    }
    
        
    
}
