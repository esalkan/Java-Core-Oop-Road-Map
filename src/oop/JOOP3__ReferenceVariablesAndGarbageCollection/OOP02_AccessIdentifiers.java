package oop.JOOP3__ReferenceVariablesAndGarbageCollection;

public class OOP02_AccessIdentifiers {

    public static void main(String[] args) {
        // Access Identifiers - Erişim Belirleyiciler
        /*
            * - Erişim belirleyiciler, nesnelerin özelliklerine ve metotlarına erişim izni verir.
            * - Access identifiers give access to the properties and methods of objects.
            *
            * package p1;
            *   // A sınıfı p1 paketi içinde
            *   public class A {
            *       private int x;
            *       int y;
            *       public int z;
            *       ...
            *   }
            *
            * package p1;
            *   // B sınıfı da p1 paketi içinde
            *   class B {
            *       ...
            *   }
            *
            * package p2;
            *   // C sınıfı p2 paketi içinde
            *   public class C {
            *     ...
            *   }
            *
            * A sınıfının kendisi, tüm A, B ve C sınıflarının içinden;
            * A sınıfının x özniteliği, yalnızca A sınıfının içinden;
            * A sınıfının y özniteliği, yalnızca A ve B sınıflarının içinden;
            * A sınıfının z özniteliği, tüm A, B ve C sınıflarının içinden;
            * B sınıfının kendisi, yalnızca A ve B sınıflarının içinden;
            * C sınıfının kendisi, tüm A, B ve C sınıflarının içinden
         */


        // Access Identifier - Erişim Belirleyici

        // public - Her yerden erişilebilir.
        //        - Everywhere can be accessed.

        // private - Sadece tanımlandığı sınıf içerisinden erişilebilir.
        //         - Can only be accessed from the class in which it is defined.

        // protected - Sadece tanımlandığı paket içerisinden ve tanımlandığı sınıfın alt sınıflarından erişilebilir.
        //           - Can only be accessed from the package in which it is defined and from the subclasses of the class in which it is defined.

        // default - Sadece tanımlandığı paket içerisinden erişilebilir.
        //         - Can only be accessed from the package in which it is defined.

        // Access Identifier Example - Erişim Belirleyici Örneği
        OOP02_AccessIdentifiers obj = new OOP02_AccessIdentifiers();
        obj.publicMethod(); // public metot çağrıldı.
        obj.privateMethod(); // private metot çağrıldı.
        obj.protectedMethod(); // protected metot çağrıldı.
        obj.defaultMethod(); // default metot çağrıldı.

    }

    // public access identifier - public erişim belirleyici
    public void publicMethod() {
        System.out.println("public method");
    }

    // private access identifier - private erişim belirleyici
    private void privateMethod() {
        System.out.println("private method");
    }

    // protected access identifier - protected erişim belirleyici
    protected void protectedMethod() {
        System.out.println("protected method");
    }

    // default access identifier - default erişim belirleyici
    void defaultMethod() {
        System.out.println("default method");
    }

}
