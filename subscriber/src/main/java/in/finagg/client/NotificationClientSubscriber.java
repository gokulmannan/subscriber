package in.finagg.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.finagg.bean.ApiResponse;
import in.finagg.bean.NotificationRequest;
import in.finagg.bean.NotificationResponse;
import in.finagg.configuration.FeignConfig;

 

@FeignClient(name = "NotificationClient", url = "http://192.168.1.6:8088/nfs/api/v1", configuration = FeignConfig.class)
public interface NotificationClientSubscriber {
    @RequestMapping(value = "/send/notification", method = RequestMethod.POST)
    ApiResponse<NotificationResponse> sendNotification(@RequestBody NotificationRequest request);
}

