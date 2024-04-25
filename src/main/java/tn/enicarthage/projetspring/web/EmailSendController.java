package tn.enicarthage.projetspring.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.enicarthage.projetspring.services.IEmailService;


@RestController
@RequestMapping("/mail")
public class EmailSendController {
    private IEmailService emailService;

    public EmailSendController(IEmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public String sendMail(@RequestParam(value = "file", required = false) MultipartFile file, String to, String subject, String body) {
        return emailService.sendMail(file, to, subject, body);
    }

}
