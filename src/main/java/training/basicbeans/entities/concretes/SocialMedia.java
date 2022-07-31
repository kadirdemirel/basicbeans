package training.basicbeans.entities.concretes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SocialMedia {

    @Value("Facebook")
    private String name;
    @Value("California")
    private String headQuarter;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHeadQuarter() {
        return headQuarter;
    }
    public void setHeadQuarter(String headQuarter) {
        this.headQuarter = headQuarter;
    }
    public void show() {
        System.out.println("Name is :"+name+"\n HQ at : "+headQuarter);
    }
}
