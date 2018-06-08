public class DZ {
    public static void main (String[] args){

        double a = 7, b = 2, c=3;
/*
1) Найти результат выражения для произвольных значений a,b,c:
a + b * c / 2
 */
        System.out.println("Решение задания № 1: " + (a+b*c/2));

/*
2) Найти результат выражения для произвольных значений a,b:
( a2 + b2 ) / 2
 */
        System.out.println("Решение задания № 2: " + (Math.pow(a,2) + Math.pow(b,2)) / 2);
        /*
        3) Найти результат выражения для произвольных значений a,b,c:
( a + b ) / 12 * c % 4 + b
         */
        System.out.println("Решение задания № 3: " +(( a + b ) / 12 * c % 4 + b));

        /*
       4) Найти результат выражения для произвольных значений a,b,c:
(a - b * c ) / ( a + b ) % c
         */
        System.out.println("Решение задания № 4: " + (a - b * c ) / ( a + b ) % c); /* или чтобы засчиталось, как правильно выполненное задание необходимо подобрать так, чтобы число до деления остатка было не дробное?*/

        // 5. Найти результат выражения для произвольных значений a,b,c: | a - b | / ( a + b )3 - cos( c )
        int a5 = 6, b5 = 9, c5 = 78;
        System.out.println("Решение задания № 5: " + (Math.abs(a5 - b5) / Math.pow((a5+b5), 3) - Math.cos(Math.toRadians(c5))));

        // 6. В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
        // Вычислить и вывести на экран площадь треугольника и его периметр.
        double a1 = 27, b1 = 14,c1, S1, P1;
        S1 = a1*b1/2;
        c1 = Math.sqrt(Math.pow(a1,2) + Math.pow(b1,2));
        P1 = a1 + b1 + c1;
        System.out.println("Решение задания № 6: Площадь треугольника = " + S1 + ", а Периметр = " + P1);

        // 7. Даны координаты двух вершин прямоугольника, которые находятся на противоположных концах диагонали.
        // Стороны прямоугольника параллельны осям координат. Найти площадь прямоугольника и его периметр

        double x21 = 31, y21 = 24, x22 = -17, y22 = 48, S2, P2;
        S2 = Math.abs(x21 - x22)*Math.abs(y21-y22);
        P2 = 2*Math.abs(x21 - x22) + 2*Math.abs(y21-y22);
        System.out.println("Решение задания № 7: Площадь прямоугольника = " + S2 + ". Его периметр = " + P2);

        // 8. Дано две стороны треугольника и угол между ними в градусах. Найти длину третьей стороны, периметр и площадь треугольника.
        double a3 = 12, b3 = 25, d3 = 25, c3, S3, P3;
        S3 = a3*b3*Math.sin(Math.toRadians(d3))/2;
        c3 = Math.sqrt(Math.pow(a3, 2) + Math.pow(b3, 2) - 2*a3*b3*Math.cos(Math.toRadians(d3)));
        P3 = a3 + b3 +c3;
        System.out.println("Решение задания № 8: Площадь треугольника = " + S3 + ". Периметр = " + P3 + "Третья сторона = " + c3 );

        // 9. Дети слепили снеговика из 3х идеальной формы шаров снега. Шары получились радиусами 1м, 0.5м и 0.2м.
        // Учитывая, что коэффициент плотности снежных шаров равен 0.7кг/м3, найти сколько весит снеговик.
        double r91 = 1, r92 = 0.5, r93 = 0.2, V91, V92, V93, m91, m92, m93, Pl = 0.7, m9;
        V91 = 4/3*3.14*Math.pow(r91, 3);
        V92 = 4/3*3.14*Math.pow(r92, 3);
        V93 = 4/3*3.14*Math.pow(r93, 3);
        m91 = V91*Pl;
        m92 = V92*Pl;
        m93 = V93*Pl;
        m9 = m91 + m92 + m93;
        System.out.println("Решение задания № 9: Снеговик весит " + m9 + "кг");

        // 10. Записать решение задач 1-5 в виде отдельных функций
        // Найти результат выражения для произвольных значений a,b,c:     a + b * c / 2
        System.out.println("Решение задания № 10.1: " + Zadanie1(a,b,c));

        //Найти результат выражения для произвольных значений a,b:       ( a2 + b2 ) / 2
        System.out.println("Решение задания № 10.2: " + Zadanie2(a,b));

        // Найти результат выражения для произвольных значений a,b,c:    ( a + b ) / 12 * c % 4 + b
        System.out.println("Решение задания № 10.3: " + Zadanie3(a,b,c));

        //Найти результат выражения для произвольных значений a,b,c:      (a - b * c ) / ( a + b ) % c
        System.out.println("Решение задания № 10.4: " + Zadanie4(a,b,c));

        //Найти результат выражения для произвольных значений a,b,c: | a - b | / ( a + b )3 - cos( c )
        System.out.println("Решение задания № 10.5: " + Zadanie5(a5,b5,c5));

        // 11. Записать решение задач 6-9 с использованием функций

        // В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
        // Вычислить и вывести на экран площадь треугольника и его периметр.
        System.out.println("Решение задания № 11.6: Площадь треугольника = " + Zadanie6_1(a1,b1) + ", а Периметр = " + Zadanie6_2(a1,b1));

        // Даны координаты двух вершин прямоугольника, которые находятся на противоположных концах диагонали.
        // Стороны прямоугольника параллельны осям координат. Найти площадь прямоугольника и его периметр
        System.out.println("Решение задания № 11.7: Площадь прямоугольника = " + Zadanie7_1(x21,x22,y21,y22) + ", а Периметр = " + Zadanie7_2(x21,x22,y21,y22));

        // Дано две стороны треугольника и угол между ними в градусах. Найти длину третьей стороны, периметр и площадь треугольника.
        System.out.println("Решение задания № 11.8: Площадь треугольника = " + Zadanie8_1(a3,b3,d3) + ". Периметр = " + Zadanie8_3(a3,b3,d3) + "Третья сторона = " + Zadanie8_2(a3,b3,d3) );

        // Дети слепили снеговика из 3х идеальной формы шаров снега. Шары получились радиусами 1м, 0.5м и 0.2м.
        // Учитывая, что коэффициент плотности снежных шаров равен 0.7кг/м3, найти сколько весит снеговик.

        System.out.println("Решение задания № 11.9: Снеговик весит " + Zadanie9(r91,r92,r93,Pl) + "кг");

        // 12. Написать две функции для обменника валют: одна - для конвертирования гривен в доллары, вторая - наоборот. Функции должны принимать в параметре одну валюту, а возвращать другую.
        double UAH = 28735, USD = 355, kursUAH_USD = 25.7, kursUSD_UAH = 26.8;
System.out.println("За " + UAH + " грн по крусу " + kursUAH_USD + " вы получаете - " + obmenUAH_USD(UAH,kursUAH_USD));
        System.out.println("За " + USD + " usd по курсу " + kursUSD_UAH + " вы получаете - " + obmenUSD_UAH(USD,kursUSD_UAH));
        // 13. На первой колонизированной людьми планете Земля-2 введен календарь, который содержит 10 месяцев в году. В каждом месяце 42 дня. Первый день колонизации отмечен датой 01.01.01.
        // Написать функцию, которая по дате, заданной тремя числами (число, месяц, год) рассчитывает сколько дней прошло со времени колонизации Земли-2.
        int day = 25, month = 8, year = 27;
System.out.println("Cо времени колонизации прошло " + DniKolonizacii(day,month,year));
// 14. Каждый из трех туристов за час прошел от 1 до 9 миль по пересеченной местности.
// Эти данные сохранились в виде одного трехзначного числа (например 473).
// Напишите функцию, которая по этому числу найдет сколько всего прошли туристы (т.е. Задано число 473. По этому числу рассчитывается общий путь: 4+7+3=14 миль).
        int Dis = 473;
        System.out.println("Задание 14: туристы всего прошли - " +Distance(Dis)+ " миль");
        //15 Задание
        int OL = 2;
        PArnost(OL);
        //16 Задание
        TrainCrash(10,10);
        //17  DronCrash(7,5,2,7,4,9);

       /* 19. Написать программу для реализации ситуации из сказки, когда герой стоит на распутье
        (1 - налево пойдешь, сам умрешь, 2. Направо - коня потеряешь, 3. Прямо - клад найдешь).
        Необходимо вывести на экран возможные варианты, считать выбор в виде цифры и вывести на экран, что случилось с героем в зависимости от его выбора.*/
       /*
        try (Scanner VS = new Scanner(System.in)){
            int LL;
            System.out.println("Вы стоите на распутье. Первый путь(1) - налево пойдешь, сам умрешь. Второй путь(2)  - направо, коня потеряешь. Третий путь(3) - прямо, клад найдешь. Сделайте Ваш выбор (1,2 или 3) " );
            LL = VS.nextInt();
            if (LL == 1){
                System.out.println("Сожалеем, Вы погибли!");
            } else {
                if (LL==2){
                    System.out.println("Вы потеряли коня, но было хуже если бы Вы выбрали первый путь");
                }else {
                    System.out.println("Поздравляем, Вы нашли клад");
                }
            }
        }*/

       /* 20. У вас есть платформа размером 1м на 1м и грузоподъемностью 1 тонна.
       Написать функцию, которая по заданным габаритам прямоугольного ящика (длина, ширина, высота, вес) дает ответ на вопрос, сможете ли вы поднять груз (учтите, что ящик можно поставить на бок).
          try (Scanner As = new Scanner(System.in)){
           double aaa, bbb, hhh, mmm;
           System.out.println("Введите длину первой стороны ящика в метрах");
           aaa = As.nextDouble();
           System.out.println("Введите длину второй стороны ящика в метрах");
           bbb = As.nextDouble();
           System.out.println("Введите высоту ящика в метрах");
           hhh = As.nextDouble();
           System.out.println("Введите вес ящика в тоннах");
           mmm = As.nextDouble();
           Gruz(aaa,bbb,hhh,mmm);

       }


        */

    }
    // 10. Записать решение задач 1-5 в виде отдельных функций
    public static double Zadanie1 (double a, double b, double c){
        double O = a+b*c/2;
        return O;
    }
    public static double Zadanie2(double a, double b){
        double O = (Math.pow(a,2) + Math.pow(b,2)) / 2;
        return O;
    }
public static double Zadanie3(double a, double b, double c){
        double O = ( a + b ) / 12 * c % 4 + b;
        return O;
}
public static double Zadanie4(double a, double b, double c){
        double O = (a - b * c ) / ( a + b ) % c;
return O;
}
public static double Zadanie5(double a, double b, double c){
        double O = (Math.abs(a - b) / Math.pow((a+b), 3) - Math.cos(Math.toRadians(c)));
        return O;

    // 11. Записать решение задач 6-9 с использованием функций
}
public static double Zadanie6_1 (double a, double b){ //Площадь треугольника
        double S = a*b/2;
        return S;
    }
    public static double Zadanie6_2 (double a, double b){ //Периметр треугольника
       double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        double P = a + b + c;
        return P;
    }
    public static double Zadanie7_1(double x1, double x2, double y1, double y2){ // Площадь прямоугольника
        double S = Math.abs(x1 - x2)*Math.abs(y1-y2);
        return S;
    }
    public static double Zadanie7_2 (double x1, double x2, double y1, double y2){ //Периметр прямоугольника
        double P = 2*Math.abs(x1 - x2) + 2*Math.abs(y1-y2);
        return P;

    }
    public static double Zadanie8_1 (double a, double b, double d){ //Площадь треугольника
       double S = a*b*Math.sin(Math.toRadians(d))/2;
        return S;
    }
    public static double Zadanie8_2 (double a, double b, double d) { //третья сторона треугольника
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(Math.toRadians(d)));
        return c;
    }
    public static double Zadanie8_3 (double a, double b, double d){ //периметр сторона треугольника
        double P = a + b + Zadanie8_2(a, b, d);
        return P;
}
public static double Zadanie9 (double r1, double r2, double r3, double Pl){
    double V1 = 4/3*3.14*Math.pow(r1, 3);
    double V2 = 4/3*3.14*Math.pow(r2, 3);
    double V3 = 4/3*3.14*Math.pow(r3, 3);
    double m1 = V1*Pl;
    double m2 = V2*Pl;
    double m3 = V3*Pl;
    double m = m1 + m2 + m3;
    return m;
}
    // 12. Написать две функции для обменника валют: одна - для конвертирования гривен в доллары, вторая - наоборот. Функции должны принимать в параметре одну валюту, а возвращать другую.
