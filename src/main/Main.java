package main;

import java.sql.Connection;

import gui.CuponWindow;
import gui.LoginWindow;
import gui.MainWindow;
import gui.UserWindow;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// crea una ventana de cada tipo (muestra de GUI)
		MainWindow  mainWindow = new MainWindow();
		mainWindow.frmdentickets.setVisible(true);
		
		CuponWindow cuponWindow = new CuponWindow();
		cuponWindow.frmFormularioCupn.setVisible(true);
		
		LoginWindow loginWindow = new LoginWindow();
		loginWindow.frmLogIn.setVisible(true);
		
		UserWindow userWindow = new UserWindow();
		userWindow.frmLa.setVisible(true);
	}
}
