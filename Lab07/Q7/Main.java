// package Q7;
import java.util.*;
import java.io.*;

public class Main{
	
	public static Account findAccount(ArrayList<Account> accountArray, String ac_num){
        for (Account accounts: accountArray)
            if (accounts.getAccountNumber().equals(ac_num))
                return accounts;
        return null;
    }
	
	public static void main(String [] args) throws FileNotFoundException
	{	
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input the file pathname: ");
		String filepathname = in.nextLine();
		
		ArrayList<Account> acs = new ArrayList<>();
		
		Scanner infile = new Scanner(new File(filepathname));

        while(infile.hasNext()){
            String accountNumbeString = infile.next();
            switch (accountNumbeString.charAt(0)) {
                case '0': case '1': case '2': case '3': case '4': case '5':
                    acs.add(new SavingsAccount(accountNumbeString, infile.nextDouble()));
                    break;
                case '6': case '7': case '8':
                    acs.add(new CreditCardAccount(accountNumbeString, infile.nextDouble(), infile.nextDouble()));
                    break;
                default:
                    acs.add(new PowerAdvantageAccount(accountNumbeString, 
                        (SavingsAccount)findAccount(acs, infile.next()), 
                        (CreditCardAccount)findAccount(acs, infile.next())
                    ));
            }
        }
		
		infile.close();
		System.out.print("\nInput an account number to search: ");
		
        String searchNum = in.next();
        Account result = findAccount(acs, searchNum);
		
        if (result != null)
			System.out.println("\n[Result]\n"+result.toString());
		else
			System.out.println("\n[Result]\nThe account is not found.");
			
		in.close();
	}
}
