package controller;

import java.util.List;

import org.restexpress.Request;
import org.restexpress.Response;

import db.DAOT1;
import db.table.T1;
import io.netty.buffer.ByteBuf;

/**
 * @author toddf
 * @since Aug 31, 2010
 */
public class EchoController
extends AbstractDelayingController
{
    private static final String ECHO_PARAMETER_NOT_FOUND = "'echo' header or query-string parameter not found";
	private static final String ECHO_HEADER = "echo";

	public ByteBuf create(Request request, Response response)
	{
		// delay(request);
		// response.setResponseCreated();
		// return request.getBody();
		return request.getBody();
	}
	
	public String delete(Request request, Response response)
	{
		// delay(request);
		// return request.getHeader(ECHO_HEADER, ECHO_PARAMETER_NOT_FOUND);
		return request.getHeader(ECHO_HEADER, ECHO_PARAMETER_NOT_FOUND);
	}
	
	public List<T1> read(Request request, Response response)
	{
		System.out.println(request.getRemoteAddress());
		delay(request);
		String echo = request.getHeader(ECHO_HEADER);
		
		if (echo == null)
		{
			// return "Please set query-string parameter 'echo' (e.g. ?echo=value)";
		}
		
		List<T1> items = new DAOT1().getAll(T1.class);
		return items;
		
		// return new A();
	}

	public ByteBuf update(Request request, Response response)
	{
		// delay(request);
		return request.getBody();
	}
	
}
