package edu.javacourse.move;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;

public class SquareComponent extends JComponent implements ActionListener
{
    private static final int SQUARE_SIZE = 30;
    private static final int STEP = 10;
    private int x = 0;
    private int y = 0;

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() instanceof JButton)
        {
            JButton btn = (JButton) e.getSource();

            if (MoveSquareFrame.UP.equals(btn.getActionCommand()))
            {
                y -= STEP;
                if (y < 0) y = 0;
            }

            if (MoveSquareFrame.DOWN.equals(btn.getActionCommand()))
            {
                y += STEP;
                int h = getSize().height - SQUARE_SIZE - 1;
                if (y > h) y = h;
                System.out.println(h);
            }

            if (MoveSquareFrame.LEFT.equals(btn.getActionCommand()))
            {
                x -= STEP;
                if (x < 0) x = 0;
            }

            if (MoveSquareFrame.RIGHT.equals(btn.getActionCommand()))
            {
                x += STEP;
                int w = getSize().width - SQUARE_SIZE - 1;
                if (x > w) x = w;
            }

            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
    }
}
