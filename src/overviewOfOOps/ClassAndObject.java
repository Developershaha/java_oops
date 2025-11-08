package overviewOfOOps;

 class Website {

    String website;
    int age;

    public Website(String website,int age){

        this.website=website;
        this.age=age;
    }
    public void displayWebsiteData(){
        System.out.println("website is"+website +"and age is "+age);
    }

}

public class ClassAndObject {

    // object is something that have state and behaviour

    // state can be represented as variable and behaviour means method -- we will see with the example


    // class is a blueprint of an object with the help of class we can create many object
    public static void main(String[] args) {

        Website website1=new Website("google",26);
        Website website2=new Website("microsoft",45);

        website1.displayWebsiteData();
        website2.displayWebsiteData();

    }

}
