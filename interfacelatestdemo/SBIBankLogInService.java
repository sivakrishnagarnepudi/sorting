package interfacelatestdemo;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class SBIBankLogInService implements BankOTPValidService{
    String accountNumber="1111";
    String passWord="555";
    String otp;
    Date otpExpiredTime;
    public SBIBankLogInService(){

    }

    @Override
    public boolean login(String userName, String passWord) {
        if (userName.equals(accountNumber)&&this.passWord.equals(passWord)){
             return true;}
        return false;
    }


    @Override
    public String generateOTP(String accountNumber) {
        if(this.accountNumber.equals(accountNumber)){
            otp= UUID.randomUUID().toString();
            Calendar otpExpiryCalender =Calendar.getInstance();
            otpExpiryCalender.add(Calendar.SECOND,60);
            System.out.println("otpExpryCalender"+otpExpiryCalender.getTime());
            otpExpiredTime=otpExpiryCalender.getTime();
            otpExpiredTime=new Date();
            return otp;
        }
        return null;
    }

    @Override
    public boolean validOTP(String otp) throws InValidOTPException {
        if (this.otp.equals(otp)){
            return true;

        }else {
            System.out.println("InValidOtp");
            throw new InValidOTPException(ErrorCodes.NEOTERIC_INVALID_OTP_1000.getCode(), ErrorCodes.NEOTERIC_INVALID_OTP_1000.getMessage());
        }
    }
}
