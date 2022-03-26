public class StudentManagement {
    public int i0 = 0;
    Student[] students = new Student[100];

    /**
     * check cung lop.
     */

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * them hoc sinh.
     */

    public void addStudent(Student newStudent) {
        this.students[this.i0] = new Student(newStudent);
        this.i0++;
    }

    /**
     * in hoc sinh.
     */

    public String studentsByGroup() {
        String a = "";
        int[] m = new int[this.i0];
        for (int i = 0; i < this.i0; i++) {
            if (m[i] == 0) {
                m[i] = 1;
                a = a + this.students[i].getGroup() + "\n";
                a = a + this.students[i].getInfo() + "\n";
                for (int j = i + 1; j < this.i0; j++) {
                    if (sameGroup(this.students[i], this.students[j])) {
                        m[j] = 1;
                        a = a + this.students[j].getInfo() + "\n";
                    }
                }
            }
        }
        return a;
    }

    /**
     * xoa hoc sinh.
     */

    public void removeStudent(String id) {
        for (int i = 0; i < this.i0; i++) {
            if (this.students[i].getId().equals(id)) {
                for (int j = i; j < this.i0; j++) {
                    this.students[j] = this.students[j + 1];
                }
                this.i0--;
                break;
            }
        }
    }
}
