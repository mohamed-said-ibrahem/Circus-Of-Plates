package circusOfPlates.view;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameFrame extends JFrame implements WindowListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static GameFrame gameFrame;

	public static GameFrame getGameFrame() {

		return gameFrame;
	}

	private GameFrame() {
		super("Circus of plates");
		gameFrame = this;
		initUI();
	}

	private void initUI() {

		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		MainMenu.getMainMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
		addWindowListener(this);

	}

	public static void main(String[] args) {

		new GameFrame();
		// IncludeClass m = new IncludeClass("aaaaaaaaaaaaaaaaaaaaa.class");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

		int reply = JOptionPane.showConfirmDialog(null, "Do you want to exit game? \n", "Delete",
				JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {

			System.exit(0);
		} else
			setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
