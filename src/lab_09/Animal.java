package lab_09;

public class Animal {

    public String name;
    public boolean withWings;
    public int speed;

    protected Animal(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.withWings = builder.withWings;
    }

    public String getName() {
        return name;
    }

    public boolean isWithWings() {
        return withWings;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", withWings=" + withWings +
                ", speed=" + speed +
                '}';
    }

    public static class Builder {
        public String name;
        public boolean withWings;
        public int speed;

        //WRITE-ONLY

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setWithWings(boolean withWings) {
            this.withWings = withWings;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}