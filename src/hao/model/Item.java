package hao.model;

import java.sql.Date;

/**
 * Item
 * 事项类
 * 描述了每一个事项的内容,时间
 */
public class Item {
    private Integer iId;//用于数据库的id
    private String iContent;//内容
    private Date date;//时间

    public Item(String iContent, Date date) {
        this.iContent = iContent;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Item{" +
                "iId=" + iId +
                ", iContent='" + iContent + '\'' +
                ", date=" + date +
                '}';
    }

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getiContent() {
        return iContent;
    }

    public void setiContent(String iContent) {
        this.iContent = iContent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Item(Integer iId, String iContent, Date date) {
        this.iId = iId;
        this.iContent = iContent;
        this.date = date;
    }
}
