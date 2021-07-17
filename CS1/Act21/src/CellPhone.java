public class CellPhone implements Rechargeable {
    private int chargeLevel;
    private int volume;

    public CellPhone(int chargeLevel, int volume) {
        this.chargeLevel = chargeLevel;
        this.volume = volume;
    }

    public int getCharge() {
        return chargeLevel;
    }

    public void recharge() {
        chargeLevel = MAX_CHARGE;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void makeCall() {
        System.out.println("Ring... Hello?");
    }
}
