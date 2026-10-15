public class Students {
    int npm, semester;
    String fullname, classname;
    float gpa;

    public int getNpm(int npm) {
        this.npm = npm;
        return this.npm;
    }

    public int getSemester(int semester) {
        this.semester = semester;
        return this.semester;
    }

    public String getFullname(String fullname) {
        this.fullname = fullname;
        return this.fullname;
    }

    public String getClassname(String classname) {
        this.classname = classname;
        return this.classname;
    }

    public float getGpa(float gpa) {
        this.gpa = gpa;
        return this.gpa;
    }


}
