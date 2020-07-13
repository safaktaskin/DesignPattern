package objectpool.basket;

import java.util.HashMap;
import java.util.Map;

public class BasketSource {
    private static BasketSource source = new BasketSource();
    private Map<Class<? extends Basket> , Basket> poolMap = new HashMap<Class<? extends Basket>, Basket>();

    private BasketSource() {
    }


    public static Basket getBasket(Class<? extends Basket> clazz) throws IllegalAccessException, InstantiationException {
        Basket b = source.poolMap.get(clazz);
        if (b == null) {
            b = clazz.newInstance();
            source.poolMap.put(b.getClass(), b);
        }
        return b;
    }
}