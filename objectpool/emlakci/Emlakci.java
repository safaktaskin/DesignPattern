package objectpool.emlakci;

import java.util.HashSet;

public abstract class Emlakci {
    private HashSet<Ev> evHashSet = new HashSet<Ev>();

    public abstract void evOlustur();
}
