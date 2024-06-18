import java.util.Stack;

public class Transactions {
    Stack<TransactionStatement> statement = new Stack<>();
    TransactionStatement transactionStatement = new TransactionStatement();

    public TransactionStatement setTransactionStatement(Drug drug_code, double price, int quantity, double amount, String buyer) {
        transactionStatement.setDrug_code(drug_code);
        transactionStatement.setPrice(price);
        transactionStatement.setAmount(amount);
        transactionStatement.setQuantity(quantity);
        transactionStatement.setBuyer(buyer);

        return transactionStatement;

    }

    public void addStatement(Drug drug_code, double price, int quantity, double amount, String buyer) {
        TransactionStatement info = this.setTransactionStatement(drug_code, price, quantity, amount, buyer);
        statement.add(info);
    }


}
