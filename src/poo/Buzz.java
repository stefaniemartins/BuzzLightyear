package poo;

import java.util.Random;

public class Buzz
{
    private boolean capacete;
    private String frases[] = new String[6];
    private boolean laser;
    private boolean braços;
    private boolean asas;
    Random random = new Random();

    public Buzz(boolean capacete, boolean laser, boolean braços, boolean asas)
    {
        this.capacete = capacete;
        this.laser = laser;
        this.braços = braços;
        this.asas = asas;

        frases[0] = "To infinity... and beyond!";
        frases[1] = "This isn't flying. This is falling with style!";
        frases[2] = "Sheriff, this is no time to panic.";
        frases[3] = "I've set my laser from stun to kill.";
        frases[4] = "I'm gonna teach that boy a lesson!";
        frases[5] = "Yes I can!";
    }

    public boolean isCapacete()
    {
        return capacete;
    }

    public void setCapacete(boolean capacete)
    {
        this.capacete = capacete;
    }

    public String randomFrases()
    {
        return frases[random.nextInt(6)];
    }
}