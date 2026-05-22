package CoreJava.Interface;

public class Amazon {
    // loose couple achive oky and create object that

    // field injection oky

    private Service service;
    public Amazon(Service service){
        this.service=service;
    }

    public void setService(Service service) {
        this.service = service;
    }
    public void deliver() {
        service.display();
    }

}