public static double obmenUAH_USD (double UAH, double kurs){
        double USD = UAH/kurs;
        return USD;
}
    public static double obmenUSD_UAH (double USD, double kurs){
        double UAH = USD*kurs;
        return UAH;
    }
    // 13. На первой колонизированной людьми планете Земля-2 введен календарь, который содержит 10 месяцев в году. В каждом месяце 42 дня. Первый день колонизации отмечен датой 01.01.01.
    // Написать функцию, которая по дате, заданной тремя числами (число, месяц, год) рассчитывает сколько дней прошло со времени колонизации Земли-2.
    public static int DniKolonizacii(int day,int month,int year){
        int AllDAys = (year - 1)*420 + (month-1)*42 + day;
        return AllDAys;
    }
    // 14. Каждый из трех туристов за час прошел от 1 до 9 миль по пересеченной местности.
// Эти данные сохранились в виде одного трехзначного числа (например 473).
// Напишите функцию, которая по этому числу найдет сколько всего прошли туристы (т.е. Задано число 473. По этому числу рассчитывается общий путь: 4+7+3=14 миль).
public static int Distance(int Dis){
        int D1 = Dis/100;
        // int D2_1 = Dis/10;           int D2 = D2_1-D1*10;  альтернативный вариант
        int D3 = Dis%10;
        int D2 = (Dis%100)/10;
        int D4 = D1 + D2 + D3;
        return D4;
}
//15 Написать функцию, которая принимает одно целое число в качестве параметра, и возвращает ответ о том четное это число или нет.
    public static void PArnost(int a){
        int b = a%2;
        if (b==0) {
            System.out.println("Парное");
        } else {
            System.out.println("непарное");
        }
}

