public class Pilot {
    private String id;
    private String name;
    private String experienceLevel;

    public Pilot(String id, String name, String experienceLevel) {
        this.id = id;
        this.name = name;
        this.experienceLevel = experienceLevel;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getExperienceLevel() { return experienceLevel; }
}
