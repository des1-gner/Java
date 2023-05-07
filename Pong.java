import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pong implements ActionListener, KeyListener {
    private static final int WIDTH = 800, HEIGHT = 600;

    private JFrame frame;
    private JPanel panel;
    private Timer timer;
    private int ballX, ballY, ballXSpeed, ballYSpeed, paddle1Y, paddle2Y;
    private final int paddleWidth = 15, paddleHeight = 100;

    public static void main(String[] args) {
        new Pong();
    }

    public Pong() {
        frame = new JFrame("Pong");
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                draw(g);
            }
        };

        timer = new Timer(1000 / 60, this);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.addKeyListener(this);
        frame.setResizable(false);
        frame.setVisible(true);

        ballX = WIDTH / 2;
        ballY = HEIGHT / 2;
        ballXSpeed = 2;
        ballYSpeed = 2;
        paddle1Y = paddle2Y = (HEIGHT - paddleHeight) / 2;

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballX += ballXSpeed;
        ballY += ballYSpeed;

        if (ballY <= 0 || ballY + 30 >= HEIGHT) {
            ballYSpeed = -ballYSpeed;
        }

        if (ballX <= paddleWidth && ballY + 30 >= paddle1Y && ballY <= paddle1Y + paddleHeight || ballX + 30 >= WIDTH - paddleWidth && ballY + 30 >= paddle2Y && ballY <= paddle2Y + paddleHeight) {
            ballXSpeed = -ballXSpeed;
        }

        if (ballX < 0) {
            ballX = WIDTH / 2;
            ballY = HEIGHT / 2;
        }

        if (ballX > WIDTH) {
            ballX = WIDTH / 2;
            ballY = HEIGHT / 2;
        }

        panel.repaint();
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.WHITE);
        g.fillRect(paddleWidth, paddle1Y, paddleWidth, paddleHeight);
        g.fillRect(WIDTH - paddleWidth * 2, paddle2Y, paddleWidth, paddleHeight);
        g.fillOval(ballX, ballY, 30, 30);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP) {
            paddle2Y = Math.max(paddle2Y - 15, 0);
        } else if (key == KeyEvent.VK_DOWN) {
            paddle2Y = Math.min(paddle2Y + 15, HEIGHT - paddleHeight);
        }

        if (key == KeyEvent.VK_W) {
            paddle1Y = Math.max(paddle1Y - 15, 0);
        } else if (key == KeyEvent.VK_S) {
            paddle1Y = Math.min(paddle1Y + 15, HEIGHT - paddleHeight);
        }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
    }
