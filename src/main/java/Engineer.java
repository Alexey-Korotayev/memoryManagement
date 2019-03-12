import java.util.ArrayList;
import java.util.List;

public class Engineer implements Worker {

    private String name;
    private int age;
    private String project;
    private List<String> skills = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public boolean addSkill(String skill) {
        if ( skills.indexOf(skill) > -1 ) {
            return false;
        }
        skills.add(skill);
        return true;
    }

}
