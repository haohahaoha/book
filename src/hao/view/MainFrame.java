package hao.view;

import hao.constant.Constant;
import hao.control.MyMenuListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame implements ActionListener {//ActionListener是个事件监听接口用来监听菜单项，那菜单那？

    public MainFrame() {
        JFrame jfrm = new JFrame(Constant.title);
        jfrm.setBackground(Color.yellow);
        jfrm.setAlwaysOnTop(true);//设置总在顶端显示
        Mianban m=new Mianban();
        //TODO 替换所有常量
        jfrm.setSize(300,500);//设置窗口大小
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置虚拟机的关闭
        JMenuBar jmb=new JMenuBar();//创建顶级菜单（菜单的容器）
        JMenu jmFile=new JMenu("文件");//创建一个菜单
        jmFile.addMenuListener(new MyMenuListener());

        JMenuItem jmiOpen = new JMenuItem("打开");
        JMenuItem jmiSave = new JMenuItem("保存");
        jmFile.add(jmiOpen);/*把选项添加进菜单里*/
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmb.add(jmFile);//把菜单添加进菜单容器里
        JMenu jmFile1=new JMenu("编辑");
        JMenuItem jmiziti=new JMenuItem("字体");
        JMenuItem jmicolor=new JMenuItem("颜色");
        jmFile1.add(jmiziti);
        jmFile1.add(jmicolor);
        jmb.add(jmFile1);
        jmiziti.addActionListener(this);
        jmicolor.addActionListener(this);
        JMenu jmFile2=new JMenu("总结");
        JMenuItem jmiMonthly=new JMenuItem("月总结");
        JMenuItem jmiyear=new JMenuItem("年总结");
        jmFile2.add(jmiMonthly);
        jmFile2.add(jmiyear);
        jmb.add(jmFile2);
        jmiMonthly.addActionListener(this);
        jmiyear.addActionListener(this);
        JMenu jmFile3=new JMenu("皮肤");
        jmb.add(jmFile3);
        jmFile3.addActionListener(this);
        jfrm.setJMenuBar(jmb);//菜单栏必须通过调用setJMenuBar()添加到框架中
        jfrm.add(m);
        jfrm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){//实现监听
        String comStr=ae.getActionCommand();

        if(comStr.equals("退出"))System.exit(0);
    }
}




