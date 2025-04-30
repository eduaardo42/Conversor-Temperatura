package br.dev.eduardo.temperatura.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;


public class TelaConversor {
	
		private JTextField textCelsius;
		private JLabel labelCelsius;
		private JButton buttonKelvin;
		private JButton buttonFahreinheit;
		private JLabel labelResultado;
		//private JLabel labelMensagemErro;
		
		private String tituloDaTela;
		
		public void criarTelaConversor() {
		
			JFrame tela= new JFrame();
			tela.setTitle("Conversor de Temperatura");
			tela.setSize(500, 450);
			//esta linha abaixo finaliza a operação e para de rodar o programa
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tela.setResizable(false);
			tela.setLayout(null);
			//tela.setVisible(true);
			
			Container container = tela.getContentPane();
			
			
			labelCelsius = new JLabel();
			labelCelsius.setText("Temperatura em graus Celsius: ");
			labelCelsius.setBounds(40, 30, 250, 30);
			
			textCelsius = new JTextField();
			textCelsius.setBounds(40, 60, 415, 25);
			
			buttonKelvin = new JButton();
			buttonKelvin.setText("KELVIN");
			buttonKelvin.setBounds(42, 90, 200, 20);
			
			buttonFahreinheit = new JButton();
			buttonFahreinheit.setText("FAHREINHEIT");
			buttonFahreinheit.setBounds(252, 90, 200, 20);
			
			labelResultado = new JLabel();
			labelResultado.setText("Teexto");
			labelResultado.setBounds(210, 120, 250, 30);
			
			
			
			//Onde as labels são adicionadas aos containers
			container.add(labelCelsius);
			container.add(textCelsius);
			container.add(buttonKelvin);
			container.add(buttonFahreinheit);
			container.add(labelResultado);
			
			//as linhas a seguir são utilizadas para atribuir funções aos botões
			
			buttonKelvin.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
			
					
					String celsius = textCelsius.getText() ;
					
					
					//Temperatura temperatura = new Temperatura();
				
					
				
				}
			});
			
			
			
			
			tela.setVisible(true);
	}

	
	
	
	
	
}