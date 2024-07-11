package in.finagg.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel
public class NotificationResponse {
	
	
		/**
		 * Vendor Id of the lender
		 */
		@ApiModelProperty(value = "Vendor Id of the lender", position = 1)
		private Vendors vendorId;

		/**
		 * EventId for which notification was requested
		 */
		@ApiModelProperty(value = " EventName for which notification was requested", position = 2)
		private String eventName;

		/**
		 * Priority of the event
		 */
		@ApiModelProperty(value = "Priority of the event", position = 3)
		private EventPriority priority;

		/**
		 * Notification Id of the notification, you can check details of notification by this id.	
		 */
		@ApiModelProperty(value = "Notification Id of the notification, you can check details of notification by this id.", position = 5)
		private Integer notificationId;

		/**
		 * Notification object contains detail of email notification sent.
		 *
		 **/
		@ApiModelProperty(value = "Notification object contains detail of email notification sent.", position = 6)
		private EmailResponse email;
		/**
		 * Notification object contains detail of sms notification sent.
		 */
		@ApiModelProperty(value = "Notification object contains detail of sms notification sent.", position = 7)
		private SMSResponse sms;
		/**
		 * Notification object contains detail of whatsapp notification sent.
		 */
		@ApiModelProperty(value = "Notification object contains detail of whatsapp notification sent.", position = 8)
		private WhatsappResponse whatsapp;



		public Vendors getVendorId() {
			return vendorId;
		}
		public void setVendorId(Vendors vendorId) {
			this.vendorId = vendorId;
		}
		public EventPriority getPriority() {
			return priority;
		}
		public void setPriority(EventPriority priority) {
			this.priority = priority;
		}
		public Integer getNotificationId() {
			return notificationId;
		}
		public void setNotificationId(Integer notificationId) {
			this.notificationId = notificationId;
		}
		public EmailResponse getEmail() {
			return email;
		}
		public void setEmail(EmailResponse email) {
			this.email = email;
		}
		public SMSResponse getSms() {
			return sms;
		}

		public void setSms(SMSResponse sms) {
			this.sms = sms;
		}
		public void setWhatsapp(WhatsappResponse whatsapp) {
			this.whatsapp = whatsapp;
		}

		public String getEventName() {
			return eventName;
		}
		public void setEventName(String eventName) {
			this.eventName = eventName;
		}
		public WhatsappResponse getWhatsapp() {
			return whatsapp;
		}
		@Override
		public String toString() {
			return "NotificationResponse [vendorId=" + vendorId + ", eventName=" + eventName + ", priority=" + priority
					+ ", notificationId=" + notificationId + ", email=" + email + ", sms=" + sms + ", whatsapp=" + whatsapp
					+ "]";
		}
	}


