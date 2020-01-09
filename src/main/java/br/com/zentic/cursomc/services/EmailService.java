package br.com.zentic.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import br.com.zentic.cursomc.domain.Cliente;
import br.com.zentic.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);

	void sendHtmlEmail(MimeMessage msg);
}
