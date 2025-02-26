public class TV {
    int channel = 1;
    int volume = 1;
    boolean isTvOn = false;
    String status = "off";

    public TV(){}

    public void turnOnTV(){
        isTvOn = true;
    }
    public void turnOffTV(){
        isTvOn = false;
    }
    public void setChannel(int newChannel){
        if(isTvOn && newChannel >= 1 && newChannel <= 100) {
            channel = newChannel;
        }
    }
    public void setVolume(int newVolume){
        if(isTvOn && newVolume >= 0 && newVolume <= 10){
            volume = newVolume;
        }
    }
    public void channelUp(){
        if(isTvOn && channel < 100){
            channel++;
        } else if (channel == 100) {
            channel = 1;
        }
    }
    public void channelDown(){
        if(isTvOn && channel > 1){
            channel--;
        } else if (channel == 1) {
            channel = 100;
        }
    }
    public void volumeUp(){
        if (isTvOn && volume < 10){
            volume++;
        }
    }
    public void volumeDown(){
        if (isTvOn && volume > 1){
            volume--;
        }
    }

    public void stat(String newStatus){
        status = newStatus;
        if (isTvOn){
            newStatus = "on";
        }
        else{
            newStatus = "off";
        }
    }

}
