package jws;


import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.EndpointConfig;

@Stateless
@WebService(name = "ZszikTest", targetNamespace = "http://example.org")
@EndpointConfig(configName = "SAML-WSSecurity-Endpointdsdsdsdsdsd")
//@Policy(uri = "policy:Wssp1.2-2007-Https-UsernameToken-Plain.xml")
public class ZszikTestJWS {

	@RolesAllowed("test")
	@WebMethod
	public String echo(String aArg) {
		return "Echo: " + aArg;
	}

}