package com.company;

public class Main {

    public static void main(String[] args) {
	    Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "bobsemail@email.com", "123456789");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());


        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);


//	    the following lines were replaced by the constructor defined in Account.java,
//      and the parameters were given onto new Account instance

//	    bobsAccount.setNumber("12345");
//	    bobsAccount.setBalance(0.00);
//	    bobsAccount.setCustomerName("Bob Brown");
//	    bobsAccount.setCustomerEmailAddress("bobsemail@email.com");
//	    bobsAccount.setCustomerPhoneNumber("123456789");
//	    bobsAccount.withdrawal(100.0);


    }
}
