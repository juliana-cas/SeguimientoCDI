package service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import service.ThreadService;
@ApplicationScoped
public class ThreadServiceImpl implements ThreadService {

    @Override
    public void waiting() {
        System.out.println("Getting Data...");
        slowTime(4000);
        System.out.println("Data Ready");
    }
    public void slowTime(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
