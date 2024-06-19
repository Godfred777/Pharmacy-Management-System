public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.addDrug("Paracetamol", 120, "Ernest Chemist", 1.60);
        pharmacy.addDrug("Cold Relief", 202, "Entrance Pharmaceuticals", 12.5);
        pharmacy.format();
        pharmacy.buyDrug("Cold Relief", "Kofi", 2);
        pharmacy.buyDrug("Cough Syrup","Kofi", 1);
        pharmacy.removeDrug("Paracetamol");
        pharmacy.removeDrug("Cough Syrup");
        pharmacy.format();
    }
}