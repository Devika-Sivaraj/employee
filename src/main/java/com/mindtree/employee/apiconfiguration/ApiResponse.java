package com.mindtree.employee.apiconfiguration;

public class ApiResponse {

	private String message;
	private String httpStatus;
	private int httpstatusCode;
	private Object body;
	private boolean success;
	private boolean error;
	
	public ApiResponse() {
		super();
	}
	
	public ApiResponse(String message, String httpStatus, int httpstatusCode, Object body, boolean success,
			boolean error) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
		this.httpstatusCode = httpstatusCode;
		this.body = body;
		this.success = success;
		this.error = error;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}
	public int getHttpstatusCode() {
		return httpstatusCode;
	}
	public void setHttpstatusCode(int httpstatusCode) {
		this.httpstatusCode = httpstatusCode;
	}
	public Object getBody() {
		return body;
	}
	public void setBody(Object body) {
		this.body = body;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	
}
