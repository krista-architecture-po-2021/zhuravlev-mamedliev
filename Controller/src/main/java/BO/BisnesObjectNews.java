package BO;

import java.util.Date;

public class BisnesObjectNews {

    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    private Date publucationdate;

    public void setPublucationdate(Date publucationdate) {
        this.publucationdate = publucationdate;
    }

    public Date getPublucationdate() {
        return publucationdate;
    }

    BisnesObjectNews()
    {

    }
    public BisnesObjectNews(String author, String title, String message, Date publucationdate)
    {
        this.author=author;
        this.title=title;
        this.message=message;
        this.publucationdate=publucationdate;
    }
}
