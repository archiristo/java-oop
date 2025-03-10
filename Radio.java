public class Radio {
    private double frequency = 92.0;

    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(double newFrequency) {
        this.frequency = newFrequency;
    }
    public void channelUp(){
        if(frequency >= 85.0 && frequency <= 110.0){
            frequency += Math.round((Math.random()+0.5)*10)/10.0;
        }
        else{
            System.out.println("Invalid frequency");
        }
    }
    public void channelDown(){
        if(frequency >= 85.0 && frequency <= 110.0){
            frequency -= Math.round((Math.random()+0.5)*10)/10.0;
        }
        else{
            System.out.println("Invalid frequency");
        }
    }
}