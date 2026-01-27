package q7;

import javax.naming.directory.InvalidAttributesException;
import java.util.Date;

public class BankAcct {
    private String accnum;
    private Long balance;
    private static float interest;

    BankAcct(String acc, Long b) {
        this.accnum = acc;
        balance = b;
    }

    public Long calculateInterest(Date date1 , Date date2) throws InvalidAttributesException {
        if(!date1.before(date2)) {
            throw new InvalidAttributesException("Time error");
        }
        long month = date2.getMonth() - date1.getMonth();
        long year = date2.getYear() - date1.getYear();
        long time = 12 * year + month;
        balance = (long) (balance * time * interest + balance);
        return (balance);
    }

    @Override
    public String toString() {
        return "AccNum = " + accnum + "balance = " + balance + "interest/month = " + interest;
    }

    public static float getInterest() {
        return interest;
    }

    public static void setInterest(float interest) {
        BankAcct.interest = interest;
    }


    public String getAccnum() {
        return accnum;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
