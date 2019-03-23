package poo;

import java.util.Random;

public class Buzz
{
    private boolean capacete;
    private boolean braço;
    private boolean laser;
    private boolean asas;
    private String frases[] = new String[6];
    Random random = new Random();

    public Buzz(boolean capacete, boolean braço, boolean laser, boolean asas)
    {
        this.capacete = capacete;
        this.braço = braço;
        this.laser = laser;
        this.asas = asas;
        
        frases[0] = "To infinity... and beyond!";
        frases[1] = "This isn't flying. This is falling with style!";
        frases[2] = "Sheriff, this is no time to panic.";
        frases[3] = "I've set my laser from stun to kill.";
        frases[4] = "I'm gonna teach that boy a lesson!";
        frases[5] = "Yes I can!";
    }
}
