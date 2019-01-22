package hao.control;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class menuTestActionListener implements MenuListener {//设置菜单监听的方法

    public void menuCanceled(MenuEvent arg0) {//取消菜单时调用

    }

    public void menuDeselected(MenuEvent arg0) {//取消某个菜单时调用

    }

    public void menuSelected(MenuEvent arg0) {//选择某个菜单时调用
        JFrame information = new JFrame("作者");
        information.setVisible(true);
        // JOptionPane.showMessageDialog(null, "不能为空！", "消息!", 1);//这个是弹出框
    }
}
