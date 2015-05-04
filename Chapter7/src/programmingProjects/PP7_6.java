package programmingProjects;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class PP7_6
{
	static PP7_6 master = new PP7_6();
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	public void takeAction()
	{
		System.out.println("If you would like to create an account type CREATE");
		System.out.println("If you would like to make a withdrawl type WITHDRAWL");
		System.out.println("If you would like to make a deposit type DEPOSIT");
	}
	/**
	 * Creates an account in the account class
	 * Will ask the user for Account name and initial balance of account
	 * It will randomly generate an account number
	 * @param accounts
	 */
	public void createAccount(Account[] accounts)
	{
		
		if(accounts[Array.getLength(accounts)-1]==null)
		{
			int elementChoose=0;
			boolean elementChoosen=false;
			String accountName;
			long accountNum=Math.abs(rand.nextLong());
			double initialAmount;
			for(int index=0; index<accounts.length; index++)
			{
				if(elementChoosen!=true && Array.get(accounts, index)==null)
				{
					elementChoose=index;
					elementChoosen=true;
				}
			}
			System.out.println("Enter the name that will be attached to your account");
			accountName=scan.next();
			System.out.println("Enter the initial depost amount");
			initialAmount=scan.nextDouble();
			accounts[elementChoose]=new Account(accountName, accountNum, initialAmount);
			System.out.println("You have created an account with the following information.");
			System.out.println("Name: "+accountName);
			System.out.println("Account Number: "+accountNum);
			System.out.println("Balance: "+initialAmount);
		}
		else
		{
			System.out.println("Sorry the bank has reached its maximum amount of accounts");
		}
		
	}
	/**
	 * Will go through an account confirmation process to make sure that accounts keep separate
	 * Scan for accont name input first then account number
	 * The method will then ask the user what they want to withdraw
	 * @param accounts
	 * @param accountName
	 * @param accountNum
	 */
	public void accountWithdrawl(Account[] accounts, String accountName, long accountNum)
	{
		double withdrawAmount;
		int confirmedAccountIndex = 0;
		boolean accountFound=false;
		for(int index=0; index<accounts.length && accountFound!=true; index++)
		{
			if(accounts[index]!=null)
			{
				if(accounts[index].getAccountName().equals(accountName))
				{
					if(accounts[index].getAccountNumber()==accountNum)
					{
						accountFound=true;
						confirmedAccountIndex=index;
					}
				}
			}
		}
		if(accountFound!=false)
		{
			System.out.println("Enter the amount you would like to withdraw");
			withdrawAmount=scan.nextDouble();
			accounts[confirmedAccountIndex].withdraw(withdrawAmount);
			
		}
		else
		{
			System.out.println("We could not find account with that information");
		}
	}
	/**
	 * Will go through an account confirmation process to make sure that accounts keep separate
	 * Scan for accont name input first then account number
	 * The method will then ask the user what they want to deposit
	 * @param accounts
	 * @param accountName
	 * @param accountNum
	 */
    public void accountDeposit(Account[] accounts, String accountName, long accountNum)
	{
		double depositAmount;
		int confirmedAccountIndex = 0;
		boolean accountFound=false;
		for(int index=0; index<accounts.length && accountFound!=true; index++)
		{
			if(accounts[index]!=null)
			{
				if(accounts[index].getAccountName().equals(accountName))
				{
					if(accounts[index].getAccountNumber()==accountNum)
					{
						accountFound=true;
						confirmedAccountIndex=index;
					}
				}
			}
		}
		if(accountFound!=false)
		{
			System.out.println("Enter the amount you would like to deposit");
			depositAmount=scan.nextDouble();
			accounts[confirmedAccountIndex].deposit(depositAmount);
			
		}
		else
		{
			System.out.println("We could not find account with that information");
		}
	}
	public static void main(String[] args) 
	{
		String action;
		String accountName;
		long accountNumber;
		Account[] accounts = new Account[30];
		while(true)
		{
			master.takeAction();
			action=scan.next();
			if(action.equals("CREATE"))
			{
				master.createAccount(accounts);
			}
			if(action.equals("WITHDRAWL"))
			{
				System.out.println("Enter the account name.");
				accountName=scan.next();
				System.out.println("Enter the account number.");
				accountNumber=scan.nextLong();
				master.accountWithdrawl(accounts, accountName, accountNumber);
			}
			if(action.equals("DEPOSIT"))
			{
				System.out.println("Enter the account name.");
				accountName=scan.next();
				System.out.println("Enter the account number.");
				accountNumber=scan.nextLong();
				master.accountDeposit(accounts, accountName, accountNumber);
			}
			
		}
	}

}
