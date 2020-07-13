package objectpool.basket;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        IronBasket basket = (IronBasket) BasketSource.getBasket(IronBasket.class);
        System.out.println(basket.type() + " " + basket.toString());
        IronBasket basket2 = (IronBasket) BasketSource.getBasket(IronBasket.class);
        System.out.println(basket2.type() + " " + basket2.toString());

        basket.setSayi(5L);
        basket2.setSayi(10L);

        System.out.println(basket.getSayi());
        System.out.println(basket2.getSayi());
    }
}