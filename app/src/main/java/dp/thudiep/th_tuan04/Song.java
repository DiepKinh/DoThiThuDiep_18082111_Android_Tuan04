package dp.thudiep.th_tuan04;

import java.io.Serializable;

public class Song implements Serializable {
    private String title;
    private String single;
    private int imageSong, imgHeart,imgMenu;
    private int resourece;

    public Song(String title, String single, int imageSong, int imgHeart, int imgMenu, int resourece) {
        this.title = title;
        this.single = single;
        this.imageSong = imageSong;
        this.imgHeart = imgHeart;
        this.imgMenu = imgMenu;
        this.resourece = resourece;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public int getImageSong() {
        return imageSong;
    }

    public void setImageSong(int imageSong) {
        this.imageSong = imageSong;
    }

    public int getImgHeart() {
        return imgHeart;
    }

    public void setImgHeart(int imgHeart) {
        this.imgHeart = imgHeart;
    }

    public int getImgMenu() {
        return imgMenu;
    }

    public void setImgMenu(int imgMenu) {
        this.imgMenu = imgMenu;
    }

    public int getResourece() {
        return resourece;
    }

    public void setResourece(int resourece) {
        this.resourece = resourece;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", single='" + single + '\'' +
                ", imageSong=" + imageSong +
                ", imgHeart=" + imgHeart +
                ", imgMenu=" + imgMenu +
                ", resourece=" + resourece +
                '}';
    }
}
