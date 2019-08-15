package hu.flowacademy.singleton;

public class Connector {

    // static variable single_instance of type Singleton
    private static Connector single_instance = null;

    // variable of type String
    public String s;

    // private constructor restricted to this class itself
    private Connector()
    {
        s = "Hello I am a string part of Singleton class";
    }

    // static method to create instance of Singleton class
    public static Connector getInstance()
    {
        if (single_instance == null)
            single_instance = new Connector();

        return single_instance;
    }
}
