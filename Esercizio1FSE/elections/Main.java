package com.hotmoka.examples.swing.elections;

import java.awt.EventQueue;

import com.hotmoka.examples.swing.elections.controller.Controller;
import com.hotmoka.examples.swing.elections.model.Model;
import com.hotmoka.examples.swing.elections.view.HistogramElectionsFrame;
import com.hotmoka.examples.swing.elections.view.NumericElectionsFrame;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				Controller controller = new Controller();
				Model model = new Model();

				new NumericElectionsFrame(model, controller).setVisible(true);
				new NumericElectionsFrame(model, controller).setVisible(true);
				new HistogramElectionsFrame(model, controller).setVisible(true);
			}
		});
	}
}
