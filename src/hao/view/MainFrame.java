package hao.view;

import hao.constant.Constant;
import hao.control.MyMenuListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MainFrame implements ActionListener , ItemListener {//ActionListener是个事件监听接口用来监听菜单项，那菜单那？

    public MainFrame() {
        JFrame jfrm = new JFrame(Constant.title);
        jfrm.setBackground(Color.yellow);
        jfrm.setAlwaysOnTop(true);//设置总在顶端显示
        Mianban m = new Mianban();
        JCheckBox cb=new JCheckBox("完");
        cb.addItemListener(this);
        cb.setBounds(250,116,20,20);
        jfrm.add(cb);
        JCheckBox cb1=new JCheckBox("完");
        cb1.addItemListener(this);
        cb1.setBounds(250,146,20,20);
        jfrm.add(cb1);
        JCheckBox cb2=new JCheckBox("完");
        cb2.addItemListener(this);
        cb2.setBounds(250,176,20,20);
        jfrm.add(cb2);
        JCheckBox cb3=new JCheckBox("完");
        cb3.addItemListener(this);
        cb3.setBounds(250,205,20,20);
        jfrm.add(cb3);
        JCheckBox cb4=new JCheckBox("完");
        cb4.addItemListener(this);
        cb4.setBounds(250,235,20,20);
        jfrm.add(cb4);
        JCheckBox cb5=new JCheckBox("完");
        cb5.addItemListener(this);
        cb5.setBounds(250,265,20,20);
        jfrm.add(cb5);

        //TODO 替换所有常量
        jfrm.setSize(300, 500);//设置窗口大小
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("文件", new NewPanel());
        jtp.addTab("编辑", new CitiesPanel());
        jtp.addTab("总结", new ColorsPanel());
        jtp.addTab("皮肤", new FlavorsPanel());
        jfrm.add(jtp);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置虚拟机的关闭
        jfrm.add(m);
        jfrm.setVisible(true);

    }

        public void actionPerformed(ActionEvent ae){//实现监听
            String comStr=ae.getActionCommand();
            if(comStr.equals("退出"))System.exit(0);
        }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
class NewPanel extends JPanel{
    public NewPanel(){
//            JFrame information=new JFrame("上上签信息");
//            JPanel inform=new JPanel();
//            information.add(inform);
//            information.setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("产品信息",10,70);
        g.drawString("用户信息",10,80);
        g.drawString("注销",10,98);
        g.drawString("切换用户",10,110);
    }
}
class CitiesPanel extends JPanel{
    public CitiesPanel(){
        JComboBox<String> jcb=new JComboBox<String>();
        jcb.addItem("微软雅黑");
        jcb.addItem("楷体");
        jcb.addItem("宋体");
        add(jcb);
        JComboBox<String> jcb1=new JComboBox<String>();
        jcb1.addItem("黑色");
        jcb1.addItem("红色");
        jcb1.addItem("白色");
        add(jcb1);

    }
}
class ColorsPanel extends JPanel{
    public ColorsPanel(){
        JButton b1=new JButton("周总结");
        add(b1);
        JButton b2=new JButton("月总结");
        add(b2);
        JButton b3=new JButton("年总结");
        add(b3);
    }
}
class FlavorsPanel extends JPanel{
    public FlavorsPanel(){
        JComboBox<String> jcb2=new JComboBox<String>();
        jcb2.addItem("你猜");
        jcb2.addItem("你再猜");
        jcb2.addItem("呵呵呵");
        add(jcb2);
    }
}



