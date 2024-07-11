package in.finagg.bean;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;

@JsonInclude(Include.NON_NULL)
public class SMSResponse {
	@ApiModelProperty(value = "SMS content sent") 
	private String content;
	@ApiModelProperty(value = "SMS sent Status") 
	private Status status;
	@ApiModelProperty(value = "SMS sent response success message or error depending on status") 
	private String response;
	@ApiModelProperty(value = "SMS Sent To") 
	private List<String> to;
	
	@Override
	public String toString() {
		return "SMSResponse [content=" + content + ", status=" + status + ", resposne=" + response + ", to=" + to + "]";
	}

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

	public void setResponse(String resposne) {
		this.response = resposne;
	}

	public List<String> getTo() {
		return to;
	}

	public void setTo(List<String> to) {
		this.to = to;
	}


}
