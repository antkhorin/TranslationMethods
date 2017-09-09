import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

class Tree<T> {

    T t;
    private String name;
    private List<Tree> children;
    private double x;
    private double y;
    private static double width;
    private static double height;
    private static double step;
    private static int size = 1000;

    T get() {return t;}

    Tree(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    void add(Tree tree) {
        children.add(tree);
    }

    void print() {
        width = 1;
        height = 0;
        dfs(1);
        height++;
        step = size / (Math.max(width, height));
        JFrame frame = new JFrame();
        frame.setSize(size + 50, size + 50);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        x *= size / width;
        y *= size / height;
        frame.add(new Panel());
        frame.setVisible(true);
    }

    private void dfs(int d) {
        height = Math.max(height, d);
        y = d;
        if (children.size() == 0) {
            x = width++;
        } else {
            children.forEach(e -> e.dfs(d + 1));
            x = (children.get(0).x + children.get(children.size() - 1).x) / 2;
        }
    }

    class Panel extends JPanel {

        public void paintComponent(Graphics graphics) {
            graphics.drawString(name, (int) x - 3, (int) y + 3);
            graphics.drawOval((int) (x - step / 2), (int) (y - step / 2), (int) step, (int) step);
            for (Tree child : children) {
                child.x *= size / width;
                child.y *= size / height;
                double xDiff = x - child.x;
                double yDiff = y - child.y;
                double length = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
                double xOffset = step * xDiff / length / 2;
                double yOffset = step * yDiff / length / 2;
                graphics.drawLine((int) (x - xOffset), (int) (y - yOffset), (int) (child.x + xOffset), (int) (child.y + yOffset));
                child.new Panel().paintComponent(graphics);
            }
        }
    }

}

