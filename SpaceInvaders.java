import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class SpaceInvaders implements ActionListener, KeyListener {

    private static final int WIDTH = 800, HEIGHT = 600;
    private JFrame frame;
    private JPanel panel;
    private Timer timer;
    private int playerX;
    private List<Alien> aliens;
    private List<Projectile> projectiles;

    private class Alien {
        int x, y;
        boolean alive = true;

        public Alien(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private class Projectile {
        int x, y;
        boolean friendly;

        public Projectile(int x, int y, boolean friendly) {
            this.x = x;
            this.y = y;
            this.friendly = friendly;
        }
    }

    public static void main(String[] args) {
        new SpaceInvaders();
    }

    public SpaceInvaders() {
        frame = new JFrame("Space Invaders");
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

        playerX = WIDTH / 2;
        aliens = new ArrayList<>();
        projectiles = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                aliens.add(new Alien(50 + j * 60, 50 + i * 60));
            }
        }

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Projectile p : projectiles) {
            if (p.friendly) {
                p.y -= 5;
            } else {
                p.y += 5;
            }
        }

        projectiles.removeIf(p -> p.y < 0 || p.y > HEIGHT);

        for (Alien a : aliens) {
            if (a.alive) {
                for (Projectile p : projectiles) {
                    if (p.friendly && p.x >= a.x && p.x <= a.x + 40 && p.y >= a.y && p.y <= a.y + 40) {
                        a.alive = false;
                        p.y = -1;
                    }
                }
            }
        }

        panel.repaint();
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.GREEN);
        g.fillRect(playerX, HEIGHT - 50, 50, 10);

        g.setColor(Color.RED);
        for (Alien a : aliens) {
            if (a.alive) {
                g.fillRect(a.x, a.y, 40, 40);
            }
        }

        g.setColor(Color.WHITE);
        for (Projectile p : projectiles) {
            g.fillRect(p.x, p.y, 3, 10);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
           
        }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}