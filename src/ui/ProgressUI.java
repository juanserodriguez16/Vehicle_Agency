package ui;

import java.util.Scanner;

import model.ProgressGadget;
import model.SimpleProgressBar;
import thread.ProgressGadgetThread;

public class ProgressUI {
	private ProgressGadgetThread  threads;
	private ProgressGadget progressG;
	
	public static final int MIN_SLEEP = 1;	
	public static final int MAX_SLEEP = 5;	

	public ProgressUI() {
	}
	
	private void createProgressGadgets() {
		progressG = new SimpleProgressBar(10,'#');
		
		threads = new ProgressGadgetThread(progressG,this,MIN_SLEEP+(int)(Math.random()*(MAX_SLEEP-MIN_SLEEP)));
	
	}
	
	public void startProgress() {
		createProgressGadgets();
		
		threads.start();		
		System.out.println("[CARGANDO SISTEMA DE VEHICULOS - ]");
	}

	public void refresh() {
		String progressState = "\r";
		progressState += progressG.getState();
		System.out.print(progressState);
	}
}