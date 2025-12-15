/*

# Answer close reading 1 questions here
team 1 always first
if not fail, parameter of recordPlay is score
0 if fail and have to switch
# Answer close reading 2 questions here
instance variables - team 1 and 2, scores 1 and 2 = 0, active team = team1
constructor - iTeam1, iTeam2
*/

// Write the class below
public class Scoreboard
{
    private String team1;
    private String team2;
    private int score1 = 0;
    private int score2 = 0;
    private boolean team1Active = true;

    public Scoreboard(String iTeam1, String iTeam2)
    {
        team1 = iTeam1;
        team2 = iTeam2;
    }

    public void recordPlay(int points)
    {
        if(points == 0) // if failed
        {
            if(team1Active)
            {
                team1Active = false;
            }
            else
            {
                team1Active = true;
            }
        }
        else //if scored
        {
            if(team1Active)
            {
                score1 += points;
            }
            else
            {
                score2 += points;
            }
        }
    }
    
    public String getScore()
    {
        String output = score1 + "-" + score2 + "-";

        if(team1Active)
        {
            output += team1;
        }
        else 
        {
            output += team2;
        }

        return output;
    }
}