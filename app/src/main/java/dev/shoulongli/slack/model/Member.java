package dev.shoulongli.slack.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by shoulongli on 7/12/16.
 */

public class Member {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("team_id")
    @Expose
    private String teamId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("deleted")
    @Expose
    private Boolean deleted;
    @SerializedName("status")
    @Expose
    private Object status;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("real_name")
    @Expose
    private String realName;
    @SerializedName("tz")
    @Expose
    private Object tz;
    @SerializedName("tz_label")
    @Expose
    private String tzLabel;
    @SerializedName("tz_offset")
    @Expose
    private Integer tzOffset;
    @SerializedName("profile")
    @Expose
    private Profile profile;
    @SerializedName("is_admin")
    @Expose
    private Boolean isAdmin;
    @SerializedName("is_owner")
    @Expose
    private Boolean isOwner;
    @SerializedName("is_primary_owner")
    @Expose
    private Boolean isPrimaryOwner;
    @SerializedName("is_restricted")
    @Expose
    private Boolean isRestricted;
    @SerializedName("is_ultra_restricted")
    @Expose
    private Boolean isUltraRestricted;
    @SerializedName("is_bot")
    @Expose
    private Boolean isBot;
    @SerializedName("has_2fa")
    @Expose
    private Boolean has2fa;

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The teamId
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * @param teamId The team_id
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * @param deleted The deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * @return The status
     */
    public Object getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(Object status) {
        this.status = status;
    }

    /**
     * @return The color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color The color
     */
    public void setColor(String color) {
        this.color = color;
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
     * @return The tz
     */
    public Object getTz() {
        return tz;
    }

    /**
     * @param tz The tz
     */
    public void setTz(Object tz) {
        this.tz = tz;
    }

    /**
     * @return The tzLabel
     */
    public String getTzLabel() {
        return tzLabel;
    }

    /**
     * @param tzLabel The tz_label
     */
    public void setTzLabel(String tzLabel) {
        this.tzLabel = tzLabel;
    }

    /**
     * @return The tzOffset
     */
    public Integer getTzOffset() {
        return tzOffset;
    }

    /**
     * @param tzOffset The tz_offset
     */
    public void setTzOffset(Integer tzOffset) {
        this.tzOffset = tzOffset;
    }

    /**
     * @return The profile
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     * @param profile The profile
     */
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    /**
     * @return The isAdmin
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * @param isAdmin The is_admin
     */
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * @return The isOwner
     */
    public Boolean getIsOwner() {
        return isOwner;
    }

    /**
     * @param isOwner The is_owner
     */
    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    /**
     * @return The isPrimaryOwner
     */
    public Boolean getIsPrimaryOwner() {
        return isPrimaryOwner;
    }

    /**
     * @param isPrimaryOwner The is_primary_owner
     */
    public void setIsPrimaryOwner(Boolean isPrimaryOwner) {
        this.isPrimaryOwner = isPrimaryOwner;
    }

    /**
     * @return The isRestricted
     */
    public Boolean getIsRestricted() {
        return isRestricted;
    }

    /**
     * @param isRestricted The is_restricted
     */
    public void setIsRestricted(Boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    /**
     * @return The isUltraRestricted
     */
    public Boolean getIsUltraRestricted() {
        return isUltraRestricted;
    }

    /**
     * @param isUltraRestricted The is_ultra_restricted
     */
    public void setIsUltraRestricted(Boolean isUltraRestricted) {
        this.isUltraRestricted = isUltraRestricted;
    }

    /**
     * @return The isBot
     */
    public Boolean getIsBot() {
        return isBot;
    }

    /**
     * @param isBot The is_bot
     */
    public void setIsBot(Boolean isBot) {
        this.isBot = isBot;
    }

    /**
     * @return The has2fa
     */
    public Boolean getHas2fa() {
        return has2fa;
    }

    /**
     * @param has2fa The has_2fa
     */
    public void setHas2fa(Boolean has2fa) {
        this.has2fa = has2fa;
    }

}
