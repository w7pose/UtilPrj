package com.bilisimegitim.utilprj.sayisalloto.ekran;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.bilisimegitim.utilprj.sayisalloto.SayisalLoto;

public class SayisalLotoEkran extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf3;
	private JTextField tf4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SayisalLotoEkran frame = new SayisalLotoEkran();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SayisalLotoEkran() {
		setTitle("Sayısal Loto v2.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSaysalLot = new JLabel("SAYISAL LOTO");
		lblSaysalLot.setForeground(Color.BLUE);
		lblSaysalLot.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSaysalLot.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaysalLot.setBounds(0, 50, 434, 14);
		contentPane.add(lblSaysalLot);

		tf1 = new JTextField();
		tf1.setBounds(28, 96, 45, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);

		tf2 = new JTextField();
		tf2.setBounds(95, 96, 45, 20);
		contentPane.add(tf2);
		tf2.setColumns(10);

		tf5 = new JTextField();
		tf5.setBounds(281, 96, 45, 20);
		contentPane.add(tf5);
		tf5.setColumns(10);

		tf6 = new JTextField();
		tf6.setColumns(10);
		tf6.setBounds(354, 96, 45, 20);
		contentPane.add(tf6);

		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(153, 96, 45, 20);
		contentPane.add(tf3);

		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(215, 96, 45, 20);
		contentPane.add(tf4);

		JButton btnevir = new JButton("ÇEVİR");
		btnevir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				SayisalLoto loto = new SayisalLoto();

				int[] sayilar = loto.arrayOlustur();

				tf1.setText(String.valueOf(sayilar[0]));
				tf2.setText(String.valueOf(sayilar[1]));
				tf3.setText(String.valueOf(sayilar[2]));
				tf4.setText(String.valueOf(sayilar[3]));
				tf5.setText(String.valueOf(sayilar[4]));
				tf6.setText(String.valueOf(sayilar[5]));

			}

		});
		btnevir.setBackground(Color.WHITE);
		btnevir.setForeground(Color.BLUE);
		btnevir.setBounds(171, 152, 89, 23);
		contentPane.add(btnevir);
	}
}
