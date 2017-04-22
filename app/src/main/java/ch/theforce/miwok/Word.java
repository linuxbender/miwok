package ch.theforce.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_SOUND_PROVIDED = -1;
    private final String miwokTranslation;
    private final String defaultTranslation;
    private final int imageResourceId;
    private final int soundResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = NO_IMAGE_PROVIDED;
        this.soundResourceId = soundResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = imageResourceId;
        this.soundResourceId = soundResourceId;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getSoundResourceId() {
        return soundResourceId;
    }

    public boolean hasImage() {
        return this.getImageResourceId() != NO_IMAGE_PROVIDED;
    }

    public boolean hasSound() {
        return this.getSoundResourceId() != NO_SOUND_PROVIDED;
    }
}
