package com.hotmoka.examples.swing.elections.model;

import java.util.HashMap;
import java.util.Map;

import com.hotmoka.examples.swing.elections.controller.Controller;
import com.hotmoka.examples.swing.elections.view.View;

public class Model extends com.hotmoka.mvc.Model<Model, View, Controller> {
	// 5: I need your state information
	public Iterable<String> getParties() {
	}

	public int getVotesFor(String party) {
	}

	// 2: change your state
	public void addParty(String party) {
		forEachView(View::onModelChanged);
	}

	public void removeParty(String party) {
	}

	public void setVoteFor(String party, int votes) {
	}
}