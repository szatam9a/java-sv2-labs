package searching;

import java.time.LocalDateTime;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty> {
    private String name;
    private String description;
    private LocalDateTime findDate;

    public LostProperty(String description) {
        this.description = description;
    }

    public LostProperty(String name, String description, LocalDateTime findDate) {
        this.name = name;
        this.description = description;
        this.findDate = findDate;
    }

    @Override
    public int compareTo(LostProperty o) {
        if (this.description.equals(o.description)) {
            return this.findDate.compareTo(o.findDate);
        }
        return this.description.compareTo(o.description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LostProperty)) return false;
        LostProperty that = (LostProperty) o;
        return description.equals(that.description) && findDate.equals(that.findDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, findDate);
    }
}
