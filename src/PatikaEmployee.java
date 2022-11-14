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