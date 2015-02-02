package cn.com.itjh.itjh_android.model;

/**
 * Created by Hu on 2015/2/2 0002.
 * 文章实体类
 */
public class Article {

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public Integer aid;//文章id
    public String title;//文章名称
    public String date;//文章发布时间
    public String img;//文章特色图片
    public String author;//作者
    public String author_id;//作者id

    @Override
    public String toString() {
        return "Article{" +
                "aid=" + aid +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", img='" + img + '\'' +
                ", author='" + author + '\'' +
                ", author_id='" + author_id + '\'' +
                '}';
    }

    public Article(Integer aid, String title, String date, String img, String author, String author_id) {
        this.aid = aid;
        this.title = title;
        this.date = date;
        this.img = img;
        this.author = author;
        this.author_id = author_id;
    }

    public Article() {
        super();
    }
}
