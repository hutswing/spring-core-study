package hello.core.order;

public class Order {

    private Long memberId;
    private String string;
    private int itemPrice;
    private int dicountPrice;

    public Order(Long memberId, String string, int itemPrice, int dicountPrice) {
        this.memberId = memberId;
        this.string = string;
        this.itemPrice = itemPrice;
        this.dicountPrice = dicountPrice;
    }

    public int calculatePrice() {
        return itemPrice - dicountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDicountPrice() {
        return dicountPrice;
    }

    public void setDicountPrice(int dicountPrice) {
        this.dicountPrice = dicountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", string='" + string + '\'' +
                ", itemPrice=" + itemPrice +
                ", dicountPrice=" + dicountPrice +
                '}';
    }
}
