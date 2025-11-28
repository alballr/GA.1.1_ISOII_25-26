package Persistance_Server;

public class ElectronicResource {
    private int resourceID;
    private String title;
    private String type;
    private String accessURL;
    private String licenseType;
    private int restrictionLevel;

    public ElectronicResource(int resourceID, String title, String type, String accessURL, String licenseType, int restrictionLevel) {
        this.resourceID = resourceID;
        this.title = title;
        this.type = type;
        this.accessURL = accessURL;
        this.licenseType = licenseType;
        this.restrictionLevel = restrictionLevel;
    }

    public boolean isLicensedFor(int userAccessLevel) {
        throw new UnsupportedOperationException();
    }

    // Getters
    public int getResourceID() { return resourceID; }
    public String getTitle() { return title; }
    public String getType() { return type; }
    public String getAccessURL() { return accessURL; }
    public String getLicenseType() { return licenseType; }
    public int getRestrictionLevel() { return restrictionLevel; }
}
