package edu.javacourse.move;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MoveSquareFrame extends JFrame
{
    public static final String UP = "UP";
    public static final String DOWN = "DOWN";

    public MoveSquareFrame()
    {
        SquareComponent sc = new SquareComponent();
        add(sc);

        JButton btnUp = new JButton();
        btnUp.setActionCommand(UP);
        btnUp.addActionListener(sc);
        add(btnUp, BorderLayout.NORTH);

        JButton btnDown = new JButton();
        btnDown.setActionCommand(DOWN);
        btnDown.addActionListener(sc);
        add(btnDown, BorderLayout.SOUTH);

        setBounds(100, 100, 400, 400);
    }
}
