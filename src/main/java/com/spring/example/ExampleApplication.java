package com.spring.example;

import java.math.BigDecimal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.example.service.AccountService;

public class ExampleApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AccountService accountService = appContext.getBean("accountService",AccountService.class);
		System.out.println("Sebelum Melakukan Transaksi");
		System.out.println("Jumlah Saldo"+accountService.getAccount(1L).getBalance());
		System.out.println("Jumlah Saldo"+accountService.getAccount(2L).getBalance());
		accountService.transferMoney(1L,2L,new BigDecimal(10000));
		System.out.println("Setelah Melakukan Transfer");
		System.out.println("Jumlah Saldo:"+accountService.getAccount(1L).getBalance() +"\nPengguna:  "+accountService.getAccount(1L).getName()+"\nNomor Seri:  "+accountService.getAccount(1L).getAccountNumber());
		System.out.println("Jumlah Saldo:"+accountService.getAccount(2L).getBalance()+"\nPengguna:  "+accountService.getAccount(2L).getName()+"\nNomor Seri:  "+accountService.getAccount(2L).getAccountNumber());

	}

}
