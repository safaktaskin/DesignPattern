package objectpool.basket;

public class IronBasket extends Basket {

    private Long sayi;

    @Override
    public String type() {
        return "Iron Basket";
    }

    public Long getSayi() {
        return sayi;
    }

    public void setSayi(Long sayi) {
        this.sayi = sayi;
    }
}