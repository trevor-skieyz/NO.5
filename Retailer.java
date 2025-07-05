
class Retailer extends EFRISVATCalc {
    private static final double VAT_RATE = 0.18; // 18% VAT for Retailers

    @Override
    public double calculateVAT(double amount) {
        double vat = amount * VAT_RATE;
        System.out.printf("%s VAT (%.0f%%): %.2f for amount %.2f%n", getCategoryName(), VAT_RATE * 100, vat, amount);
        return vat;
    }

    @Override
    public String getCategoryName() {
        return "Retailer";
    }
}
