package edu.javacourse.init;

public class InitField
{
    protected static String staticField;
    protected String field;

    // вызывается при загрузке класса в Java-машину
    static {
        staticField = "Static test";
        System.out.println("Static init:" + staticField);
    }

    // вызывается при создании объекта
    {
        field = "Test";
        System.out.println("Object init:" + field);
    }

    public static void main(String[] args)
    {
        InitField init1 = new InitField();
        System.out.println(init1.field);

        InitField init2 = new InitField();
        System.out.println(init2.field);

        System.out.println();

        InitFieldTwo init3 = new InitFieldTwo();
        System.out.println(init3.field);
    }
}