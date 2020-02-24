package ac.elevation.spotchecks.oop1;

/**
 * @author Yogev Lidor
 * @date 24/02/2020
 */
public class SpotCheck2 {

    public class Bicycle {

        private String color;
        private WheelSize wheelSize;
        private int currentGear;

        public int getCurrentGear() {
            return currentGear;
        }

        public void shiftGears(int newGear) {
            if (newGear > 0 && newGear <= 21) {
                currentGear = newGear;
            }
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public WheelSize getWheelSize() {
            return wheelSize;
        }

        public void setWheelSize(WheelSize wheelSize) {
            this.wheelSize = wheelSize;
        }
    }


    public enum WheelSize {
        TWENTY_FOUR,
        TWENTY_SIX,
        TWENTY_NINE;
    }
}
