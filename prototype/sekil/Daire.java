package prototype.sekil;

public class Daire extends Sekil {

    public Daire() {
        setType("Daire");
    }

    @Override
    void sekilCiz() {
        System.out.println("Daire çizildi.");
    }
}
