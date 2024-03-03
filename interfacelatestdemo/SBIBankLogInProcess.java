package interfacelatestdemo;

import java.util.UUID;

public class SBIBankLogInProcess implements BankLogInService{

    BankOTPValidService sbiBankLogInProcess;

    public SBIBankLogInProcess(){
        sbiBankLogInProcess=new SBIBankLogInService();
    }

    public SBIBankLogInProcess(BankOTPValidService sbiBankLogInProcess) {
     //   this.sbiBankLogInProcess = new SBIBankLogInService;
    }

    @Override
    public boolean login(String userName, String passWord) {
        if(sbiBankLogInProcess.login(userName, passWord)){
            String otp=sbiBankLogInProcess.generateOTP(userName);
            boolean validOtp=false;
     /*     try {
                   validOtp=sbiBankLogInProcess.validOTP(UUID.randomUUID().toString());
            }catch{

            }*/
        }
        return false;
    }
}
