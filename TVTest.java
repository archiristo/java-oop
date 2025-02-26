public class TVTest {
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOnTV();
        tv1.setChannel(45);
        tv1.setVolume(5);

        TV tv2 = new TV();
        tv2.turnOnTV();
        tv2.channelUp();
        tv2.volumeUp();

        TV tv3 = new TV();
        tv3.turnOffTV();

        TV tv4 = new TV();
        tv4.turnOnTV();
        tv4.channelDown();
        tv4.setVolume(8);
        tv4.volumeDown();

        System.out.println("tv1, channel: " + tv1.channel + " volume: " + tv1.volume + " TV status: " + tv1.status);
        System.out.println("tv2, channel: " + tv2.channel + " volume: " + tv2.volume + " TV status: " + tv2.status);
        System.out.println("tv3, channel: " + tv3.channel + " volume: " + tv3.volume + " TV status: " + tv3.status);
        System.out.println("tv4, channel: " + tv4.channel + " volume: " + tv4.volume + " TV status: " + tv4.status);
    }
}
