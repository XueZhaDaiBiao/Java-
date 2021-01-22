public class Student {
    private String name;
    private String stu_id;
    private int age;
    private String addre;

    public Student(){}
    public Student(String name,String stu_id,int age,String addre){
        this.name = name;
        this.stu_id = stu_id;
        this.age = age;
        this.addre = addre;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setStu_id(String stu_id){
        this.stu_id = stu_id;
    }
    public void setAddre(String addre){
        this.addre = addre;
    }
    public String getName(){
        return name;
    }
    public String getStu_id(){
        return stu_id;
    }
    private int getAge(){
        return age;
    }
    public String getAddre(){
        return addre;
    }

    @Override
    public String toString() {
        return "学号：" + stu_id + "   姓名：" + name + "    年龄：" + age + "   地址：" + addre;
    }
}
