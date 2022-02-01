package HomeWork5;

public class HomeWork5 {
    public static void main(String[] args, boolean age) {
            workEmployee[] persArray = new workEmployee[5];
        persArray[0] = new workEmployee("Нургалиева А.Е.", "Инженер", "anurgalieva@gmail.com", "89371203024", "15000", "25");
        persArray[1] = new workEmployee("Иванов И.И.", "лаборант", "ivanov28@gmail.com", "89780005328", "40000", "20");
        persArray[2] = new workEmployee("Semenov S.S.", "менеджер", "semenov20@gmail.com", "89997654627", "100500", "58");
        persArray[3] = new workEmployee("Petrov P.P", "Водитель", "Petrov111@gmail.com", "89249089090", "20000", "51");
        persArray[4] = new workEmployee("Mironov", "Директор", "direktor@gmail.com", "89762887536", "50000", "35");

        if (age > 40) {
            System.out.println("Сотрудники старше 40 лет");
        } else
            System.out.println("Сотрудники младше 40 лет");
    }


        static class workEmployee {
            private String name;
            private String position;
            private String email;
            private String phone;
            private int salary;
            private int age;

            public workEmployee(String name, String position, String email, String phone, int salary, int age) {
                this.name = name;
                this.position = position;
                this.email = email;
                this.phone = phone;
                this.salary = salary;
                this.age = age;
            }

            public void info() {
                System.out.println("Name=" + name + " Position=" + position + " email=" + email + " phone=" + " salary=" + salary + "age=" + age);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public int getSalary() {
                return salary;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                if (age > 0) {
                    this.age = age;
                } else {
                    System.out.println(" Возраст должен быть положительным!");
                }

            }


        }

    }