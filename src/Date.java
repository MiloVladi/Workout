public class Date implements Comparable<Date>{
    int y;
    int m;
    int d;


    public int getYear() {
        return y;
    }

    public int getMonth() {
        return m;
    }

    public int getDay() {
        return d;
    }

    public Date(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public Date(Date Date) {
        this.y = Date.y;
        this.m = Date.m;
        this.d = Date.d;
    }

    public Date() {
    }
    @Override
    public String toString() {
        return String.format("%02d.%02d.%4d", d,m,y);
    }

    @Override
    public int compareTo(Date other) {
        if(this.y == other.y) {
            if (this.m == other.m) {
                return Integer.compare(this.d, other.d);
            }
            return Integer.compare(this.m, other.m);
        }
        return Integer.compare(this.y,other.y);
    }
}

