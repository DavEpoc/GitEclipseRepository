package com.hotmoka.examples.swing.elections.view;

import com.hotmoka.examples.swing.elections.controller.Controller;
import com.hotmoka.examples.swing.elections.model.Model;

public interface View extends com.hotmoka.mvc.View<Model, View, Controller> {
	// 3: change your display
	// nothing here

	// 4: I've changed
	void onModelChanged();
}