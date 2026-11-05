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
        MediaAudio media1 = new Lagu("Membasuh", "Hindia");
        MediaAudio media2 = new Podcast("Close the Door", "Deddy Corbuzier");

        media1.putarAudio();
        media2.putarAudio();
    }
}