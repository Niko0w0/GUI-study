package com.Dai.lesson04;

import javax.swing.*;
import java.awt.*;

/**
 * @auther Daisy
 * @date 2020/6/15 - 18:27
 */
//图标，需要实现类 Frame显示
public class IconDemo extends JFrame implements Icon {
    private int width;
    private int height;
    public IconDemo(){}//无参构造
    public IconDemo(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void init(){
        IconDemo iconDemo = new IconDemo(15,15);
        //图标放在标签 也可以放在按钮上
        JLabel label = new JLabel("icontest",iconDemo,SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        this.setBounds(100,100,100,100);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new IconDemo().init();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
