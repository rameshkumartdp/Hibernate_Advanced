import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import org.hibernate.event.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.criterion.*;

import java.util.*;

public class AccountUpdateListener implements PostInsertEventListener {
    public void onPostInsert(PostInsertEvent event) {
        Account p = null;
        if (event.getEntity() instanceof Account) {
            p = (Account) event.getEntity();
            sendMail(p);
        } else
            System.exit(0);
    }

    public void sendMail(Account p) {
        System.out.println("Invoking Mail  ................");
        System.out.println("Account ID " + p.getAccount_id());
    }
}
