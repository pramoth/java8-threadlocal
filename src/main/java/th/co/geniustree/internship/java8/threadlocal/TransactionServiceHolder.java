/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.internship.java8.threadlocal;

/**
 *
 * @author pramoth
 */
public class TransactionServiceHolder {
    private static ThreadLocal<TransactionService> threadLocal ;
    public static void createTransactionService(){
        System.out.println("create transaction service and associated with thread "+Thread.currentThread().getName());
        threadLocal = ThreadLocal.withInitial(()->new TransactionService("tx-"+(int)(Math.random()*1000)));
    }
    public static TransactionService get(){
        return threadLocal.get();
    }
}
