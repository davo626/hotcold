package com.company;
import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.abs;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        /*
        int a=ran.nextInt(100);


        System.out.println(a);
        int b=sc. nextInt();
        int c;
        if (a==b){
            System.out.println("да");
        }else {
            System.out.println("нет");
            while (b != a) {
            c=sc. nextInt();
                if(abs(a-b)==abs(a-c)){
                    System.out.println("изменений нет");
                }
                if(abs(a-b)>abs(a-c)){
                    System.out.println("hot");
                }
                if(abs(a-b)<abs(a-c)){
                    System.out.println("cold");

                }
                b=c;
            }
        }
        System.out.println("победа");
*/
        System.out.println("загадайте число от 0 до 99");

        System.out.println("это число 50?");
        int an = sc.nextInt();  //0=холоднее 1=теплее 2=так же 3=да(число угадано 4=нет
        if (an == 4) {

            System.out.println("это число 49?");     //узнаем, число меньше 49 или больше 50
            an = sc.nextInt();
            if (an == 3) {
                System.out.println("число угадано");    //это 49
                System.exit(0);
            }
        } else {
            System.out.println("число угадано");         //это 50
            System.exit(0);
        }
        if (an == 3) {
            System.out.println("число угадано");
            System.exit(0);
        } else {
            if (an == 1) {                                       //меньше 49

                System.out.println("0?");
                an = sc.nextInt();
                if (an == 3) {
                    System.out.println("число угадано");
                    System.exit(0);
                }
                if (an == 1) {                  //от 1до 24
                    System.out.println("24?");
                    an = sc.nextInt();
                    if (an == 3) {
                        System.out.println("число угадано");    //24
                        System.exit(0);
                    }
                    if (an==2){
                        System.out.println("ваше число 12?");
                        an = sc.nextInt();
                        if (an == 3) {
                            System.out.println("число угадано");    //12
                            System.exit(0);
                        }else{
                            System.out.println("вы ошиблись");
                            System.exit(0);
                        }
                    }
                    if(an==1){
                        System.out.println("23?");
                        an=sc. nextInt();
                        if (an == 3) {
                            System.out.println("число угадано");    //23
                            System.exit(0);
                        }
                        if(an==1){
                            System.out.println("18?");
                            an=sc. nextInt();
                            if (an == 3) {
                                System.out.println("число угадано");    //18
                                System.exit(0);
                            }
                            if(an==1){
                                System.out.println("19?");
                                an=sc. nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");    //19
                                    System.exit(0);
                                }else{System.out.println("20?");
                                    an=sc. nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");    //20
                                        System.exit(0);
                                }else{
                                    System.out.println("вы ошиблись");
                                        System.exit(0);
                                    }

                                }
                            }else{System.out.println("21?");
                                an=sc. nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");    //21
                                    System.exit(0);
                                }else {
                                    System.out.println("22?");
                                    an = sc.nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");    //22
                                        System.exit(0);
                                    } else {
                                        System.out.println("вы ошиблись");
                                        System.exit(0);
                                    }
                                }

                            }
                        }else {
                            System.out.println("13?");
                            an = sc.nextInt();
                            if (an == 3) {
                                System.out.println("число угадано");    //13
                                System.exit(0);
                            }
                            System.out.println("16?");
                            an = sc.nextInt();
                            if (an == 3) {
                                System.out.println("число угадано");    //16
                                System.exit(0);
                            }
                            if (an == 1) {
                                System.out.println("15?");
                                an = sc.nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");    //15
                                    System.exit(0);
                                } else {
                                    System.out.println("17?");
                                    an = sc.nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");    //17
                                        System.exit(0);
                                    }
                                }
                            }else{
                                System.out.println("14?");
                                an = sc.nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");    //14
                                    System.exit(0);
                                }
                            }
                        }
                    }else{
                        System.out.println("1?");
                        an=sc. nextInt();
                        if (an == 3) {
                            System.out.println("число угадано");    //1
                            System.exit(0);
                        }
                        if(an==1){
                            System.out.println("6?");
                            an = sc.nextInt();
                            if (an == 3) {
                                System.out.println("число угадано");    //6
                                System.exit(0);
                            }
                            if(an==1){
                                System.out.println("5?");
                                an = sc.nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");    //5
                                    System.exit(0);
                                }else{
                                    System.out.println("4?");
                                    an = sc.nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");    //4
                                        System.exit(0);
                                    }
                                }
                            }else{
                                System.out.println("3?");
                                an = sc.nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");    //3
                                    System.exit(0);
                                }else{
                                    System.out.println("2?");
                                    an = sc.nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");    //2
                                        System.exit(0);
                                    }
                                }
                            }
                        }else{
                            System.out.println("11?");
                            an = sc.nextInt();
                            if (an == 3) {
                                System.out.println("число угадано");    //11
                                System.exit(0);
                            }
                            if(an==1){
                                System.out.println("10?");
                                an = sc.nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");    //10
                                    System.exit(0);
                                }else{
                                    System.out.println("9?");
                                    an = sc.nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");    //9
                                        System.exit(0);
                                    }
                                }
                            }else{
                                System.out.println("7?");
                                an = sc.nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");    //7
                                    System.exit(0);
                                }else{
                                    System.out.println("8?");
                                    an = sc.nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");    //8
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }

                } else {                            //от 25 до 48
                    System.out.println("48?");
                    an = sc.nextInt();
                    if (an == 3) {
                        System.out.println("число угадано");    //48
                        System.exit(0);
                    }
                    System.out.println("25?");
                    an = sc.nextInt();
                    if (an == 3) {
                        System.out.println("число угадано");       //25
                        System.exit(0);
                    }
                    if (an == 1) {
                        System.out.println("36?");
                        an = sc.nextInt();
                        if (an == 3) {
                            System.out.println("число угадано");       //36
                            System.exit(0);
                        }
                        if (an == 1){
                            System.out.println("31?");
                            an=sc. nextInt();
                            if (an == 3) {
                                System.out.println("число угадано");    //31
                                System.exit(0);
                            }
                            if(an==1){
                                System.out.println("32?");
                                an=sc. nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");    //32
                                    System.exit(0);
                                }else{
                                    System.out.println("33?");
                                    an=sc. nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");    //33
                                        System.exit(0);
                                    }
                                }
                            }else{
                                System.out.println("35?");
                                an=sc. nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");    //35
                                    System.exit(0);
                                }else{
                                    System.out.println("34?");
                                    an=sc. nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");    //34
                                        System.exit(0);
                                    }
                                }
                            }

                        }else{
                            System.out.println("26?");
                            an=sc. nextInt();
                            if (an == 3) {
                                System.out.println("число угадано");    //26
                                System.exit(0);
                            }
                            System.out.println("29?");
                            an=sc. nextInt();
                            if (an == 3) {
                                System.out.println("число угадано");    //29
                                System.exit(0);
                            }
                            if(an==1){
                                System.out.println("28?");
                                an=sc. nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");    //28
                                    System.exit(0);
                                }else{
                                    System.out.println("30?");
                                    an=sc. nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");    //30
                                        System.exit(0);
                                    }
                                }
                            }else{
                                System.out.println("27?");
                                an=sc. nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");    //27
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        System.out.println("47?");
                        an = sc.nextInt();
                        if (an == 3) {
                            System.out.println("число угадано");       //47
                            System.exit(0);
                        }
                        if (an == 1){
                            System.out.println("42?");
                            an = sc.nextInt();
                            if (an == 3) {
                                System.out.println("число угадано");       //42
                                System.exit(0);
                            }
                            if(an==1){
                                System.out.println("43?");
                                an = sc.nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");       //43
                                    System.exit(0);
                                }else{
                                    System.out.println("44?");
                                    an = sc.nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");       //44
                                        System.exit(0);
                                    }
                                }
                            }else{
                                System.out.println("46?");
                                an = sc.nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");       //46
                                    System.exit(0);
                                }else{
                                    System.out.println("45?");
                                    an = sc.nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");       //45
                                        System.exit(0);
                                    }
                                }
                            }
                        }else{
                            System.out.println("37?");
                            an = sc.nextInt();
                            if (an == 3) {
                                System.out.println("число угадано");       //37
                                System.exit(0);
                            }
                            System.out.println("40?");
                            an = sc.nextInt();
                            if (an == 3) {
                                System.out.println("число угадано");       //40
                                System.exit(0);
                            }
                            if(an==1){
                                System.out.println("41?");
                                an = sc.nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");       //41
                                    System.exit(0);
                                }else{
                                    System.out.println("39?");
                                    an = sc.nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");       //39
                                        System.exit(0);
                                    }
                                }
                            }else{
                                System.out.println("38?");
                                an = sc.nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");       //38
                                    System.exit(0);
                                }
                            }
                        }
                    }
                }
            }else {

                            System.out.println("99?");       //если 1, то от 75до 98 если 0, то от 51 до 73 если 2, то 74
                            an = sc.nextInt();
                if (an == 3) {
                    System.out.println("число угадано");         //99
                    System.exit(0);
                }
                            if (an == 2) {
                                System.out.println("ваше число 74?");
                                an = sc.nextInt();
                                if (an == 3) {
                                    System.out.println("число угадано");         //74
                                    System.exit(0);
                                } else {
                                    System.out.println("вы где то ошиблись, начните заново");
                                    System.exit(0);
                                }
                            } else {
                                if (an == 1) {
                                    System.out.println("75?");
                                    an=sc.nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");        //75
                                        System.exit(0);
                                    }
                                    if(an==2) {
                                        System.out.println("87?");
                                        an = sc.nextInt();
                                        if (an == 3) {
                                            System.out.println("число угадано");        //87
                                            System.exit(0);
                                        }else{
                                            System.out.println("вы где то ошиблись, начните заново");
                                            System.exit(0);
                                        }
                                    }
                                    if (an == 1) {
                                        System.out.println("76?");
                                        an = sc.nextInt();
                                        if (an == 3) {
                                            System.out.println("число угадано");        //76
                                            System.exit(0);
                                        }
                                        if(an==1) {
                                            System.out.println("81?");
                                            an = sc.nextInt();
                                            if (an == 3) {
                                                System.out.println("число угадано");        //81
                                                System.exit(0);
                                            }
                                            if (an == 1) {
                                                System.out.println("80?");
                                                an = sc.nextInt();
                                                if (an == 3) {
                                                    System.out.println("число угадано");        //80
                                                    System.exit(0);
                                                } else {

                                                    System.out.println("79?");
                                                    an = sc.nextInt();
                                                    if (an == 3) {
                                                        System.out.println("число угадано");        //79
                                                        System.exit(0);
                                                    }
                                                }
                                            }else{
                                                System.out.println("77?");
                                                an = sc.nextInt();
                                                if (an == 3) {
                                                    System.out.println("число угадано");        //77
                                                    System.exit(0);
                                                } else {

                                                    System.out.println("76?");
                                                    an = sc.nextInt();
                                                    if (an == 3) {
                                                        System.out.println("число угадано");        //76
                                                        System.exit(0);
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("86?");
                                            an = sc.nextInt();
                                            if (an == 3) {
                                                System.out.println("число угадано");        //86
                                                System.exit(0);
                                            }
                                            System.out.println("83?");
                                            an = sc.nextInt();
                                            if (an == 3) {
                                                System.out.println("число угадано");        //83
                                                System.exit(0);
                                            }
                                            if(an==1) {
                                                System.out.println("82?");
                                                an = sc.nextInt();
                                                if (an == 3) {
                                                    System.out.println("число угадано");        //82
                                                    System.exit(0);
                                                } else {
                                                    System.out.println("84?");
                                                    an = sc.nextInt();
                                                    if (an == 3) {
                                                        System.out.println("число угадано");        //84
                                                        System.exit(0);
                                                    }
                                                }
                                            }else{
                                                System.out.println("85?");
                                                an = sc.nextInt();
                                                if (an == 3) {
                                                    System.out.println("число угадано");        //85
                                                    System.exit(0);
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("98?");
                                        an = sc.nextInt();
                                        if (an == 3) {
                                            System.out.println("число угадано");        //98
                                            System.exit(0);
                                        }
                                        if(an==1){
                                            System.out.println("93?");
                                            an = sc.nextInt();
                                            if (an == 3) {
                                                System.out.println("число угадано");        //93
                                                System.exit(0);
                                            }
                                            if(an==1){
                                                System.out.println("94?");
                                                an = sc.nextInt();
                                                if (an == 3) {
                                                    System.out.println("число угадано");        //94
                                                    System.exit(0);
                                                }else{
                                                    System.out.println("95?");
                                                    an = sc.nextInt();
                                                    if (an == 3) {
                                                        System.out.println("число угадано");        //95
                                                        System.exit(0);
                                                    }
                                                }
                                            }else{
                                                System.out.println("97?");
                                                an = sc.nextInt();
                                                if (an == 3) {
                                                    System.out.println("число угадано");        //97
                                                    System.exit(0);
                                                }else{
                                                    System.out.println("96?");
                                                    an = sc.nextInt();
                                                    if (an == 3) {
                                                        System.out.println("число угадано");        //96
                                                        System.exit(0);
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("88?");
                                            an = sc.nextInt();
                                            if (an == 3) {
                                                System.out.println("число угадано");        //88
                                                System.exit(0);
                                            }
                                            System.out.println("90?");
                                            an = sc.nextInt();
                                            if (an == 3) {
                                                System.out.println("число угадано");        //90
                                                System.exit(0);
                                            }
                                            if(an==1){
                                                System.out.println("91?");
                                                an = sc.nextInt();
                                                if (an == 3) {
                                                    System.out.println("число угадано");        //91
                                                    System.exit(0);
                                                }else{
                                                    System.out.println("92?");
                                                    an = sc.nextInt();
                                                    if (an == 3) {
                                                        System.out.println("число угадано");        //92
                                                        System.exit(0);
                                                    }
                                                }
                                            }else{
                                                System.out.println("89?");
                                                an = sc.nextInt();
                                                if (an == 3) {
                                                    System.out.println("число угадано");        //89
                                                    System.exit(0);
                                                }
                                            }
                                    }
                                } else {
                                    System.out.println("51?");
                                    an= sc. nextInt();
                                    if (an == 3) {
                                        System.out.println("число угадано");        //51
                                        System.exit(0);
                                    }
                                    if(an==1){//System.out.println("52-62");
                                        System.out.println("62?");
                                        an = sc.nextInt();
                                        if (an == 3) {
                                            System.out.println("число угадано");        //62
                                            System.exit(0);
                                        }
                                        if(an==1){
                                            System.out.println("57?");
                                            an = sc.nextInt();
                                            if (an == 3) {
                                                System.out.println("число угадано");        //57
                                                System.exit(0);
                                            }
                                            if(an==1)
                                        }else{
                                            System.out.println("52-56");
                                        }
                                    } else{ //System.out.println("63-73");
                                        System.out.println("73?");
                                        an = sc.nextInt();
                                        if (an == 3) {
                                            System.out.println("число угадано");        //73
                                            System.exit(0);
                                        }
                                        System.out.println("63?");
                                        an = sc.nextInt();
                                        if (an == 3) {
                                            System.out.println("число угадано");        //63
                                            System.exit(0);
                                        }
                                        if(an==2){
                                            System.out.println("68?");
                                            an = sc.nextInt();
                                            if (an == 3) {
                                                System.out.println("число угадано");        //68
                                                System.exit(0);
                                            }else{
                                                System.out.println("вы где то ошиблись, начните заново");
                                                System.exit(0);
                                            }
                                        }
                                        if(an==1){
                                            System.out.println("64-67");
                                        }else{
                                            System.out.println("69-72");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }



