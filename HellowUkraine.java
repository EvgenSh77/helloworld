public class HellowUkraine {
    public static void main(String[] args) {
        System.out.println("Hello Ukraine2. Russia-Ukraine War We Will Not Waver 2019: Biden Affirms Support for Ukraine After NATO Summit \nJava \n Is \n Great\" ");
        System.out.println("Over the course of a two-day summit in Lithuania 777");
        System.out.print("Prints a character. \n The character is translated into one or more bytes" +
                " according to the character encoding given to the constructor, " +
                "or the default charset if none specified. " +
                "\n These bytes are written in exactly the manner of the write(int) method.");
        System.out.print("222222 The character is");
        System.out.print("   translated into one or more bytes according");
        System.out.print(" = ");
        //System.out.print(" #### Ось кілька прикладів використання класів-обгорток: ");
        //Ось кілька прикладів використання класів-обгорток:
        Integer b; //дозволяє "зчитати" число із рядка
        b = Integer.parseInt("120");
        Boolean c = Boolean.FALSE;
        Long a = 150L;
        System.out.println(a + b); // отримаємо 13
        System.out.print("Оператор присвоєння = ");
        
        System.out.println("  Оператори присвоєння  ");
        //Оператор присвоєння
        double appleCount = 50.5; //Просто присвоїли число 50
        System.out.print("appelCount - ");
        System.out.print(appleCount);
        appleCount += 50.5; //додаєм до значення змінної 50.5
        int bananaCount = 8 + 12; //Присвоїли 20 - суму 8 + 12
        double totalFruitCount = appleCount / bananaCount; // Присвоїли суму змінних appleCount і bananaCount - 70
        System.out.println(totalFruitCount);

        System.out.println("  Бінарні опретори  ");
        byte mangoFruit1 = 127;
        byte mangoFruit2 = 3;
        int mangoFruit3 = 3;
        System.out.println(mangoFruit1 + mangoFruit2);
        int rest = 9 % 3;
        System.out.println(mangoFruit2);
        System.out.println(rest);
        boolean mangoFruitEnd = rest != mangoFruit3;
        System.out.println(mangoFruitEnd);
        System.out.println(++mangoFruit3);


        System.out.println("  Оператори присвоєння  ");

        System.out.println("Оператор -= віднімає від операнда значення праворуч:");
        int weekDays = 7;
        byte weekend = 2;
        weekDays -= weekend;
        System.out.print("Кількість робочих днів в тижні = ");
        System.out.println(weekDays);
        float weMy = 1.5f; //Змінна типу float, ініціалізована значенням 1.5f
        double weMy2 = 96.5; //Змінна типу float, ініціалізована значенням 96.75f
        double myWe = weMy2 - weMy; //різниця двох змінних 
        System.out.println("Моя вага дорівнює - "); // Printing output the volue to the console
        System.out.printf("  my weight is equal to - ");
        System.out.print(myWe);
        System.out.println("\n new ");
        int notDictributedItems = bananaCount + weekDays % 3;
        System.out.print(notDictributedItems);
        System.out.println("  $ Значення змінних");
        System.out.println(appleCount);
        System.out.println("appleCount");
        System.out.println(bananaCount);
        System.out.println(weekDays);
        System.out.println(notDictributedItems);
        //Оператори порівняння
        //* оператори рівності
        boolean summFruitCount = appleCount == bananaCount; //Буде false, тому що обидва операнди рівні
        System.out.println(summFruitCount);
        char bigA = 'A';
        char smallA = 'f';
        boolean theSameLatter = bigA == smallA; //Буде true, тому що обидва операнди рівні
        System.out.println(theSameLatter);
        //* оператори не рівності
        System.out.println("оператори не рівності");
        boolean isDifferent = appleCount != bananaCount; //Буде true, тому що обидва операнди нерівні
        System.out.print("is Different - ");
        System.out.println(isDifferent);
        System.out.println(" Класи обгортки ");

        // оператори більше меньше
        System.out.println("Оператори більше меньше");
        System.out.println(appleCount > bananaCount);
        System.out.println(appleCount < bananaCount);
        System.out.println(appleCount >= bananaCount);
        //Логічні оператори
        System.out.println("Логічні оператори");
        boolean x = true;
        boolean y = false;
        boolean z = false;
        boolean xOrY = x || y;
        boolean yOrZ = y || z || xOrY;
        boolean xOrYz = x || yOrZ;
        System.out.println("1. Результат");
        System.out.println(xOrY);
        System.out.println(yOrZ);
        System.out.println(xOrYz);

        System.out.println("  Логічне I  ");
        boolean logichI = x && y;
        boolean logich2 = y && z;
        boolean logich3 = x = yOrZ;
        System.out.println(logichI);
        System.out.println(logich2);
        System.out.println(logich3);
        System.out.println("  Виключне   або  ".toUpperCase()); // Фораматуванння тексту 
        boolean aboT1 = x ^ y;
        boolean aboT2 = !y ^ z;
        System.out.println(aboT1);
        System.out.println(aboT2);
        
        System.out.println("\"---Типи даних Snring---\"".toUpperCase());
        String name = " Pavlo ";
        String lastName = new String(" Scoropadskej ");
        System.out.println(" Гетьман - " + name + lastName + " - народився 15.05.1873 року" + " Вісбаден, Німецька імперія ");
        String getmanN = " pavlo ";
                String getmanLn = new String(" Scoropadskej Pavlo - 15.05.1873 year ");
        System.out.println(name.equalsIgnoreCase(getmanN));

        System.out.println("---Довжина рядка---".toUpperCase()); //Можна дізнатися, скільки символів у рядку, використовуючи метод length().
        String planet = "Earth";
        String country = "Ukraine";
        int lengthEar = planet.length();
        System.out.println("lengthEar + " + lengthEar);

        System.out.println("--- Чи є в рядку інший рядок ---");
        boolean phraseContainer = getmanLn.toLowerCase().contains("Pavlo - 15.05.1873".toLowerCase());//Метод contains() шукає точне входження, враховуючи регістр.
        System.out.println(phraseContainer);
        String result1String = String.join(" = ", planet, country, getmanLn);
        System.out.println(result1String);
        
        System.out.println("--Iдекс символу--".toUpperCase());
        char fiveChar = getmanLn.charAt(5);//charAt() - метод, який дозволяє отримати символ на певній позиції 
        System.out.println(fiveChar);
        System.out.println("---Починається або закінчується рядок іншим рядком---".toUpperCase());
        System.out.println(getmanLn.startsWith(" Sc"));//true
        System.out.println(getmanLn.endsWith("53 "));//false
        
        System.out.println("---Чи порожній рядок---");//Перевіряє чи порожній рядок. Перший метод - isEmpty(); другий метод - Це метод isBlank()
        int lengthGetman = getmanLn.length();
        System.out.println(getmanLn.isEmpty());
        System.out.println(" ".isBlank());
        System.out.println(lengthGetman);

        System.out.println("---Заміна підрядка---");//Є метод replace(), який заміняє в рядку один рядок на інший
        String replacedGetman1 = getmanLn.replace("15.05.1873", "29.04.1918");
        String replacedGetman2 = "- народився 15.05.1873 року Вісбаден, Німецька імперія ".replace("імперія ", "імперія. Походив із козацько-старшинського роду Скоропадських--");
        String replacedGetman3 = replacedGetman2.replace("і", "i");
        System.out.println(replacedGetman1);
        System.out.println(replacedGetman2);
        System.out.println(replacedGetman3);
        System.out.println("---Чищення рядка від стартових та фінальних пробілів---");
        System.out.print("  java15 ".trim());
        System.out.println("  java15  ".strip());

        System.out.println("---Отримати підрядок---");
        String textNews = String.join(", ", planet, country, getmanLn);//Є метод substring(), якому ми даємо два індекси - стартовий та кінцевий, і повертається рядок між цими двома індексами (виключаючи символ по останньому індексу):
        System.out.println(textNews.substring(0, 35));
/* 
float f = 0.5f;
double d = 0.1;
double d1 = 0.2;
System.out.println(d + d1);
*/
/*Person person = new Person1(String(item));
System.out.println(Person1);
*/
        System.out.println("---Оголошення змінних за допомогою var---".toUpperCase());
        var item = (String) null;
        var item1 = 1;
        var item2 = 2.5;
        var item3 = 0.5f;

        System.out.println("item = " + item);
        System.out.println("item1 = " + item1);
        System.out.println("item2 = " + item2);
        System.out.println("item3 = " + item3);
        

        System.out.println("----Завершення прогарми----".toUpperCase());
        System.out.println(appleCount);

        // boolean texUkr =
        System.out.println("Початок нового розділу".toUpperCase());
        {
                System.out.println("----Завершення прогарми222----");
                System.out.println("Початок нового розділу".toUpperCase());
        }      

        {
                System.out.println("----Завершення прогарми----3333");
                System.out.println("Початок нового розділу".toUpperCase());
                System.out.println(appleCount);
        }  
    }

// public int return () {
//return sum = sum(a, b);
//  AtomicInteger sum = new AtomicInteger();
//return 0;
        /**
         * 
         */
        
      
       
}