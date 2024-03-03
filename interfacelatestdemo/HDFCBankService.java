package interfacelatestdemo;

public class HDFCBankService implements BankLogInService{
    String accountNumber="222";
    String passWord="555";



    @Override
    public boolean login(String userName, String passWord) {
        if(userName.equals(accountNumber)&&this.passWord.equals(passWord)){
            return true;
        }
        return false;
    }
}
