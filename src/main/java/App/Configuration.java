package App;

import java.util.Properties;

import org.restexpress.Format;
import org.restexpress.RestExpress;
// import org.restexpress.example.echo.controller.StatusController;
// import org.restexpress.example.echo.controller.SuccessController;
import org.restexpress.util.Environment;

import controller.EchoController;
import controller.T1Controller;
import controller.T2Controller;

public class Configuration
extends Environment {
	private static final String NAME_PROPERTY = "name";
	private static final String PORT_PROPERTY = "port";
	private static final String DEFAULT_FORMAT_PROPERTY = "defaultFormat";
	private static final String WORKER_COUNT_PROPERTY = "workerCount";
	private static final String EXECUTOR_THREAD_COUNT_PROPERTY = "executorThreadCount";

	private static final int DEFAULT_WORKER_COUNT = 0;
	private static final int DEFAULT_EXECUTOR_THREAD_COUNT = 0;

	private int port;
	private String name;
	private String defaultFormat;
	private int workerCount;
	private int executorThreadCount;
	
	private EchoController echoController = new EchoController();
	private T1Controller t1Controller = new T1Controller();
	private T2Controller t2Controller = new T2Controller();

	@Override
	protected void fillValues(Properties p)
	{
		this.name = p.getProperty(NAME_PROPERTY, RestExpress.DEFAULT_NAME);
		this.port = Integer.parseInt(p.getProperty(PORT_PROPERTY, String.valueOf(RestExpress.DEFAULT_PORT)));
		this.defaultFormat = p.getProperty(DEFAULT_FORMAT_PROPERTY, Format.JSON);
		this.workerCount = Integer.parseInt(p.getProperty(WORKER_COUNT_PROPERTY, String.valueOf(DEFAULT_WORKER_COUNT)));
		this.executorThreadCount = Integer.parseInt(p.getProperty(EXECUTOR_THREAD_COUNT_PROPERTY, String.valueOf(DEFAULT_EXECUTOR_THREAD_COUNT)));
	}

	public String getDefaultFormat()
	{
		return defaultFormat;
	}

	public int getPort()
	{
		return port;
	}

	public String getName()
	{
		return name;
	}
	
	public int getWorkerCount()
	{
		return workerCount;
	}
	
	public int getExecutorThreadCount()
	{
		return executorThreadCount;
	}
	
	public EchoController getEchoController()
	{
		return echoController;
	}
	
	public T1Controller getT1Controller()
	{
		return t1Controller;
	}
	
	public T2Controller getT2Controller()
	{
		return t2Controller;
	}
}
