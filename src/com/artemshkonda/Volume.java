package com.artemshkonda;

public class Volume {
    int volume;
    public int Volume (){
        volume = 0;
        return volume;
    }

    public int Volume (int width, int length, int height ){
        volume = width*length*height;
        return volume;
    }

    public int Volume (int width){
        volume = width*width;
        return volume;
    }
}
