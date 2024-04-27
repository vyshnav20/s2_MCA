import java.awt.*;
import java.awt.event.*;

public class Mouse extends Frame implements MouseListener, WindowListener {
    Label statusLabel;

    Mouse() {
        setTitle("MouseEvent and WindowEvent Demo");
        setSize(300, 200);
        setLayout(new FlowLayout());

        statusLabel = new Label("Status: ");
        add(statusLabel);

        addMouseListener(this);
        addWindowListener(this);

        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        statusLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        statusLabel.setText("Mouse Entered at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseExited(MouseEvent e) {
        statusLabel.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        statusLabel.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        statusLabel.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void windowOpened(WindowEvent e) {
        statusLabel.setText("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
        statusLabel.setText("Window Closing");
        dispose();
    }

    public void windowClosed(WindowEvent e) {
        statusLabel.setText("Window Closed");
    }

    public void windowIconified(WindowEvent e) {
        statusLabel.setText("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e) {
        statusLabel.setText("Window Deiconified");
    }

    public void windowActivated(WindowEvent e) {
        statusLabel.setText("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        statusLabel.setText("Window Deactivated");
    }

    public static void main(String[] args) {
        new Mouse ();
    }
}
