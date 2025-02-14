public class Main {
    public static void main(String[] args) {
        System.out.println("Задание№1");
        int oS = 0;
        if (oS == 1) {
            System.out.println("Ваша операционная система: Android. Вот ваша ссылка на скачивание приложения://....");
        } else if (oS == 0) {
            System.out.println("Ваша опреационная система IOS. Вот ваша ссылка на скачивание приложения: ////");
        }
        System.out.println("Задание№2");
        int clientDeviceYear = 2015;
        if (oS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Ваша операционная система: Android. Вот ваша ссылка на скачивание приложения://....");
        } else if (oS == 1 && clientDeviceYear < 2015) {
            System.out.println("Вот облегчённая версия версия приложения для Android: .....");
        }
        if (oS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Ваша операционная система: IOS. Вот ваша ссылка на скачивание приложения://....");
        } else if (oS == 0 && clientDeviceYear < 2015) {
            System.out.println("Вот облегчённая версия версия приложения для IOS: .....");
        }
        System.out.println("Задание №3");
        int year = 2400;
        if (year > 1584 && year % 4 == 0 && year % 100 > 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным.");
        } else {
            System.out.println("Год " + year + " не является вискосным");
        }
        System.out.println("Задание№4");
        int deliveryDistance = 95;
        int deliveryTime;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("Дней потребуется:" + deliveryTime);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Дней потребуется:" + deliveryTime);
        }
        else if (deliveryDistance > 60 && deliveryDistance <=100) {
            deliveryTime = 3;
            System.out.println("Дней потребуется:" + deliveryTime);
        }
        else {
            System.out.println("Свыше 100км доставка не осуществляется.");
        }
        System.out.println("Задание№5");
        int monthNumer = 12;
        switch (monthNumer) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц года под номером " + monthNumer + " относится к зимнему периоду");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц года под номером " + monthNumer + " относится к весеннему периоду");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц года под номером " + monthNumer + " относится к летнему периоду");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц года под номером " + monthNumer + " относится к осеннему периоду");
                break;
            default:
                System.out.println("Такого месяца в году не существует. Пока что.");
        }

    }
}