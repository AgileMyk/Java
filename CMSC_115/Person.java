public class Person {


    private boolean employed = false;
    private String name;
    private double height;
    //weight is in pounds
    private double weight;
    //height in inches
    private String hairColor;
    private String eyeColor;
    private String position;
    private int age;
    private double BMI;
    private String BMIstatus;

    //undeclared double variable
    double d;

    //method that returns undeclared double variable
    public double tester() {
        return d;
    }

    public Person() {
        this.name = "anonymous";
    }

    public Person(String name) {
        this.name = name;
    }

    public void EmployeeStatus(boolean employed) {
        this.employed = employed;
    }

    public void setAttributes(String name, double height, double weight, String hairColor, String eyeColor, String position, int age) {

        if (employed == true) {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
            this.position = position;
            this.age = age;
        } else {
            this.name = "void";
            this.height = 0;
            this.weight = 0;
            this.hairColor = "void";
            this.eyeColor = "void";
            this.position = "void";
        }
    }

    public void setName(String name) {
        if (name.length() > 1) {
            this.name = name;
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setProfession(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public double getBMI() {
        //BMI in US customary units
        return 703 * (weight/(height * height));
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getHairColor() {
        return  hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }


    public String getPosition() {
        return position;
    }
    public int getAge() {
        return age;
    }

    public String getBMIstatus(double BMI) {
        if (BMI < 16) {
            BMIstatus = "Severe Thinness";
        } else if (BMI <= 17) {
            BMIstatus = "Moderate Thinness";
        } else if (BMI <= 18.5) {
            BMIstatus = "Mild Thinness";
        } else if (BMI <= 25) {
            BMIstatus = "Normal";
        } else if (BMI <= 30) {
            BMIstatus = "Overweight";
        } else if (BMI <= 35) {
          BMIstatus = "Obese Class I";
        } else if (BMI <= 40) {
            BMIstatus = "Obese Class II";
        } else {
            BMIstatus = "Obese Class III";
        }
        return BMIstatus;
    }

}
