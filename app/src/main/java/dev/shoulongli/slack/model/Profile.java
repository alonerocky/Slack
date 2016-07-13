package dev.shoulongli.slack.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by shoulongli on 7/12/16.
 */

public class Profile {

    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("image_24")
    @Expose
    private String image24;
    @SerializedName("image_32")
    @Expose
    private String image32;
    @SerializedName("image_48")
    @Expose
    private String image48;
    @SerializedName("image_72")
    @Expose
    private String image72;
    @SerializedName("image_192")
    @Expose
    private String image192;
    @SerializedName("image_512")
    @Expose
    private String image512;
    @SerializedName("avatar_hash")
    @Expose
    private String avatarHash;
    @SerializedName("real_name")
    @Expose
    private String realName;
    @SerializedName("real_name_normalized")
    @Expose
    private String realNameNormalized;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("fields")
    @Expose
    private Object fields;

    /**
     * @return The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return The image24
     */
    public String getImage24() {
        return image24;
    }

    /**
     * @param image24 The image_24
     */
    public void setImage24(String image24) {
        this.image24 = image24;
    }

    /**
     * @return The image32
     */
    public String getImage32() {
        return image32;
    }

    /**
     * @param image32 The image_32
     */
    public void setImage32(String image32) {
        this.image32 = image32;
    }

    /**
     * @return The image48
     */
    public String getImage48() {
        return image48;
    }

    /**
     * @param image48 The image_48
     */
    public void setImage48(String image48) {
        this.image48 = image48;
    }

    /**
     * @return The image72
     */
    public String getImage72() {
        return image72;
    }

    /**
     * @param image72 The image_72
     */
    public void setImage72(String image72) {
        this.image72 = image72;
    }

    /**
     * @return The image192
     */
    public String getImage192() {
        return image192;
    }

    /**
     * @param image192 The image_192
     */
    public void setImage192(String image192) {
        this.image192 = image192;
    }

    /**
     * @return The image512
     */
    public String getImage512() {
        return image512;
    }

    /**
     * @param image512 The image_512
     */
    public void setImage512(String image512) {
        this.image512 = image512;
    }

    /**
     * @return The avatarHash
     */
    public String getAvatarHash() {
        return avatarHash;
    }

    /**
     * @param avatarHash The avatar_hash
     */
    public void setAvatarHash(String avatarHash) {
        this.avatarHash = avatarHash;
    }

    /**
     * @return The realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName The real_name
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * @return The realNameNormalized
     */
    public String getRealNameNormalized() {
        return realNameNormalized;
    }

    /**
     * @param realNameNormalized The real_name_normalized
     */
    public void setRealNameNormalized(String realNameNormalized) {
        this.realNameNormalized = realNameNormalized;
    }

    /**
     * @return The email
     */
    public Object getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(Object email) {
        this.email = email;
    }

    /**
     * @return The fields
     */
    public Object getFields() {
        return fields;
    }

    /**
     * @param fields The fields
     */
    public void setFields(Object fields) {
        this.fields = fields;
    }

}