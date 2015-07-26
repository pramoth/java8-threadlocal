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
public class TransactionService {
    private String name;

    public TransactionService(String name) {
        this.name = name;
    }
    
    public void begin(){
        System.out.println(name+" - begin");
    }
    public void commit(){
        System.out.println(name+" - commit");
    }

    public String getName() {
        return name;
    }
}
