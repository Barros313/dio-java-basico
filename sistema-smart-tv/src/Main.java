public class Main {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();

        tv.toggleButton();
        tv.changeVolume(-20);
        tv.changeChannel(13);

        System.out.println("Is the TV turned on? " + tv.isTurnedOn);
        System.out.println("Current channel: " + tv.channel);
        System.out.println("Current volume: " + tv.volume);
    }
}