class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 50);
        System.out.println(tv);

        tv.mute();                  //mute
        System.out.println(tv);

        tv.mute();                 //unmute
        System.out.println(tv);

        tv.mute();                 //mute
        System.out.println(tv);

        tv.setVolume(32);       //set volume to 32.
        System.out.println(tv);
    }
}