package net.raulet.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld{
	
	@WebMethod String ping();

	@WebMethod String echo(@WebParam(name = "message") String message);
	
}
