package bank;

public class Banking {
    public static void main(String[] args) throws Exception
    {
        BankService bankService = Bank.requestBankService(); //Request bank service (same as you'd go to banks website)
        bankService.register("crcACCID", "one", 100);
        bankService.register("dstACCID", "three", 100);
        try
        {
            AccountService crcaccid = bankService.logIn("crcACCID", "one");
            AccountService dstaccid = bankService.logIn("dstACCID", "three");
            System.out.println(crcaccid.getName() + " has " + crcaccid.getAvailableMoney() + "$");
            System.out.println(smith.getName() + " has " + crcaccid.getAvailableMoney() + "$");
            smith.transfer(john.getName(), 50);
            System.out.println(.getName() + " has " + john.getAvailableMoney() + "$");
            System.out.println(smith.getName() + " has " + smith.getAvailableMoney() + "$");
            //Now lets try to transfer too large amount of money
            john.transfer(smith.getName(), 200);

        } catch (Exception e)
        {
            //In real world banking, manny problems could happen when you use its services.
            //I've put all exceptions in one place. You shouldn't do this in real programs.
            System.err.println("\u001B[31m" + e.getMessage() + "\u001B[00m");
        }


    }
}
}
