package Exercise1;

public class Email implements AdProvider{
    public static final String NAME = "Email";
    int quantity=0;

    @Override
    public String advertiseCompany() {
        quantity++;
        return "Spam Email";
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
