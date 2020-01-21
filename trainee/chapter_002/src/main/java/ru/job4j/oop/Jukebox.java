package ru.job4j.oop;

public class Jukebox {
    public void music(int position){
        if(position == 1){
            System.out.println("Пусть бегут неуклюже");
        }else if(position == 2){
            System.out.println("Bouna notte");
        }else{
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        Jukebox musicbox = new Jukebox();
        int song =31;
        musicbox.music(song);
    }
}
