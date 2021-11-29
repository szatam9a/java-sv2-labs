package methodstructure.bmi;

public class BodyMass {
    public double height;
    public double weight;

    public double getBodyMassIndex() {
        return weight / (height * height);
    }

    public BmiCategory getBody() {
        double bmi = getBodyMassIndex();

        if (bmi > 25) {
            return BmiCategory.OVERWEIGHT;
        } else if (bmi < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        } else
            return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan(BodyMass other) {
        if (this.getBodyMassIndex() < other.getBodyMassIndex()) {
            return true;
        } else return false;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

   }
