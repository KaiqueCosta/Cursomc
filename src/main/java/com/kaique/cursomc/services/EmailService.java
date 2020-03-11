package com.kaique.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.kaique.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
