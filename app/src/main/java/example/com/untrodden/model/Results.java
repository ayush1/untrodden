package example.com.untrodden.model;

import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by ayushgarg on 02/08/17.
 */

public class Results implements Serializable {

    private String wrapperType;
    private String kind;
    private String artistId;
    private String collectionId;
    private String trackId;
    private String artistName;
    private String collectionName;
    private String trackName;
    private String collectionCensoredName;
    private String trackCensoredName;
    private String artistViewUrl;
    private String collectionViewUrl;
    private String trackViewUrl;
    private String previewUrl;
    private String artworkUrl30;
    private String artworkUrl60;
    private String artworkUrl100;
    private float collectionPrice;
    private float trackPrice;
    private String collectionExplicitness;
    private String releaseDate;
    private String trackExplicitness;
    private int discCount;
    private int discNumber;
    private int trackCount;
    private int trackNumber;
    private long trackTimeMillis;
    private String country;
    private String currency;
    private String primaryGenreName;
    private boolean isStreamable;


    public String getWrapperType() {
        return wrapperType;
    }

    public Results setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public Results setKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getArtistId() {
        return artistId;
    }

    public Results setArtistId(String artistId) {
        this.artistId = artistId;
        return this;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public Results setCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    public String getTrackId() {
        return trackId;
    }

    public Results setTrackId(String trackId) {
        this.trackId = trackId;
        return this;
    }

    public String getArtistName() {
        return artistName;
    }

    public Results setArtistName(String artistName) {
        this.artistName = artistName;
        return this;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public Results setCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    public String getTrackName() {
        return trackName;
    }

    public Results setTrackName(String trackName) {
        this.trackName = trackName;
        return this;
    }

    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    public Results setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
        return this;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public Results setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
        return this;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public Results setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
        return this;
    }

    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    public Results setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
        return this;
    }

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public Results setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
        return this;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public Results setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    public Results setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
        return this;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public Results setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
        return this;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public Results setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
        return this;
    }

    public float getCollectionPrice() {
        return collectionPrice;
    }

    public Results setCollectionPrice(float collectionPrice) {
        this.collectionPrice = collectionPrice;
        return this;
    }

    public float getTrackPrice() {
        return trackPrice;
    }

    public Results setTrackPrice(float trackPrice) {
        this.trackPrice = trackPrice;
        return this;
    }

    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    public Results setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public Results setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    public Results setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
        return this;
    }

    public int getDiscCount() {
        return discCount;
    }

    public Results setDiscCount(int discCount) {
        this.discCount = discCount;
        return this;
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public Results setDiscNumber(int discNumber) {
        this.discNumber = discNumber;
        return this;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public Results setTrackCount(int trackCount) {
        this.trackCount = trackCount;
        return this;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public Results setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
        return this;
    }

    public long getTrackTimeMillis() {
        return trackTimeMillis;
    }

    public Results setTrackTimeMillis(long trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Results setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public Results setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public Results setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
        return this;
    }

    public boolean isStreamable() {
        return isStreamable;
    }

    public Results setStreamable(boolean streamable) {
        isStreamable = streamable;
        return this;
    }
}
