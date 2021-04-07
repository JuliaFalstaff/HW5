public class Notes {
    private long id;
    private String title;
    private String content;

    public Notes(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public NotesMemento createMemento()
    {
        NotesMemento m = new NotesMemento(id, title, content);
        return m;
    }

    public void restore(NotesMemento m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.content = m.getContent();
    }

    @Override
    public String toString() {
        return "Notes [id=" + id + ", title=" + title + ", content=" + content + "]";
    }


}
