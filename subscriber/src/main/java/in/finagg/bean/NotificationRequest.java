package in.finagg.bean;

import java.util.Arrays;
import java.util.Map;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

 

@ApiModel
public class NotificationRequest {	
		/**
		 * Vendor Id of the lender
		 */
		@ApiModelProperty(value = "Vendor Id of the lender", position = 1)
		private String vendorId;
		/**
		 * EventId is`event_id` Column from Table `nfs_notification_master`
		 */
		@ApiModelProperty(value = "EventName is `event_name` Column from Table `nfs_notification_master`", position = 2)
		private String eventName;
		/**
		 * Priority of the event
		 */
		@ApiModelProperty(value = "Priority of the event", position = 3)
		private String priority;
		/**
		 * Data is Map<String, Object> for Composing Content of EMail/Whatsapp/SMS
		 */
		@ApiModelProperty(value = "Data is Map<String, Object> for Composing Content of EMail/Whatsapp/SMS", position = 4)
		private Map<String, Object>  data;
		/**
		 * Attachment is the List of attachments absolute paths if any
		 */
		@ApiModelProperty(value = "Attachment is the List of attachments absolute paths if any", position = 5)
		private String[] attachment;

		/**
		 * To contains List of EmailIds for sending email
		 */
		@ApiModelProperty(value = "To contains List of EmailIds for sending email", position = 6)
		private String[] to;
		
		/**
		 * CC contains List of EmailIds for sending email
		 */
		@ApiModelProperty(value = "CC contains List of EmailIds for sending email, Default: from the Notification Table", position = 7)
		private String[] cc;
		/**
		 * BCC contains List of EmailIds for sending email
		 */
		@ApiModelProperty(value = "BCC contains List of EmailIds for sending email, Default: from the Notification Table", position = 8)
		private String[] bcc;

		/**
		 * Mobile contains List of Mobile number  for sending SMS/Whtasapp
		 */
		@ApiModelProperty(value = "Mobile contains List of Mobile number  for sending SMS/Whtasapp", position = 9)
		private String[] mobile;
		/**
		 * From contains EmailId in case of Email and Mobile No in case os SMS/WhatsApp
		 */
		@ApiModelProperty(value = "From contains EmailId in case of Email and Mobile No in case os SMS/WhatsApp, Default: from the Notification Table", position = 10)
		private String from;
		/**
		 * From contains Display Name of from.
		 */
		@ApiModelProperty(value = "From contains Display Name of from, Default: from the Notification Table", position =11)
		private String fromName;

		//	/**
		//	 * Subject is subject of Notification, Default: from the Notification Table
		//	 */
		//	@ApiModelProperty(value = "Subject is subject of Notification, Default: from the Notification Table", position = 10)
		//	private String subject;

		public String getVendorId() {
			return vendorId;
		}
		public void setVendorId(String vendorId) {
			this.vendorId = vendorId;
		}
		public String getPriority() {
			return priority;
		}
		public void setPriority(String  priority) {
			this.priority = priority;
		}
		public Map<String, Object> getData() {
			return data;
		}
		public void setData(Map<String, Object> data) {
			this.data = data;
		}
		public String[] getAttachment() {
			return attachment;
		}
		public void setAttachment(String[] attachment) {
			this.attachment = attachment;
		}
		public String[] getTo() {
			return to;
		}
		public void setTo(String[] to) {
			this.to = to;
		}
		public String getFrom() {
			return from;
		}
		public void setFrom(String from) {
			this.from = from;
		}
		public String[] getCc() {
			return cc;
		}
		public void setCc(String[] cc) {
			this.cc = cc;
		}
		public String[] getBcc() {
			return bcc;
		}
		public void setBcc(String[] bcc) {
			this.bcc = bcc;
		}

		public String getFromName() {
			return fromName;
		}
		public void setFromName(String fromName) {
			this.fromName = fromName;
		}
		public String getEventName() {
			return eventName;
		}
		public void setEventName(String eventName) {
			this.eventName = eventName;
		}
		
		public String[] getMobile() {
			return mobile;
		}
		public void setMobile(String[] mobile) {
			this.mobile = mobile;
		}
		@Override
		public String toString() {
			return "NotificationRequest [vendorId=" + vendorId + ", eventName=" + eventName + ", priority=" + priority
					+ ", data=" + data + ", attachment=" + Arrays.toString(attachment) + ", to=" + Arrays.toString(to)
					+ ", cc=" + Arrays.toString(cc) + ", bcc=" + Arrays.toString(bcc) + ", mobile="
					+ Arrays.toString(mobile) + ", from=" + from + ", fromName=" + fromName + "]";
		}

	}

