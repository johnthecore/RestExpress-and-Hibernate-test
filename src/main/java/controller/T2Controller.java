package controller;

import java.util.List;

import org.restexpress.Request;
import org.restexpress.Response;

import db.DAOT2;
import db.table.T2;
import io.netty.buffer.ByteBuf;

/**
 * @author toddf
 * @since Aug 31, 2010
 */
public class T2Controller
{
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
		return null;
	}
	
	public List<T2> read(Request request, Response response)
	{
		System.out.println(request.getRemoteAddress());
		/*
		delay(request);
		String echo = request.getHeader(ECHO_HEADER);
		
		if (echo == null)
		{
			// return "Please set query-string parameter 'echo' (e.g. ?echo=value)";
		}
		*/
		List<T2> items = new DAOT2().getAll(T2.class);
		return items;
		
		// return new A();
	}

	public ByteBuf update(Request request, Response response)
	{
		// delay(request);
		return request.getBody();
	}
	
}
