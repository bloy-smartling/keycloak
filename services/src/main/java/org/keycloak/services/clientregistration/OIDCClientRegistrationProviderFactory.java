package org.keycloak.services.clientregistration;

import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

/**
 * @author <a href="mailto:sthorger@redhat.com">Stian Thorgersen</a>
 */
public class OIDCClientRegistrationProviderFactory implements ClientRegistrationProviderFactory {

    @Override
    public ClientRegistrationProvider create(KeycloakSession session) {
        return new OIDCClientRegistrationProvider(session);
    }

    @Override
    public void init(Config.Scope config) {
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
    }

    @Override
    public void close() {
    }

    @Override
    public String getId() {
        return "openid-connect";
    }

}
