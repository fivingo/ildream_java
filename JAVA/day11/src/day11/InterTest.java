package day11;
// 인터페이스 예시 - GUI
import java.awt.*;
import java.awt.event.*;

public class InterTest extends Frame implements WindowListener {
	public static void main(String[] args) {
		InterTest it = new InterTest();
		it.setSize(300, 300);
		it.setVisible(true);
	}

	public InterTest() {
		this.addWindowListener(this);
	}
	
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowOpened(WindowEvent e) {}
}
