
abstract class MediaAudio {
    protected String judul;

    public MediaAudio(String judul) {
        this.judul = judul;
    }

    public abstract void putarAudio();
}

class Lagu extends MediaAudio {
    private String penyanyi;

    public Lagu(String judul, String penyanyi) {
        super(judul);
        this.penyanyi = penyanyi;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar Lagu: " + judul + " - " + penyanyi);
    }
}

class Podcast extends MediaAudio {
    private String podcaster;

    public Podcast(String judul, String podcaster) {
        super(judul);
        this.podcaster = podcaster;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar Podcast: " + judul + " bersama " + podcaster);
    }
}

public class StudiKasusB {
    public static void main(String[] args) {
        MediaAudio[] playlist = new MediaAudio[2];
        playlist[0] = new Lagu("Membasuh", "Hindia");
        playlist[1] = new Podcast("Close the Door", "Deddy Corbuzier");

        for (MediaAudio media : playlist) {
            media.putarAudio();
        }
    }
}