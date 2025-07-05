// Main class to demonstrate runtime polymorphism
public class EFRISVATCalc {
    public static void main(String[] args) {
        EFRISVATCalc[] taxpayers = new EFRISVATCalc[4];
        taxpayers[0] = new Retailer();
        taxpayers[1] = new Wholesaler();
        taxpayers[2] = new Importer();
        taxpayers[3] = new Retailer(); // Another retailer instance

        // Define various transaction amounts
        double[] transactionAmounts = {1000.00, 500.00, 2500.00, 750.00};

        System.out.println("--- Demonstrating Runtime Polymorphism for VAT Calculation ---");
        System.out.println("------------------------------------------------------------\n");
        
        // The specific calculateVAT() method called will depend on the actual object type at runtime.
        for (int i = 0; i < taxpayers.length; i++) {
            EFRISVATCalc currentTaxpayer = taxpayers[i];
            double currentAmount = transactionAmounts[i];

            System.out.println("Processing transaction for " + currentTaxpayer.getCategoryName() + "...");
            currentTaxpayer.calculateVAT(currentAmount); 
            System.out.println(); 
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Polymorphism allows the system to treat different taxpayer categories");
        System.out.println("uniformly while executing their specific VAT calculation logic.");
    }
}

