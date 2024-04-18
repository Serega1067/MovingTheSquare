package edu.javacourse.move;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MoveSquareFrame extends JFrame
{
    public static final String UP = "UP";
    public static final String DOWN = "DOWN";
    public static final String LEFT = "LEFT";
    public static final String RIGHT = "RIGHT";

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

        JButton btnLeft = new JButton();
        btnLeft.setActionCommand(LEFT);
        btnLeft.addActionListener(sc);
        add(btnLeft, BorderLayout.WEST);

        JButton btnRight = new JButton();
        btnRight.setActionCommand(RIGHT);
        btnRight.addActionListener(sc);
        add(btnRight, BorderLayout.EAST);

        setBounds(100, 100, 400, 400);
    }
}
