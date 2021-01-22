import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    /*
     * 思路：
     * 1.系统界面编写
     * 2.添加学生
     * 3.修改学生
     * 4.搜索学生
     * 5.删除学生
     * 6.退出*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arryList = new ArrayList<>();
        boolean off = true;
        int choose = 0;
        String stu1_id;
        String stu2_id;
        while(off){

            mainShow();
            try {
                choose = sc.nextInt();
                if(choose<0 || choose>4 ){
                    System.out.println("你输入的选择数字有问题！注意是在，0，1，2，3，4这几个数字");
                    continue;
                }
                switch (choose) {
                    case 1:
                        Add(arryList);
                        break;
                    case 2:
                        stu1_id = sc.nextLine();
                        System.out.println("请输入要删除学生的学号：");
                        stu1_id = sc.nextLine();
                        Del(arryList, stu1_id);
                        break;
                    case 3:
                        Serach(arryList);
                        break;
                    case 4:
                        stu2_id = sc.nextLine();
                        System.out.println("请输入要修改学生的学号：");
                        stu2_id = sc.nextLine();
                        Set(arryList, stu2_id);
                        stu2_id = sc.nextLine();
                        break;
                    case 0:
                        off = false;
                        break;
                }
            }catch(Exception e){
                System.out.println("你输入的学号有问题！");
            }
        }
    }
    public static void mainShow(){
        System.out.println("============欢迎使用MYSDM系统============");
        System.out.println("TIPS:");
        System.out.println("1.添加学生信息请输入1：");
        System.out.println("2.删除学生信息请输入2：");
        System.out.println("3.搜索学生信息请输入3：");
        System.out.println("4.修改学生信息请输入4：");
        System.out.println("5.退出系统请输入0：");
        System.out.println("========================================");
    }
    //添加
    public static void Add(ArrayList<Student> arrayList){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        //变量区
        String stu_id;
        String name;
        int age;
        String add;

        System.out.print("请输入学号：");
        stu_id = sc.nextLine();
        student.setStu_id(stu_id);
        System.out.println();

        System.out.print("请输入姓名：");
        name = sc.nextLine();
        student.setName(name);
        System.out.println();

        System.out.print("请输入年龄：");
        age = sc.nextInt();
        student.setAge(age);
        System.out.println();

        //回车过滤
        String fliter = sc.nextLine();
        System.out.print("请输入地址：");
        add = sc.nextLine();
        student.setAddre(add);
        System.out.println();

        //添加信息
        arrayList.add(student);
    }
    //修改
    public static void Set(ArrayList<Student> arrayList,String stu_id){
        Scanner sc = new Scanner(System.in);
        //变量区
        String stunum;
        String name;
        int age;
        String add;
        String backname;
        Student student = null;
        //根据学号找到学生信息
        for(int i = 0; i < arrayList.size(); i++){
            if(stu_id.equals(arrayList.get(i).getStu_id())){
                student = arrayList.get(i);
            }
        }
        backname = student.getName();
        System.out.print("输入新的学号：");
        stunum = sc.nextLine();
        student.setStu_id(stunum);
        System.out.println();

        System.out.print("输入新的姓名：");
        name = sc.nextLine();
        student.setName(name);
        System.out.println();

        System.out.print("请输入新的年龄：");
        age = sc.nextInt();
        student.setAge(age);
        String a = sc.nextLine();
        System.out.println();

        System.out.print("请输入新的地址：");
        add = sc.nextLine();
        student.setAddre(add);
        System.out.println();

        System.out.println(backname + "同学的信息已经被修改为" + student.getName() + "!");
    }
    //搜索
    public static void Serach(ArrayList<Student> arrayList){
        System.out.println("共找到" + arrayList.size() + "名同学。");
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i).toString());
        }
    }
    //删除
    public static void Del(ArrayList<Student> arrayList,String stu_id){
        Student student;
        int count = -1;
        for(int i = 0; i < arrayList.size(); i++){
            if(stu_id.equals(arrayList.get(i).getStu_id())){
                count = i;
            }
        }
        System.out.println(arrayList.get(count).getName() + "同学的信息已被删除！");
        System.out.println(count);
        arrayList.remove(count);
    }
}