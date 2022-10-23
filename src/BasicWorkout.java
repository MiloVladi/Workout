public class BasicWorkout implements Comparable<BasicWorkout>{
    Date date;
    int duration;
    int intensity;
    int energy;
    String description;

    public BasicWorkout() {

    }

    public int getDuration() {
        return duration;
    }

    public int getIntensity() {
        return intensity;
    }

    public int getEnergy() {
        return energy;
    }

    public String getDescription() {
        return description;
    }
    public String getIntensityString(){
        return Integer.toString(intensity);
    }

    public BasicWorkout(BasicWorkout BasicWorkout) {
        this.date = BasicWorkout.date;
        this.duration = BasicWorkout.duration;
        this.intensity = BasicWorkout.intensity;
        this.energy = BasicWorkout.energy;
        this.description = BasicWorkout.description;
    }

    public BasicWorkout(Date date, int duration) {
        this.date = date;
        this.duration = duration;
    }

    public BasicWorkout(Date date, int duration, int intensity) {
        this.date = date;
        this.duration = duration;
        this.intensity = intensity;
    }

    public BasicWorkout(Date date, int duration, int intensity, int energy) {
        this.date = date;
        this.duration = duration;
        this.intensity = intensity;
        this.energy = energy;
    }


    public BasicWorkout(Date date, int duration, int intensity, int energy, String description) {
        this.date = date;
        this.duration = duration;
        this.intensity = intensity;
        this.energy = energy;
        this.description = (description == null) ? null : String.format("%.100s", description);
    }

    public BasicWorkout(Date date, int duration, String description) {
        this.date = date;
        this.duration = duration;
        this.description = (description == null) ? null : String.format("%.100s", description);
    }

    @Override
        public String toString() {
            return String.format("%s: %s \"%s\" %.1fh, %dkcal ",
                    date, getIntensityString(), getDescription(), duration/3600., getEnergy());

    }

    @Override
    public int compareTo(BasicWorkout other) {
        return this.date.compareTo(other.date);
    }
}
