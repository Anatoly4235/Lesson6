package lesson5;

public class Main {

    public static void main(String[] args) {
        employee employee1 = new employee("Константин", "IT", "123@mail.ru", "8(926)111-22-33", 100000, 30);

        employee employee2 = new employee("Виктор","IT", "123@mail.ru", "8(926)111-22-33", 100000, 41);

        employee1.info();

        employee2.info();
        System.out.println();
        System.out.println();

        employee[] empArray = new employee[7];
        empArray[0] = new employee("Тихонов Андрей", "Engineer", "tihonov@spartak.ru", "8(923)123-12-15", 100000, 35);
        empArray[1] = new employee("Макаров Дмитрий", "Engineer", "dima@IT.com", "8(923)123-16-58", 80000, 33);
        empArray[2] = new employee("Лютов Константин", "Bus Driver", "driver@mail.ru", "8(923)123-42-84", 30000, 37);
        empArray[3] = new employee("Шкода Михаил", "Engineer", "misha@gmail.com", "8(923)123-32-91", 900000, 45);
        empArray[4] = new employee("Лукашенко Александр", "TopManager", "lukash@mailbox.by", "88(923)123-11-99", 150000, 65);
        empArray[5] = new employee("Бурый Виктор", "Security", "ivivan@mailbox.com", "8(923)123-37-37", 90000, 35);
        empArray[6] = new employee("Бурденко Николай", "Doctor", "ivivan@mailbox.com", "8(923)123-28-61", 170000, 70);

        System.out.println("Ниже перечисленны сотрудники старше 40 лет");
        for (int i = 0; i < empArray.length; i++) {
            if(empArray[i].age>=40){
                System.out.println(empArray[i]);
            }

        }
    }
}
