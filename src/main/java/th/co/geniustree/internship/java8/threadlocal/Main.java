package th.co.geniustree.internship.java8.threadlocal;

import java.util.stream.IntStream;

/**
 *
 * @author pramoth
 */
public class Main {
    public static void main(String[] args) {
       IntStream.rangeClosed(1, 5).forEach(i->{
           new Thread(()->{
               TransactionServiceHolder.createTransactionService();
                new ServiceThatUseTransactionService().hello();
           }).start();
       });
    }
}
