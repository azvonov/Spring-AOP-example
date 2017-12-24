package root.concert;

import org.springframework.stereotype.Component;

@Component
public class Opera implements Performance {

    public void perform() {
        System.out.println("Opera performing..");
    }
}
