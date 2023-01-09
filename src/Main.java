public class Main {
    public static void main(String[] args) {System.out.println("Hello world!");
    var dog = 8.0;
    System.out.println(dog);
    dog = dog + 4;
    System.out.println(dog);
    dog = dog - 3.5;
        System.out.println(dog);
    var cat = 3.6;
    System.out.println(cat);
    cat = cat + 4;
    System.out.println(cat);
    cat = cat -1.6;
        System.out.println(cat);
    var paper = 763789;
    System.out.println(paper);
    paper = paper + 4;
    System.out.println(paper);
    paper = paper - 7639;
    System.out.println(paper);
    var friend = 19;
    System.out.println(friend);
    friend = friend * 2;
    System.out.println(friend);
    friend = friend /7;
    System.out.println(friend);
    var frog = 3.5;
    System.out.println(frog);
    frog = frog * 10;
    System.out.println(frog);
    frog = frog/3.5;
    System.out.println(frog);
    frog = frog + 4;
    System.out.println(frog);

    var firstBoxer = 78.2;
    var secondBoxer = 82.7;
    var totalWeight = firstBoxer + secondBoxer;
    System.out.println("Общий вес " + totalWeight + " кг");

    var differentWeight = secondBoxer - firstBoxer;
    System.out.println("Разница в весе " + differentWeight);

    var surplusWeight = secondBoxer%firstBoxer;
    System.out.println("Избыток "+ surplusWeight);

    var totalHours = 640;
    var workHours = 8;
    var totalWorked = totalHours/workHours;
    System.out.println("Всего работников в компании - " + totalWorked + " человек");
    var worked = 80;
    worked = worked + 96;
    System.out.println(worked);
    var distributionHours = totalHours/worked;
    System.out.println("Если в компании работает " + worked + " человек, то всего " + distributionHours + " часа работы может быть поделено между сотрудниками");

byte a = 22;
        System.out.println(a);
short b = 300;
        System.out.println(b);
int c = 1000000;
        System.out.println(c);
long d = 3000000;
        System.out.println(d);
float e = 1.25f;
        System.out.println(e);
double f = 55.567890123;
        System.out.println(f);

float g = 27.12f;
        System.out.println(f);
long h = 987678965549L;
        System.out.println(h);
float i = 2.786f;
        System.out.println(i);
short j = 569;
        System.out.println(j);
short k = -159;
        System.out.println(k);
short l = 27897;
        System.out.println(l);
byte m = 67;
        System.out.println(l);

byte LP = 23;
byte AS = 27;
byte EA = 30;
short allPaper = 480;
int student = LP + AS + EA;
System.out.println("всего " +  student + " учеников");
int list = allPaper/ student;
System.out.println("На каждого ученика рассчитано " +  list + " листов бумаги");

byte bottles2min = 16;
int bottle1min = bottles2min/2;
System.out.println (bottle1min + " бутылок за минуту");
int b20min = bottle1min*20;
System.out.println("За 20 минут машина произвела " + b20min + " штук бутылок");
int day = bottle1min*1440;
System.out.println("За сутки машина произвела " + day + " штук бутылок");
int day3 = day*3;
System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
int month = day*30;
System.out.println("За месяц машина произвела " + month + " штук бутылок");

byte banks = 120;
byte whitebank1class = 2;
byte brownbank1class = 4;
int allBanks = whitebank1class + brownbank1class;
System.out.println(allBanks);
int klass = 120/allBanks;
System.out.println("Всего классов " + klass);
int whiteK = klass*whitebank1class;
int brownK = klass*brownbank1class;
System.out.println("В школе, где " +  klass + " классов, нужно " + whiteK + " банок белой краски и " + brownK + " банок коричневой краски");

short banans = 5*80;
System.out.println(banans);
int milk = 2*105;
System.out.println(milk);
int iceCreame = 2*100;
System.out.println(iceCreame);
short egg = 4*70;
System.out.println(egg);
float totaslGramm = banans + milk + iceCreame + egg;
System.out.println(totaslGramm + " грамм всего");
float kg = totaslGramm/1000;
System.out.println(kg + " килограмм всего");

short agr = 7000;
short bgr = 250;
short cgr = 500;
int day250 = agr/bgr;
System.out.println (day250 + " дней, если сбрасывать по 250 гр");
int day500 = agr/cgr;
System.out.println (day500 + " дней, если сбрасывать по 500 гр");
int dgr = (day250 + day500) / 2;
System.out.println (dgr + " день, если сбрасывать по среднему");

float MashaZp = 67760;
int DenZp = 83690;
int KrisZp = 76230;
float MashaZp2 = MashaZp/100-10;
System.out.println (MashaZp2 + " это 10% прибавка к месячной зп Маши");
float MashaZpGod = MashaZp2*12;
System.out.println (MashaZpGod + " годовая прибавка к зп Маши");
float pribM = MashaZp + MashaZpGod;
System.out.println("Маша теперь получает " + pribM + " рублей. Годовой доход вырос на " + MashaZpGod + " рублей");
float DenZp2 = DenZp/100-10;
System.out.println (DenZp2 + " это 10% прибавка к месячной зп Дениса");
float DenZpGod = DenZp2*12;
System.out.println (DenZpGod + " годовая прибавка к зп Дениса");
float pribD = DenZp + DenZpGod;
System.out.println("Денис теперь получает " + pribD + " рублей. Годовой доход вырос на " + DenZpGod + " рублей");
float KrisZp2 = KrisZp/100-10;
System.out.println (KrisZp2 + " это 10% прибавка к месячной зп Кристины");
float KrisZpGod = KrisZp2*12;
System.out.println (KrisZpGod + " годовая прибавка к зп Кристины");
float pribK = KrisZp + KrisZpGod;
System.out.println("Кристина теперь получает " + pribK + " рублей. Годовой доход вырос на " + KrisZpGod + " рублей");

int age = 18;
if (age >= 18) {
System.out.println("Если возраст человека равен 18 , то он совершеннолетний");
}
if (age < 18) {
System.out.println("Если возраст человека равен 18 , то он недостиг совершеннолетия, нужно немного подождать");
}

int t = 4;
if (t<5) {
System.out.println("На улице холодно, нужно надеть шапку");
}
if (t>=5) {
System.out.println("Сегодня тепло, можно идти без шапки");
}

int speed = 59;
if (speed>=60) {
    System.out.println("Если скорость, то придется заплатить штраф");
}
if (speed<60) {
    System.out.println("Если скорость, то можно ездить спокойно");
}




    }
}