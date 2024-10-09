package com.stereotypes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Ipl
{
    @Value("RCB")
    private String teamName;

    public List<String> getPlayerNames() {
        return playerNames;
    }

    public void setPlayerNames(List<String> playerNames) {
        this.playerNames = playerNames;
    }

    @Value("Virat Kohli")
    private String teamCaptain;

    //@Value("#{expression}")  -- SPEL (Spring Expression Language)
    @Value("#{temp}")
    private List<String> playerNames;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCaptain() {
        return teamCaptain;
    }

    @Override
    public String toString() {
        return "Ipl [" +
                "TeamName='" + teamName + '\'' +
                ", TeamCaptain='" + teamCaptain + '\'' +
                ", PlayerNames=" + playerNames +
                ']';
    }

    public void setTeamCaptain(String teamCaptain) {
        this.teamCaptain = teamCaptain;
    }

}
