package tn.enicarthage.projetspring.services;

import org.springframework.web.multipart.MultipartFile;

public interface IEmailService {
	String sendMail(MultipartFile file, String to, String subject, String body);
}
