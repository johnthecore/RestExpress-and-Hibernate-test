package serialization;

import controller.DelayResponse;
import org.restexpress.serialization.xml.XstreamXmlProcessor;

/**
 * @author toddf
 * @since Feb 16, 2011
 */
public class XmlSerializationProcessor
extends XstreamXmlProcessor
{
	public XmlSerializationProcessor()
    {
	    super();
		alias("delay_response", DelayResponse.class);
    }
}
