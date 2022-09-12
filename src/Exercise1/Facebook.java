package Exercise1;

public class Facebook implements AdProvider{
    public static final String NAME = "Facebook";
    int quantity=0;

    @Override
    public String advertiseCompany() {
        quantity++;
        return "Video Ad";
    }

    @Override
    public int getPlacesAdvertisedOnQuantity() {
        return quantity;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
