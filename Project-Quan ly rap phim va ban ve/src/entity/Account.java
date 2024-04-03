package entity;

import java.io.Serializable;

public abstract class Account implements Serializable {

    protected String accountName;
    protected String password;

//    public abstract boolean isValidAccount(String accountName, String password)

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
