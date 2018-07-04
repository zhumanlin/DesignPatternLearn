package pattern.adapterPattern;

public class MediaAdapter implements MediaPlayer {
//    AdvancedMediaPlayer advancedMusicPlayer;
//
//    public MediaAdapter(String audioType){
//        if(audioType.equalsIgnoreCase("vlc") ){
//            advancedMusicPlayer = new VlcPlayer();
//        } else if (audioType.equalsIgnoreCase("mp4")){
//            advancedMusicPlayer = new Mp4Player();
//        }
//    }
//
//    @Override
//    public void play(String audioType, String fileName) {
//        if(audioType.equalsIgnoreCase("vlc")){
//            advancedMusicPlayer.playVlc(fileName);
//        }else if(audioType.equalsIgnoreCase("mp4")){
//            advancedMusicPlayer.playMp4(fileName);
//        }
//    }

    AdvancedMediaPlayer vlcPlayer;
    AdvancedMediaPlayer mp4Player;

    public AdvancedMediaPlayer getVlcPlayer() {
        if(vlcPlayer==null){
            vlcPlayer = new VlcPlayer();
        }
        return vlcPlayer;
    }

    public AdvancedMediaPlayer getMp4Player() {
        if (mp4Player==null){
            mp4Player = new Mp4Player();
        }
        return mp4Player;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            getVlcPlayer().playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            getMp4Player().playMp4(fileName);
        }
    }
}
