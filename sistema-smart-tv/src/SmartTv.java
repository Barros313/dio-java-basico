public class SmartTv {
    boolean isTurnedOn = false;
    int channel = 1;
    int volume = 25;

    public void toggleButton() {
        isTurnedOn = !isTurnedOn;
    }

    public void changeVolume(int level) {
        volume += level;
    }
}
