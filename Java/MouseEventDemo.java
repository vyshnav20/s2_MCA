import javax.swing.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame 
{
    public MouseEventDemo() 
    {
        setTitle("Mouse Events Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mousePressed(MouseEvent e) 
            {
                System.out.println("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseReleased(MouseEvent e) 
            {
                System.out.println("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse entered at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseExited(MouseEvent e) 
            {
                System.out.println("Mouse exited at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() 
        {
            public void mouseDragged(MouseEvent e) 
            {
                System.out.println("Mouse dragged to (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseMoved(MouseEvent e) 
            {
                System.out.println("Mouse moved to (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                System.out.println("Window closed");
            }
        });
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() ->
        {
            MouseEventDemo demo = new MouseEventDemo();
            demo.setVisible(true);
        });
    }
}
