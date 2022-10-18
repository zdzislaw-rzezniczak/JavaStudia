package Lab5;

public class Mlynek {

    public Mlynek() {

    }

    public void mielenieKawy () {
        System.out.println("Czekaj trwa mielenie kawy....");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
