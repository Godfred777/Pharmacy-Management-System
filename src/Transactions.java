import java.util.Stack;

public class Transactions {
    Stack<TransactionStatement> statement = new Stack<>();
    TransactionStatement transactionStatement = new TransactionStatement();

    public TransactionStatement setTransactionStatement(Drug drug_code, int quantity, String buyer) {
        transactionStatement.setDrug_code(drug_code);
        transactionStatement.setQuantity(quantity);
        transactionStatement.setBuyer(buyer);

        return transactionStatement;

    }

    public void addStatement(Drug drug_code, int quantity, String buyer) {
        TransactionStatement info = this.setTransactionStatement(drug_code, quantity, buyer);
        statement.add(info);
    }

    public void format() {
        for (TransactionStatement i: statement) {
            System.out.println("<<<<<<<<<<<<Transactions>>>>>>>>>>");
            i.format();
        }
    }

}
