package Exercise1;

public class Company {
    private AdProvider adProvider;
    private long numberOfProducts;

    public Company(AdProvider adProvider, long numberOfProducts) {
        this.adProvider = adProvider;
        this.numberOfProducts = numberOfProducts;
    }

    public void sendAdsToCompany() {
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(adProvider.getPlacesAdvertisedOnQuantity());

        }
    }

    public void printReport() {
        System.out.println(String.format("%s has published %d ADS.",
                adProvider.getName(),
                adProvider.getPlacesAdvertisedOnQuantity()));
    }
}