// 16 Два поезда движутся на скорости V1 и V2 на встречу друг другу. Между ними 10 км. пути.
// Через 4 км пути первый поезд может свернуть на запасной путь. При заданных скоростях узнать столкнуться ли поезда.
public static void TrainCrash(double V1, double V2){
        if (4/V1*V2 < 6){
            System.out.println("Поезда не столкнутся")
        } else{
            System.out.println("БУМ")
        }
}
// 17. Для охраны территории завода было запущено два дрона.
// Путь каждого дрона охватывает территорию, которая описывается окружностью с заданными радиусом и координатами центра.
// Написать функцию, которая отвечает на вопрос, могут ли столкнуться дроны.
    public static void DronCrash (double x1, double y1, double r1, double x2, double y2, double r2){
        double AB = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
        if (AB > r1+r2){
            System.out.println("Дроны не столкнутся");
        }else {
            System.out.println("Дроны столкнутся");
        }
    }
    public static void Gruz (double aaa, double bbb, double hhh, double mmm){
        if(mmm > 1){
            System.out.println("Превышение веса. Максимальный вес = 1 тонна");
        }else {
            if (aaa>1 && bbb>1 || aaa>1&&hhh>1 || bbb>1&&hhh>1){
                System.out.println("Ящик большой. Размещение не удастся");
            }else {
                System.out.println("Ящик можно поднять");
            }
        }

}