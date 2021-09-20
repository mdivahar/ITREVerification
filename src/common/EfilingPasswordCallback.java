package common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;




public class EfilingPasswordCallback implements CallbackHandler {

   
	private final Map<String, String> passwords = new HashMap<String, String>();

    public EfilingPasswordCallback() {
       
    	passwords.put("ITEF000017", "PASSWORD");
    }

    public EfilingPasswordCallback(final String passwords) {
        super();
    }

    public void handle(final Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            final WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];

            final String pass = passwords.get(pc.getIdentifier());

            if (pass != null) {
                pc.setPassword(pass);
                return;
            }

            if (WSPasswordCallback.PASSWORD_ENCRYPTOR_PASSWORD == pc.getUsage()) {
                // For future use
            }
        }
    }

    public void setAliasPassword(final String alias, final String password) {
        passwords.put(alias, password);
    }
}
