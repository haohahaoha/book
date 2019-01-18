package hao;

import javax.swing.*;
import java.awt.*;

public class Mianban extends JPanel {
        private JTextPane j=new JTextPane();//创建文本框
        private JTextPane j1=new JTextPane();//创建提醒框
        public Mianban(){
            this.setLayout(null);//设置流式布局
            j.setBounds(40, 120, 200, 200);//文本框定位
            //j.setOpaque(false);//设置背景透明
            //this.setBackground(Color.orange);//文本框背景颜色
            this.add(j);
            j1.setBounds(30,330,230,50);
            //j1.setBackground(Color.red);
            this.add(j1);
        }
        public void paint(Graphics g){
            g.setFont(new Font("楷体",Font.BOLD,15));
            g.drawString("小主，今天您想做什么呢？",10,100);
            g.drawString("今天也要加油哦！",70,420);
        }

}
