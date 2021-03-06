package inheritanceconstructor.classroom;

public class ClassRoom extends Room {
    private Facility facility;

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    public boolean isSuitable(Course course) {
        if (this.facility.equals(course.getFacilityNeeded())&& this.getCapacity() >= course.getParticipants()) {
            return true;
        } else return false;
    }

    public Facility getFacility() {
        return facility;
    }
}
