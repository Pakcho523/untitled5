public class SaveMoney {
    public static void main(String args[]) {
        int amount = 8000;
        ConstructionBank bankl = new ConstructionBank();
        bankl.savedMoney = amount;
        bankl.year = 8.236;
        bankl.setInterestRate(0.035);
        double interest1 = bankl.computerInterest();
        BankOfDalian bank2 = new BankOfDalian();
        bank2.savedMoney = amount;
        bank2.year = 8.236;
        bank2.setInterestRate(0.035);
        double interest2 = bank2.computerInterest();
        System.out.printf("两个银行利息相差%f元\n", interest2 - interest1);
    }
}
