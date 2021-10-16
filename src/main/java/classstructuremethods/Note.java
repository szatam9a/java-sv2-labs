package classstructuremethods;

public class Note {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private String topic;
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }

    private String text;
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    public String getNoteText(){
        String note;
        note = name + ":(" + topic + ") " + text;
        return note;

    }
}
