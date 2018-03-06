package view;


import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Popup 
{
	private ImageIcon icon;
	private String windowTitle;
	
	public Popup()
	{
		icon = new ImageIcon(getClass().getResource("images/BaldMan.png"));
		windowTitle = "Chatbot says ";
	}
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message, windowTitle, JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
	public String collectResponse(String question)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, question, windowTitle, JOptionPane.PLAIN_MESSAGE, icon, null, "");
		
		return answer;
	}

}
