package oop.JOOP3__ReferenceVariablesAndGarbageCollection;

import java.awt.*;

public class OOP01_ReferenceVariablesAndGarbageCollection {
    public static void main(String[] args) {
        // Reference Variable and Garbage Collection - Referans Değişkenleri ve Çöp Toplama
        /*
         * - Referans değişkenleri, bir nesneye erişmek için kullanılan değişkenlerdir.
         * - Referans değişkenleri, nesnelerin bellekteki adreslerini tutarlar.
         * - Referans değişkenleri, nesnelerin özelliklerine ve metotlarına erişmek için kullanılır.
         *
         * - Referenced variables are variables used to access an object.
         * - Reference variables hold the addresses of objects in memory.
         * - Reference variables are used to access the properties and methods of objects.
         */

        // Garbage Collection - Çöp Toplama
        /*
         * - Java'da, nesnelerin bellek yönetimi otomatik olarak yapılır.
         * - Bir nesne oluşturulduğunda, bellekte bir yer ayrılır.
         * - Nesne artık kullanılmadığında, bellekteki yerini boşaltmak için çöp toplayıcı (garbage collector) devreye girer.
         * - Çöp toplayıcı, nesneleri bellekten siler ve bellekteki boş yerleri kullanıma açar.
         *
         * - In Java, memory management of objects is done automatically.
         * - When an object is created, a space is allocated in memory.
         * - When the object is no longer used, the garbage collector comes into play to empty its place in memory.
         * - The garbage collector deletes objects and opens up empty space in memory.
         */

        // Garbage Collection Example - Çöp Toplama Örneği
        String str1 = new String("Java");
        String str2 = new String("Java");
        str1 = str2;
        str2 = null;
        System.out.println(str1);
        System.out.println(str2);

        Point p, q; // p ve q referans değişkenleri oluşturuldu.
        p = new Point(10, 20); // p referans değişkeni ile bir nesne oluşturuldu.
        System.out.println(p.toString()); // p referans değişkeni ile nesnenin toString() metodu çağrıldı.
        q = p; // q referans değişkeni p referans değişkenine eşitlendi.
        System.out.println(q.toString()); // q referans değişkeni ile nesnenin toString() metodu çağrıldı.
        q = p; // q referans değişkeni p referans değişkenine eşitlendi.
        q.x = 100; // q referans değişkeni ile nesnenin x özelliği değiştirildi.
        System.out.println(p.toString()); // p referans değişkeni ile nesnenin toString() metodu çağrıldı.

        Point r = new Point(); // r referans değişkeni ile bir nesne oluşturuldu.
        System.out.println(r.toString()); // r referans değişkeni ile nesnenin toString() metodu çağrıldı.
        r = q; // r referans değişkeni q referans değişkenine eşitlendi.
        System.out.println(r.toString()); // r referans değişkeni ile nesnenin toString() metodu çağrıldı.

        p = null; q = null; r = null; // p, q ve r referans değişkenleri null değerine eşitlendi.
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}
