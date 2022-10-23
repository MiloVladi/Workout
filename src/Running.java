public class Running extends BasicWorkout{
    int distance;

    public Running(Date date, int duration, String description, int distance) {
        super(date, duration, description);
        this.distance = distance;
        this.intensity = getIntensity();
        this.energy = getEnergy();
    }
    @Override
    public int getIntensity(){
        return distance/duration;
    }
    @Override
    public int getEnergy(){
        return distance*duration;
    }
    @Override
    public String toString() {
        return String.format("%s: %s \"%s\" %.1fh, %dkcal, %.1fkm",
                date, getIntensityString(), getDescription(), duration/3600., getEnergy(), distance/1000.);
    }
}
