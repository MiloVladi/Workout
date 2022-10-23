public class PushUp extends BasicWorkout{
    int repetitions;

    public PushUp(Date date, int duration, int repetitions) {
        super(date, duration);
        this.repetitions = repetitions;
        this.intensity = getIntensity();
        this.energy = getEnergy();
        this.description = "Push Up :" + repetitions + " repetitions";

    }
    @Override
    public int getIntensity(){
        return repetitions/duration;
    }
    @Override
    public int getEnergy(){
        return repetitions*5;
    }

    @Override
    public String toString() {
        return String.format("%s: %s \"%s\" %.1fh, %dkcal ",
                date, getIntensityString(), getDescription(), duration/3600., getEnergy());
    }
}
