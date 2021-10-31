package enumtype.university;

public enum University {
    ELTE("Eötvös Loránd Tudományegyetem"),BME("BUDAPESTI MŰSZAKI ÉS GAZDASÁGTUDOMÁNYI EGYETEM"),OE("Óbudai Egyetem");
    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
