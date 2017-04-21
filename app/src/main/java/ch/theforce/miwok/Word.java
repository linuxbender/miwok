package ch.theforce.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private final String miwokTranslation;
    private final String defaultTranslation;
    private final int imageResourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = NO_IMAGE_PROVIDED;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = imageResourceId;
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

    public boolean hasImage() {
        return this.getImageResourceId() != NO_IMAGE_PROVIDED;
    }
}
