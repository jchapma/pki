//
// Copyright Red Hat, Inc.
//
// SPDX-License-Identifier: GPL-2.0-or-later
//
package com.netscape.cmscore.ldapconn;

import com.netscape.certsrv.base.EBaseException;
import com.netscape.cmscore.base.ConfigStorage;
import com.netscape.cmscore.base.ConfigStore;
import com.netscape.cmscore.base.SimpleProperties;

/**
 * Provides <LDAP>.ldapauth.* parameters.
 */
public class LDAPAuthenticationConfig extends ConfigStore {

    public LDAPAuthenticationConfig(ConfigStorage storage) {
        super(storage);
    }

    public LDAPAuthenticationConfig(String name, SimpleProperties source) {
        super(name, source);
    }

    /**
     * Returns <LDAP>.ldapauth.authtype parameter.
     */
    public String getAuthType() throws EBaseException {
        return getString(LdapAuthInfo.PROP_LDAPAUTHTYPE);
    }

    /**
     * Returns <LDAP>.ldapauth.clientCertNickname parameter.
     */
    public String getClientCertNickname() throws EBaseException {
        return getString(LdapAuthInfo.PROP_CLIENTCERTNICKNAME);
    }

    /**
     * Returns <LDAP>.ldapauth.bindDN parameter.
     */
    public String getBindDN() throws EBaseException {
        return getString(LdapAuthInfo.PROP_BINDDN);
    }

    /**
     * Returns <LDAP>.ldapauth.bindPassword parameter.
     */
    public String getBindPassword() throws EBaseException {
        return getString(LdapAuthInfo.PROP_BINDPW, null);
    }

    /**
     * Returns <LDAP>.ldapauth.bindPWPrompt parameter.
     */
    public String getBindPasswordPrompt() throws EBaseException {
        return getString(LdapAuthInfo.PROP_BINDPW_PROMPT, null);
    }
}
