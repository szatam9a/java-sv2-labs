package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Péter");
        note.setTopic("mai nap");
        note.setText("ma szombat van.");
        System.out.println(note.getNoteText());
    }
}
