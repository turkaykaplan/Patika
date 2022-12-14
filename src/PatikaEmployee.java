public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public static void main(String[] args) {

        Employee calisan = new Employee("kemal", 2000, 45, 1985);
        System.out.println(calisan);
    }

    public double tax() {
        if (this.salary > 1000) return (this.salary * 3) / 100;
        else return 0;
    }

    public double bonus() {
        if (workHours > 40) return (workHours - 40) * 30;
        else return 0;
    }

    public double raiseSalary() {
        int time = (2021 - this.hireYear);
        if (time > 19) return this.salary * 0.15;
        else if (time > 9 && 20 > time) return this.salary * 0.10;
        else if (time < 10) return this.salary * 0.05;
        else return 0;
    }

    public String toString() {

        System.out.println("Çalışanın Adı: " + this.name);
        System.out.println("Çalışanın Maaşı: " + this.salary + " TL");
        System.out.println("Haftalık Çalışma Saati: " + this.workHours + " Saat");
        System.out.println("İşe Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax() + " TL");
        System.out.println("Bonus: " + bonus() + " TL");
        System.out.println("Yıla Göre Maaşın Artışı: " + raiseSalary() + " TL");
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " + (this.salary + bonus() - tax()) + " TL");
        System.out.println("Toplam Maaş: " + (this.salary + raiseSalary()) + " TL");

        return ("\nSonuçlar Yukarıda Gösterilmiştir.");
    }
}




/*
- www.patika.dev

--Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

Sınıfın Nitelikleri

name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
Sınıfın Metotları

Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.
*/
