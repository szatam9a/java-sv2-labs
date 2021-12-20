package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {
    static PrimarySchoolChild of(int age) {
        if (age < 11 && age > 6) {
            return new LowerClassSchoolChild(age);
        } else if (age < 14 && age > 11) {
            return new UpperClassSchoolChild(age);
        } else throw new IllegalArgumentException("age does not fit");
    }
}
