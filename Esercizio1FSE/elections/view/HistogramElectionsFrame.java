package com.hotmoka.examples.swing.elections.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.hotmoka.examples.swing.elections.controller.Controller;
import com.hotmoka.examples.swing.elections.model.Model;
import com.hotmoka.frames.MVCFrame;

@SuppressWarnings("serial")
public class HistogramElectionsFrame extends MVCFrame<Model, View, Controller> implements View {

	public HistogramElectionsFrame(Model model, Controller controller) {
	}

	@Override
	public void onModelChanged() {
	}
}