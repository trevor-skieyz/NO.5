// Define the base class EFRISVATCalc
class EFRISVATCalc {
    public double calculateVAT(double amount) {
        System.out.println("Calculating VAT for generic TaxCategory (0% default):");
        return 0.0; // Default or base VAT, could be 0 or throw an error if abstract
    }

    public String getCategoryName() {
        return "Generic Taxpayer";
    }
}






