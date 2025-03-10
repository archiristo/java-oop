public class MainRadio {
    public static void main(String[] args) {
        Radio radio1 = new Radio();
        Radio radio2 = new Radio();
        Radio radio3 = new Radio();
        Radio radio4 = new Radio();
        Radio radio5 = new Radio();
        System.out.println("Radio1, current frequency: " + radio1.getFrequency());
        System.out.println("Radio2, current frequency: " + radio2.getFrequency());
        System.out.println("Radio3, current frequency: " + radio3.getFrequency());
        System.out.println("Radio4, current frequency: " + radio4.getFrequency());
        System.out.println("Radio5, current frequency: " + radio5.getFrequency());
        radio1.setFrequency(107.5);
        radio2.setFrequency(93.8);
        radio3.setFrequency(87.6);
        radio4.setFrequency(85.2);
        radio5.setFrequency(109.4);
        System.out.println("Radio1, updated frequency: " + radio1.getFrequency());
        System.out.println("Radio2, updated frequency: " + radio2.getFrequency());
        System.out.println("Radio3, updated frequency: " + radio3.getFrequency());
        System.out.println("Radio4, updated frequency: " + radio4.getFrequency());
        System.out.println("Radio5, updated frequency: " + radio5.getFrequency());
        radio1.channelDown();
        radio2.channelUp();
        radio3.channelDown();
        radio4.channelUp();
        radio5.channelDown();
        System.out.println("Radio1, updated frequency: " + radio1.getFrequency());
        System.out.println("Radio2, updated frequency: " + radio2.getFrequency());
        System.out.println("Radio3, updated frequency: " + radio3.getFrequency());
        System.out.println("Radio4, updated frequency: " + radio4.getFrequency());
        System.out.println("Radio5, updated frequency: " + radio5.getFrequency());



    }
}
