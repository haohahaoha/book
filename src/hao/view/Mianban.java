package hao.view;

import javax.swing.*;
import java.awt.*;

public class Mianban extends JPanel {
        private JTextArea j= new JTextArea();//创建文本框
        private JTextArea j1=new JTextArea();//创建提醒框
        private static final int x=40;//这个是文本框的横坐标x
        private static final int w=200;//这个是文本框的宽度
        private static final int h=20;//这个是文本框的高
        private static  int n=120;//这个是第一个文本框的纵坐标y
        public Mianban(){
            this.setLayout(null);//设置流式布局
            Mianban a[]=new Mianban[6];
            for(int i=0;i<6;i++){          /*这个for循环是订1-6个文本框的位置*/
                a[i] .setBounds(x,a(),w,h);/*通过a()这个函数来返回每一个文本框的纵坐标*/
                this.add(a[i]);//然后把这个文本框添加进去
            }
        }
        public int a(){                     /*这个类是创建了个数组，元素个数为6*/
            int Mianban[]= new int[6];
            for(int i=0;i<6;i++){           /*通过for循环来把每一个纵坐标都加30*/
            for(int jj=0;jj<180;) {
                Mianban[i] = n + jj;
                jj = jj + 30;
              }
            }
            for(int i=0;i<6;i++)        /*我希望每一个纵坐标一加上30后就直接返回给上面的setBound()这样不就出来6个文本框了么
                                            但是就是不行*/
                return Mianban[i];
        }
     /*   public Mianban(int n){
            for(int jj=0;;){
                for(int i=0;i<6;i++) {
                    j[i].setBounds(40, n+jj, 200,20);//文本框定位
                    jj=jj+30;
                    j[i].setLineWrap(true);

                }
            }
        }*/
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
