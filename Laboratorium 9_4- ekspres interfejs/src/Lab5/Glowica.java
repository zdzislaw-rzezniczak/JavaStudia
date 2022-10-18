package Lab5;

public class Glowica {
    public void przesypywanieKawyDoGlowicy () {
        System.out.println("Czekaj trwa przesypywanie kawy....");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
