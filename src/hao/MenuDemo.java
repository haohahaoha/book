package hao;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

 class menuTestActionListener implements MenuListener {//设置菜单监听的方法
    public void menuCanceled(MenuEvent arg0) {//取消菜单时调用

    }
    public void menuDeselected(MenuEvent arg0) {//取消某个菜单时调用

    }
    public void menuSelected(MenuEvent arg0) {//选择某个菜单时调用
        JFrame information=new JFrame("作者");
        information.setVisible(true);
        // JOptionPane.showMessageDialog(null, "不能为空！", "消息!", 1);//这个是弹出框
 }
}
class MenuDemo implements ActionListener {//ActionListener是个事件监听接口用来监听菜单项，那菜单那？
    MenuDemo(){
        JFrame jfrm=new JFrame("便便签");//创建窗口名叫Menu Demo
        jfrm.setBackground(Color.yellow);
        jfrm.setAlwaysOnTop(true);//设置总在顶端显示
        Mianban m=new Mianban();
        jfrm.setSize(300,500);//设置窗口大小
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置虚拟机的关闭
        JMenuBar jmb=new JMenuBar();//创建顶级菜单（菜单的容器）
        JMenu jmFile=new JMenu("文件");//创建一个菜单
        jmFile.addMenuListener(new menuTestActionListener());
        jfrm.setVisible(false);

//       JMenuItem jmiOpen=new JMenuItem("打开");//创建菜单项叫Open
//        JMenuItem jmiClose=new JMenuItem("Close");//创建菜单项叫Close
//        JMenuItem jmiSave=new JMenuItem("保存");
//        JMenuItem jmiExit=new JMenuItem("退出");//创建菜单项叫Exit
//        jmFile.add(jmiOpen);/*把选项添加进菜单里*/
//        jmFile.add(jmiClose);
//        jmFile.add(jmiSave);
//        jmFile.addSeparator();
//        jmFile.add(jmiExit);
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
        //jfrm.add(jlab);//给窗口添加标签，为什么要添加标签？
        jfrm.setJMenuBar(jmb);//菜单栏必须通过调用setJMenuBar()添加到框架中
        jfrm.add(m);
        jfrm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){//实现监听
        String comStr=ae.getActionCommand();

        if(comStr.equals("退出"))System.exit(0);
    }
}




