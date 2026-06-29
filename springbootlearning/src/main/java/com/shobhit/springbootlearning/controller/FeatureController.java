package com.shobhit.springbootlearning.controller;

import com.shobhit.springbootlearning.service.EmailService;
import com.shobhit.springbootlearning.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feature")
public class FeatureController {

    @Autowired(required = false)
    private EmailService emailService;

    @Autowired(required = false)
    private SmsService smsService;

    @GetMapping("/email/{to}")
    public ResponseEntity<String> sendEmail(@PathVariable String to) {
        // check if feature is enabled (bean exists)
        if (emailService == null) {
            return ResponseEntity.badRequest()
                    .body("Email feature is DISABLED");
        }
        return ResponseEntity.ok(emailService.sendEmail(to));
    }

    @GetMapping("/sms/{to}")
    public ResponseEntity<String> sendSms(@PathVariable String to) {
        if (smsService == null) {
            return ResponseEntity.badRequest()
                    .body("SMS feature is DISABLED");
        }
        return ResponseEntity.ok(smsService.sendSms(to));
    }

}
