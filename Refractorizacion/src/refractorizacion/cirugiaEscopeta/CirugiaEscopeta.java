package refractorizacion.cirugiaEscopeta;

/**
 * https://dzone.com/articles/code-smell-shot-surgery
 */
public class CirugiaEscopeta {

    public class Account {

        private String type;
        private String accountNumber;
        private int amount;

        public Account(String type, String accountNumber, int amount) {
            this.amount = amount;
            this.type = type;
            this.accountNumber = accountNumber;
        }

        public void debit(int debit) throws Exception {
            if (amount <= 500) {
                throw new Exception("Mininum balance shuold be over 500");
            }

            amount = amount - debit;
            System.out.println("Now amount is" + amount);

        }

        public void transfer(Account from, Account to, int cerditAmount) throws Exception {
            if (from.amount <= 500) {
                throw new Exception("Mininum balance shuold be over 500");
            }

            to.amount = amount + cerditAmount;

        }

        public void sendWarningMessage() {
            if (amount <= 500) {
                System.out.println("amount should be over 500");
            }
        }

    }

    public class ShotgunSurgery {

        public void main() throws Exception {
            Account acc = new Account("Personal", "AC1234", 1000);
            acc.debit(500);
            acc.sendWarningMessage();
            //acc.debit(500);
        }

    }
}
