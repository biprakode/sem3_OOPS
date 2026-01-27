//Design a BankAcct class with account number, balance and interest rate as attribute. Interest
//rate is same for all account. Support must be there to initialize, change and display the interest rate.
//Also supports are to be there to return balance and calculate interest.
//Biprarshi Biswas BCSE-II 94


        package q7;

import javax.naming.directory.InvalidAttributesException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;


public class BankMain {
    public static void main(String[] args) throws ParseException, InvalidAttributesException {
        BankAcct.setInterest(0.075F);

        BankAcct ba1 = new BankAcct("001" , 12030L);
        BankAcct ba2 = new BankAcct("002" , 14040L);
        BankAcct ba3 = new BankAcct("003" , 17312L);

        System.out.println(ba1);
        System.out.println(ba2);
        System.out.println(ba3);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("1998-08-14");
        System.out.println("Interest of " + ba1.getAccnum() + "from 1998-08-14 is = " + interesetCalc(date1 , ba1));
        System.out.println("Interest of " + ba1.getAccnum() + "from 1998-08-14 is = " + interesetCalc(date1 , ba2));
        System.out.println("Interest of " + ba1.getAccnum() + "from 1998-08-14 is = " + interesetCalc(date1 , ba3));
    }

    static long interesetCalc(Date date, BankAcct b) throws InvalidAttributesException {
        return b.calculateInterest(date , new Date());
    }
}
