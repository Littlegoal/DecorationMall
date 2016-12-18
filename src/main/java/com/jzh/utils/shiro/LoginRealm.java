package com.jzh.utils.shiro;

import com.jzh.utils.Log;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @author Junhao Zhou 2016/12/18
 */
public class LoginRealm extends AuthorizingRealm {

    private static Log logger = Log.getLog(LoginRealm.class);


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        if (authenticationToken instanceof AccountTypeToken) {
            return dispatchLogin(authenticationToken);
        }
        return null;

    }


    private AuthenticationInfo dispatchLogin(AuthenticationToken token) throws AuthenticationException {
        if (token instanceof PhonePasswordToken) {
            doLoginNormal((PhonePasswordToken) token);
        } else if (token instanceof OAuth2Token) {

        } else {
            String message = String.format("AuthenticationToken< %s > unsupported", token.getClass().getName());
            logger.warn(message);
            throw new AuthenticationException(message);
        }
        return null;
    }

    private AuthenticationInfo doLoginNormal(PhonePasswordToken token) throws AuthenticationException {
        throw new AuthenticationException();
    }
}
