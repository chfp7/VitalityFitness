package application;


public class UserData {
	public static double age;
    public static UserData instance;
    public static String sex;
    public static double weight;
    public static double height;
    

    public UserData() {
    }

    public UserData(int age, String sex, double weight, double height) {
        UserData.age = age;
        UserData.sex = sex;
        UserData.weight = weight;
        UserData.height = height;
    }

    public static UserData getInstance() {
        if (instance == null) {
            instance = new UserData();
        }
        return instance;
    }

    public double getAge() {
        return  age;
    }

    public void setAge(double age) {
        UserData.age =  age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        UserData.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        UserData.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        UserData.height = height;
    }


   

    



    
}
