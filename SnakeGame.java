
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeGame extends JFrame {

    private SnakePanel snakePanel;
    private Timer timer;

    public SnakeGame() {
        setTitle("Snake Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        snakePanel = new SnakePanel();
        add(snakePanel);

        addKeyListener(new SnakeKeyListener());

        pack();
        setLocationRelativeTo(null);

        timer = new Timer(100, new TimerAction());
        timer.start();
    }

    private class SnakePanel extends JPanel {

        private static final int WIDTH = 400;
        private static final int HEIGHT = 400;
        private static final int UNIT_SIZE = 20;

        private int[] snakeX;
        private int[] snakeY;
        private int snakeLength;
        private int appleX;
        private int appleY;
        private char direction;
        private boolean gameOver;

        public SnakePanel() {
            setPreferredSize(new Dimension(WIDTH, HEIGHT));
            setBackground(Color.BLACK);
            setFocusable(true);

            snakeX = new int[WIDTH * HEIGHT / (UNIT_SIZE * UNIT_SIZE)];
            snakeY = new int[WIDTH * HEIGHT / (UNIT_SIZE * UNIT_SIZE)];
            snakeLength = 1;
            direction = 'R';
            gameOver = false;

            generateApple();

            addKeyListener(new SnakeKeyListener());
        }

        private void generateApple() {
            appleX = (int) (Math.random() * (WIDTH / UNIT_SIZE)) * UNIT_SIZE;
            appleY = (int) (Math.random() * (HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
        }

        private void move() {
            for (int i = snakeLength; i > 0; i--) {
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }

            switch (direction) {
                case 'U':
                    snakeY[0] -= UNIT_SIZE;
                    break;
                case 'D':
                    snakeY[0] += UNIT_SIZE;
                    break;
                case 'L':
                    snakeX[0] -= UNIT_SIZE;
                    break;
                case 'R':
                    snakeX[0] += UNIT_SIZE;
                    break;
            }
        }

        private void checkCollision() {
            for (int i = snakeLength; i > 0; i--) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    gameOver = true;
                }
            }

            if (snakeX[0] < 0 || snakeY[0] < 0 || snakeX[0] >= WIDTH || snakeY[0] >= HEIGHT) {
                gameOver = true;
            }

            if (snakeX[0] == appleX && snakeY[0] == appleY) {
                snakeLength++;
                generateApple();
            }
        }

        private void draw(Graphics g) {
            if (!gameOver) {
                g.setColor(Color.RED);
                g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

                for (int i = 0; i < snakeLength; i++) {
                    if (i == 0) {
                        g.setColor(Color.GREEN);
                    } else {
                        g.setColor(Color.WHITE);
                    }
                    g.fillRect(snakeX[i], snakeY[i], UNIT_SIZE, UNIT_SIZE);
                }
            } else {
                g.setColor(Color.RED);
                g.setFont(new Font("Times New Roman", Font.BOLD, 40));
                g.drawString("Game Over", WIDTH / 2 - 100, HEIGHT / 2);
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            draw(g);
        }
    }

    private class SnakeKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:
                    if (snakePanel.direction != 'D') {
                        snakePanel.direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (snakePanel.direction != 'U') {
                        snakePanel.direction = 'D';
                    }
                    break;
                case KeyEvent.VK_LEFT:
                    if (snakePanel.direction != 'R') {
                        snakePanel.direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (snakePanel.direction != 'L') {
                        snakePanel.direction = 'R';
                    }
                    break;
            }
        }
    }

    private class TimerAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!snakePanel.gameOver) {
                snakePanel.move();
                snakePanel.checkCollision();
                snakePanel.repaint();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SnakeGame().setVisible(true);
            }
        });
    }
}

    

