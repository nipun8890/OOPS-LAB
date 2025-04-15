package Experiment7;

public class playable {

}

interface Playable {
 void play();
 void pause();
 void stop();
}


class MusicPlayer implements Playable {
 @Override
 public void play() {
     System.out.println("Music is playing");
 }

 @Override
 public void pause() {
     System.out.println("Music is paused");
 }

 @Override
 public void stop() {
     System.out.println("Music is stopped");
 }

 public static void main(String[] args) {
     MusicPlayer myPlayer = new MusicPlayer();
     
     myPlayer.play();  // Test play method
     myPlayer.pause(); // Test pause method
     myPlayer.stop();  // Test stop method
 }
}