package com.model.football;

public class Table {

    private String idStanding;
    private String intRank;
    private String idTeam;
    private String strTeam;
    private String strTeamBadge;
    private String idLeague;
    private String strLeague;
    private String strSeason;
    private String strForm;
    private String strDescription;
    private String intPlayed;
    private String intWin;
    private String intLoss;
    private String intDraw;
    private String intGoalsFor;
    private String intGoalsAgainst;
    private String intGoalDifference;
    private String intPoints;
    private String dateUpdated;

    public Table() {
    }

    public Table(String idStanding, String intRank, String idTeam, String strTeam, String strTeamBadge, String idLeague, String strLeague, String strSeason, String strForm, String strDescription, String intPlayed, String intWin, String intLoss, String intDraw, String intGoalsFor, String intGoalsAgainst, String intGoalDifference, String intPoints, String dateUpdated) {
        this.idStanding = idStanding;
        this.intRank = intRank;
        this.idTeam = idTeam;
        this.strTeam = strTeam;
        this.strTeamBadge = strTeamBadge;
        this.idLeague = idLeague;
        this.strLeague = strLeague;
        this.strSeason = strSeason;
        this.strForm = strForm;
        this.strDescription = strDescription;
        this.intPlayed = intPlayed;
        this.intWin = intWin;
        this.intLoss = intLoss;
        this.intDraw = intDraw;
        this.intGoalsFor = intGoalsFor;
        this.intGoalsAgainst = intGoalsAgainst;
        this.intGoalDifference = intGoalDifference;
        this.intPoints = intPoints;
        this.dateUpdated = dateUpdated;
    }

    public String getIdStanding() {
        return idStanding;
    }

    public void setIdStanding(String idStanding) {
        this.idStanding = idStanding;
    }

    public String getIntRank() {
        return intRank;
    }

    public void setIntRank(String intRank) {
        this.intRank = intRank;
    }

    public String getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    public String getStrTeamBadge() {
        return strTeamBadge;
    }

    public void setStrTeamBadge(String strTeamBadge) {
        this.strTeamBadge = strTeamBadge;
    }

    public String getIdLeague() {
        return idLeague;
    }

    public void setIdLeague(String idLeague) {
        this.idLeague = idLeague;
    }

    public String getStrLeague() {
        return strLeague;
    }

    public void setStrLeague(String strLeague) {
        this.strLeague = strLeague;
    }

    public String getStrSeason() {
        return strSeason;
    }

    public void setStrSeason(String strSeason) {
        this.strSeason = strSeason;
    }

    public String getStrForm() {
        return strForm;
    }

    public void setStrForm(String strForm) {
        this.strForm = strForm;
    }

    public String getStrDescription() {
        return strDescription;
    }

    public void setStrDescription(String strDescription) {
        this.strDescription = strDescription;
    }

    public String getIntPlayed() {
        return intPlayed;
    }

    public void setIntPlayed(String intPlayed) {
        this.intPlayed = intPlayed;
    }

    public String getIntWin() {
        return intWin;
    }

    public void setIntWin(String intWin) {
        this.intWin = intWin;
    }

    public String getIntLoss() {
        return intLoss;
    }

    public void setIntLoss(String intLoss) {
        this.intLoss = intLoss;
    }

    public String getIntDraw() {
        return intDraw;
    }

    public void setIntDraw(String intDraw) {
        this.intDraw = intDraw;
    }

    public String getIntGoalsFor() {
        return intGoalsFor;
    }

    public void setIntGoalsFor(String intGoalsFor) {
        this.intGoalsFor = intGoalsFor;
    }

    public String getIntGoalsAgainst() {
        return intGoalsAgainst;
    }

    public void setIntGoalsAgainst(String intGoalsAgainst) {
        this.intGoalsAgainst = intGoalsAgainst;
    }

    public String getIntGoalDifference() {
        return intGoalDifference;
    }

    public void setIntGoalDifference(String intGoalDifference) {
        this.intGoalDifference = intGoalDifference;
    }

    public String getIntPoints() {
        return intPoints;
    }

    public void setIntPoints(String intPoints) {
        this.intPoints = intPoints;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "Table{" +
                "idStanding='" + idStanding + '\'' +
                ", intRank='" + intRank + '\'' +
                ", idTeam='" + idTeam + '\'' +
                ", strTeam='" + strTeam + '\'' +
                ", strTeamBadge='" + strTeamBadge + '\'' +
                ", idLeague='" + idLeague + '\'' +
                ", strLeague='" + strLeague + '\'' +
                ", strSeason='" + strSeason + '\'' +
                ", strForm='" + strForm + '\'' +
                ", strDescription='" + strDescription + '\'' +
                ", intPlayed='" + intPlayed + '\'' +
                ", intWin='" + intWin + '\'' +
                ", intLoss='" + intLoss + '\'' +
                ", intDraw='" + intDraw + '\'' +
                ", intGoalsFor='" + intGoalsFor + '\'' +
                ", intGoalsAgainst='" + intGoalsAgainst + '\'' +
                ", intGoalDifference='" + intGoalDifference + '\'' +
                ", intPoints='" + intPoints + '\'' +
                ", dateUpdated='" + dateUpdated + '\'' +
                '}';
    }
}
