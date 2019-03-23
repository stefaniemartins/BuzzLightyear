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

    public Buzz()
    {
        capacete = false;
        laser = false;
        braços =false;
        asas = false;

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

    public boolean isLaser()
    {
        return laser;
    }

    public void setLaser(boolean laser)
    {
        this.laser = laser;
    }

    public boolean isBraços()
    {
        return braços;
    }

    public void setBraços(boolean braços)
    {
        this.braços = braços;
    }

    public boolean isAsas()
    {
        return asas;
    }

    public void setAsas(boolean asas)
    {
        this.asas = asas;
    }
}