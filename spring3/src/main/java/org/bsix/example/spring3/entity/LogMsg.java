package org.bsix.example.spring3.entity;

public class LogMsg {
	private String id;
	private String msg;
	
	public LogMsg() {
		super();
	}

	public LogMsg(String id, String msg) {
		super();
		this.id = id;
		this.msg = msg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "LogMsg [id=" + id + ", msg=" + msg + "]";
	}
	
	
}
