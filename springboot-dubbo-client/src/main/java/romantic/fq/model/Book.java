package romantic.fq.model;

import java.util.Date;

/**
 * Created by fengqing on 2017/5/7.
 */
public class Book {
    //id
    private Long id;
    //书名
    private String bookName;
    //类型
    private String type;
    //出版日期
    private Date issueDate;
    //作者
    private String author;
    //创建时间
    private Date crDate;
    //修改时间
    private Date upDate;
    //创建人
    private String crOper;
    //修改人
    private String upOper;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCrDate() {
        return crDate;
    }

    public void setCrDate(Date crDate) {
        this.crDate = crDate;
    }

    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }

    public String getCrOper() {
        return crOper;
    }

    public void setCrOper(String crOper) {
        this.crOper = crOper;
    }

    public String getUpOper() {
        return upOper;
    }

    public void setUpOper(String upOper) {
        this.upOper = upOper;
    }
}
