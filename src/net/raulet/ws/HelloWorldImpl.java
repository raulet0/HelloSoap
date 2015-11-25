package net.raulet.ws;

import javax.jws.WebService;
import net.raulet.ws.HelloWorld;

@WebService(endpointInterface = "net.raulet.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
	@Override
	public String ping() {
		return "pong";
	}
	@Override
	public String echo(String message) {
		return message;
	}
}
