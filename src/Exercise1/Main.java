package Exercise1;

public class Main {
    public static void main(String[] args) {
        Company fasttrackIT = new Company(new Facebook(), 6);


        for (int i = 0; i < 3; i++) {
            fasttrackIT.sendAdsToCompany();
        }

        fasttrackIT.printReport();
    }
}

