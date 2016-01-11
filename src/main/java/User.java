import java.util.ArrayList;

public class User {
    String name;
    int age;
    boolean sex;
    String phone;
    ArrayList<String> frends = new ArrayList<String>();

    public User() {
    }

    public User(String name, int age, boolean sex, String phone, String frends) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.frends.add(frends);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<String> getFrends() {
        return frends;
    }

    public void setFrends(ArrayList<String> frends) {
        this.frends = frends;
    }

    @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    ", phone='" + phone + '\'' +
                    ", frends=" + frends +
                    '}';
    }
}
