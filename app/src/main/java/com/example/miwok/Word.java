package com.example.miwok;


/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    final int NO_IMAGE_PROVIDED = -1;

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Image ressource ID
     */
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /**
     * Audio ressource ID
     */
    private int mAudioResourceID;





    /**
     * Create a new word object
     *
     * @param defaultTranslation is the word in the language user is familiar with, English for example
     * @param miwokTranslation   is the word translation in Miwok language
     * @param imageResourceID   is the icon image ressource ID
     * @param audioResourceID    is the audio resource id
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Create a new word object
     *
     * @param defaultTranslation is the word in the language user is familiar with, English for example
     * @param miwokTranslation   is the word translation in Miwok language
     * @param audioResourceID    is the audio resource id
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
    }


    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    /**
     * Get the image ressource ID.
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * Returns whether or not the word has an image
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the audio ressource ID.
     */
    public int getAudioResourceID() {
        return mAudioResourceID;
    }


    @Override
    public String toString() {
        return "Word{" +
                "NO_IMAGE_PROVIDED=" + NO_IMAGE_PROVIDED +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
