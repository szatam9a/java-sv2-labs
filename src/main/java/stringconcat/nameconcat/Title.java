package stringconcat.nameconcat;

public enum Title {
    MR("Mr."),MRS ("Mrs."),Ms ("Ms."),Dr ("Dr.");

    private String title;

    Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
