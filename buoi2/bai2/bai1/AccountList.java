package lab.pkg2;

import java.util.ArrayList;

public class AccountList {
    ArrayList<Account> accList = new ArrayList<Account>();
    int count;

    public AccountList() {

    }

    public ArrayList<Account> getAccList() {
        return accList;
    }

    public int getCount() {
        return count;
    }

    public void setAccList(ArrayList<Account> accList) {
        this.accList = accList;
    }

    public void setCount(int count) {
        this.count = count;
    }
}