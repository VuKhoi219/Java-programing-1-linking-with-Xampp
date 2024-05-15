public class PostList {
    private long id;
    private String articleTitle;
    private String describe;
    private String avatar;
    private String writer;
    private String dateofwriting;
    public PostList(long id, String articleTitle, String describe, String avatar, String writer, String dateofwriting) {
        this.id = id;
        this.articleTitle = articleTitle;
        this.describe = describe;
        this.avatar = avatar;
        this.writer = writer;
        this.dateofwriting = dateofwriting;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDateofwriting() {
        return dateofwriting;
    }

    public void setDateofwriting(String dateofwriting) {
        this.dateofwriting = dateofwriting;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
