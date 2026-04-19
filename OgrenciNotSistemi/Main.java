class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}

class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralNote;
    double oralEffect;

    public Course(String name, String code, String prefix, double oralEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.oralEffect = oralEffect;
        this.note = 0;
        this.oralNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println(this.name + " dersine öğretmen atandı: " + t.name);
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }
    
    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}

class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int matOral, int fizik, int fizikOral, int kimya, int kimyaOral) {
        if (mat >= 0 && mat <= 100) this.mat.note = mat;
        if (matOral >= 0 && matOral <= 100) this.mat.oralNote = matOral;
        
        if (fizik >= 0 && fizik <= 100) this.fizik.note = fizik;
        if (fizikOral >= 0 && fizikOral <= 100) this.fizik.oralNote = fizikOral;
        
        if (kimya >= 0 && kimya <= 100) this.kimya.note = kimya;
        if (kimyaOral >= 0 && kimyaOral <= 100) this.kimya.oralNote = kimyaOral;
    }

    public void calcAvarage() {
        double matAvg = (this.mat.oralNote * this.mat.oralEffect) + (this.mat.note * (1 - this.mat.oralEffect));
        double fizikAvg = (this.fizik.oralNote * this.fizik.oralEffect) + (this.fizik.note * (1 - this.fizik.oralEffect));
        double kimyaAvg = (this.kimya.oralNote * this.kimya.oralEffect) + (this.kimya.note * (1 - this.kimya.oralEffect));
        
        this.avarage = (matAvg + fizikAvg + kimyaAvg) / 3.0;
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            calcAvarage();
            this.isPass = this.avarage > 55;
            printNote();
            System.out.println("Ortalama : " + String.format("%.2f", this.avarage));
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " (Sözlü: " + this.mat.oralNote + ")");
        System.out.println("Fizik Notu : " + this.fizik.note + " (Sözlü: " + this.fizik.oralNote + ")");
        System.out.println("Kimya Notu : " + this.kimya.note + " (Sözlü: " + this.kimya.oralNote + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        // Sözlü notu etkilerini yüzdelik olarak (örn: %20 için 0.20) belirtiyoruz.
        Course mat = new Course("Matematik", "MAT101", "MAT", 0.20);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.25);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.30);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 60, 20, 80, 40, 50); // sınav ve sözlü notları birlikte
        s1.isPass();
    }
}
