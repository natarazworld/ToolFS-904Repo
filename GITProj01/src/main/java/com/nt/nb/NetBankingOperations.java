package com.nt.nb;

public class NetBankingOperations {

	public   String doPayment (long cardNo,double amt) {
		return amt+"  payment is done with the card::"+cardNo;
	}
	
	public   String cashbackOffer(String txId, double amt) {
		return   amt*0.05+" amount goes as the cashback amount";
		
	}
	
}
