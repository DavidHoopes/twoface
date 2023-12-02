package twoface.model;

public class Response {
	private String status;
	private String responseMsg;
	public Response(String status, String responseMsg) {
		super();
		this.status = status;
		this.responseMsg = responseMsg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResponseMsg() {
		return responseMsg;
	}
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
	@Override
	public String toString() {
		return "Response [status=" + status + ", responseMsg=" + responseMsg + "]";
	}
	
	
}
