package darrenf1app.f1app;

/**
 * Created by darre on 16/05/2018.
 */

public class Driver

{
    String DriverName;
    String Team;
    String Country;
    String Podiums;
    String NumberofRaces;
    String Wins;
    String WorldChampionships;
    String DOB;

    Driver(String n, String t, String c, String p, String nr, String w, String wc, String dob)
    {
        DriverName = n;
        Team = t;
        Country = c;
        Podiums = p;
        NumberofRaces = nr;
        Wins = w;
        WorldChampionships = wc;
        DOB = dob;

    }

    public String getDriverName()
    {
        return DriverName;
    }


    public String getTeam()
    {
        return Team;
    }


    public String getCountry()
    {
        return Country;
    }


    public String getPodiums()
    {
        return Podiums;
    }

    public String getNumberofRaces()
    {
        return NumberofRaces;
    }

    public String getWins()
    {
        return Wins;
    }

    public String getWorldChampionships()
    {
        return WorldChampionships;
    }

    public String getDOB()
    {
        return DOB;
    }

}
