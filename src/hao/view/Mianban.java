package hao.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Mianban extends JPanel  {
    private JTextArea j= new JTextArea();//创建文本框
    private JTextArea j1= new JTextArea();//创建文本框
    private JTextArea j2= new JTextArea();//创建文本框
    private JTextArea j3= new JTextArea();//创建文本框
    private JTextArea j4= new JTextArea();//创建文本框
    private JTextArea j5= new JTextArea();//创建文本框
        private JTextArea jj=new JTextArea();//创建提醒框

        public Mianban(){


            this.setLayout(null);//设置流式布局
            j.setBounds(40,120,200,20);
            j1.setBounds(40,150,200,20);
            j2.setBounds(40,180,200,20);
            j3.setBounds(40,210,200,20);
            j4.setBounds(40,240,200,20);
            j5.setBounds(40,270,200,20);
            jj.setBounds(30,300,200,80);
           this.add(j);
            this.add(j1);
            this.add(j2);
            this.add(j3);
            this.add(j4);
            this.add(j5);
            this.add(jj);

            //a.setBounds(40,120,20,2);

        }

        public void paint(Graphics g){
            g.setFont(new Font("微软雅黑",Font.BOLD,15));
            g.drawString("小主，今天您想做什么呢？",10,100);
            g.drawString("今天也要加油哦！",70,420);
            g.drawString("1",24,135);
            g.drawString("2",24,165);
            g.drawString("3",24,195);
            g.drawString("4",24,225);
            g.drawString("5",24,255);
            g.drawString("6",24,285);
            //TODO 优化显示,加入item按钮等
        }


}
