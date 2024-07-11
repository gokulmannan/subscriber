package in.finagg.bean;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;


@JsonInclude(Include.NON_NULL)

public class EmailResponse {

	@ApiModelProperty(value = "Email Content Sent") 
	private String content;
	@ApiModelProperty(value = "Email subject sent") 
	private String subject;
	@ApiModelProperty(value = "Email sent from name") 
	private String fromName;
	@ApiModelProperty(value = "Email Sent To") 
	private List<String> to = new ArrayList<String>();
	@ApiModelProperty(value = "Email Sent From") 
	private String from;
	@ApiModelProperty(value = "Email sent CCed to ") 
	private List<String>  cc  = new ArrayList<String>();
	@ApiModelProperty(value = "Email sent BCCed to ") 
	private List<String>  bcc  = new ArrayList<String>();
	@ApiModelProperty(value = "Email sent Status") 
	private Status status;
	@ApiModelProperty(value = "Email sent response success message or error depending on status") 
	private String response;

	@ApiModelProperty(value = "Email sent has attachemnts file paths if any.") 
	private List<String> attachment = new ArrayList<String>();

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public List<String> getTo() {
		return to;
	}

	public void setTo(List<String> to) {
		this.to = to;
	}
	public void addTo(String to) {
		this.to.add(to);
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public List<String> getCc() {
		return cc;
	}

	public void setCc(List<String> cc) {
		this.cc = cc;
	}
	public void addCC(String cc) {
		this.cc.add(cc);
	}

	public List<String> getBcc() {
		return bcc;
	}

	public void setBcc(List<String> bcc) {
		this.bcc = bcc;
	}

	public void addBCC(String bcc) {
		this.bcc.add(bcc);
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

	public List<String> getAttachment() {
		return attachment;
	}

	public void setAttachment(List<String> attachment) {
		this.attachment = attachment;
	}
	public void addAttachment(String attachment) {
		this.attachment.add(attachment);
	}
	@Override
	public String toString() {
		return "EmailResponse [subject=" + subject + ", to=" + to + ", from=" + from
				+ ", fromName=" + fromName + ", cc=" + cc + ", bcc=" + bcc + ", status=" + status + ", response="
				+ response + ", attachment=" + attachment + "]";
	}
}
