package exceptionalhandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.KeyStore;
import java.security.KeyStoreException;

public class CustomException {
    public String checkedException() {
        try {
            throw new Exception("Throw checkException");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public String checkedException2() throws Exception {

        throw new Exception("Throw checkException");

    }
    public String checkedException3() {
        try {
            KeyStore.getInstance("");
            Thread.sleep(1000);
            FileInputStream inputStream=new FileInputStream("");
        } catch (KeyStoreException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public String unCheckedException(){
        throw new RuntimeException("Throw checkException");
    }
}
