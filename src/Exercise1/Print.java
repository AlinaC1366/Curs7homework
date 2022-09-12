package Exercise1;

public class Print implements AdProvider{
    public static final String NAME = "Print";
    int quantity=0;

    @Override
    public String advertiseCompany() {
        quantity++;
        return "Print Ad";
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


