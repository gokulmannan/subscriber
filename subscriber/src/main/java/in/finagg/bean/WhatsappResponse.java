package in.finagg.bean;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;

@JsonInclude(Include.NON_NULL)
public class WhatsappResponse {
	@ApiModelProperty(value = "Whatsapp sent content") 
	private String content;
	@ApiModelProperty(value = "Whatsapp sent status") 
	private Status status;
	@ApiModelProperty(value = "Whatsapp sent response success message or error depending on status") 
	private String response;
	@ApiModelProperty(value = "Whatsapp Sent To") 
	private List<String> to ;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public void setTo(List<String> to) {
		this.to = to;
	}
	public List<String> getTo() {
		return to;
	}	

	@Override
	public String toString() {
		return "WhatsappResponse [status=" + status + ", response=" + response + ", to=" + to
				+ "]";
	}
}
