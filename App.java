import javax.swing.*;
import java.awt.Dimension; // gets screen dimension
import java.awt.Toolkit; //its a toolkit 

public class App {
    public static void main(String[] args) throws Exception {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int boardHeight = screenSize.height;
		int boardWidth = screenSize.width;

        JFrame frame = new JFrame("Snake Game");
        frame.setVisible(true);
    	frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
