package com.hotmoka.examples.swing.elections.view;

import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.hotmoka.examples.swing.elections.controller.Controller;

@SuppressWarnings("serial")
public class InsertPartyNameDialog extends JDialog {

	public InsertPartyNameDialog(Controller controller) {
		super((Dialog) null);

		setTitle("Insert Party Name");

		setLayout(new FlowLayout());

		add(new JLabel("Insert new party name: "));

		JTextField textField = new JTextField("nome partito");
		textField.addActionListener(e -> {
			String party = textField.getText();
			if (!party.isEmpty())
				controller.addParty(party);

			setVisible(false);
		});
		add(textField);

		pack();

		setVisible(true);
	}
}