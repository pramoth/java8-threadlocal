package th.co.geniustree.internship.java8.threadlocal;

/**
 *
 * @author pramoth
 */
public class ServiceThatUseTransactionService {
    public void hello(){
        //Notice we will get difference txService from ThreadLocal even if TransactionServiceHolder.get() is static.
        TransactionService txService = TransactionServiceHolder.get();
        txService.begin();
        System.out.println(txService.getName() +" - DO TASK IN TX");
        txService.commit();
    }
}
