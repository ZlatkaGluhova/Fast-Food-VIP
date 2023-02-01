package objectAndClasses;

public class Music {
   private String category;
   private String name;
   private String minutes;

    public Music() {
    }

    public Music(String category, String name, String minutes) {
        this.category = category;
        this.name = name;
        this.minutes = minutes;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "Music{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", minutes='" + minutes + '\'' +
                '}';
    }
}
