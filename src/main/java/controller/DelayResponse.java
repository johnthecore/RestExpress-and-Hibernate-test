package controller;

/**
 * @author toddf
 * @since Dec 20, 2011
 */
public class DelayResponse
{
	@SuppressWarnings("unused")
    private String action;
	@SuppressWarnings("unused")
    private long delayMs;
	@SuppressWarnings("unused")
	private String message;

	public DelayResponse(String action, long delayMs, String message)
    {
	    super();
	    this.action = action;
	    this.delayMs = delayMs;
	    this.message = message;
    }
}
