package com.hotmoka.examples.swing.elections.controller;

import com.hotmoka.examples.swing.elections.model.Model;
import com.hotmoka.examples.swing.elections.view.InsertPartyNameDialog;
import com.hotmoka.examples.swing.elections.view.View;

public class Controller extends com.hotmoka.mvc.Controller<Model, View, Controller>{

	// 1: the user did something
	public void insertNewParty() {
		new InsertPartyNameDialog(this);
	}

	public void addParty(String party) {
	}

	public void removeParty(String party) {
	}

	public void registerVoteFor(String party) {
	}
}