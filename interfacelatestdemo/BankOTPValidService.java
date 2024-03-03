package interfacelatestdemo;

public interface BankOTPValidService extends BankLogInService {
    String generateOTP(String accountNumber);
    boolean validOTP(String otp) throws Exception;
}
