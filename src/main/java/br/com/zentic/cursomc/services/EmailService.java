package br.com.zentic.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.zentic.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
