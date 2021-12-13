package DO;

import java.util.Date;

public class NewsDo {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

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

    public NewsDo(int id, String author, String title, String message, Date publucationdate)
    {
        this.author=author;
        this.id=id;
        this.message=message;
        this.title=title;
        this.publucationdate=publucationdate;
    }
}
