package com.geekykel;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance("test");
        Singleton s2 = Singleton.getInstance("test");
        Singleton s3 = Singleton.getInstance("test");

        System.out.println(s1 == s2); // true because s1 and s2 refer the same object
        System.out.println(s2 == s3); // true because s2 and s3 refer the same object

        System.out.println(A.getInstance("foo").getS());
        System.out.println(A.getInstance("bar").getS());
        System.out.println(A.getNewInstance("foo").getS());
        System.out.println(A.getNewInstance("bar").getS());
        A instance = A.getInstance("thx");
        System.out.println(instance.getS());

        Singleton instance1 = Singleton.getInstance("data1");
        Singleton instance2 = Singleton.getInstance("data2");

        instance1.printData();
        instance2.printData();

        Singleton instance3 = Singleton.getInstance("data3");
        instance3.data = "data4";

        instance3.printData();

        // ====================================

        AppController controller = AppController.getInstance();
        controller.config.timeout = 2000;

        AppController anotherOne = AppController.getInstance();
        controller.config = new AppConfig(anotherOne.config.timeout + 100, "https://hyperskill.org/topics/knowledge-graph");

        System.out.println(anotherOne.config.timeout + " " + controller.config.serviceUrl);

    }

    // There are a lot of Singleton examples in the Java Class Library:
//    java.lang.Runtime#getRuntime()
//    java.awt.Desktop#getDesktop()
//    java.lang.System#getSecurityManager()
}
