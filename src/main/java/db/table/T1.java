package db.table;

import java.io.Serializable;

public class T1 implements Serializable {
	private int id;
	private String context;
	private String altContext;
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getAltContext() {
		return altContext;
	}
	public void setAltContext(String altContext) {
		this.altContext = altContext;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}