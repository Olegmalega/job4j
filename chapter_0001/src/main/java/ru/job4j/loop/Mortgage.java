package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;

            double x = amount;
        do {
            x = (x + (x * percent / 100) - salary);
            year++;
        } while (x > 0);

        return year;
    }
}
     //   double x = amount + (amount * percent / 100) - salary;
       //do {
         //  x = (x + (x * percent / 100) - salary);
           //year++;
     //  } while (x > 0);
     //  {
    //        year++;
    //    }
    //    return year;
 //   }

//}
// double x = 0;
//double x = amount + (amount * percent / 100) - salary;
// while (amount>salary){
//        x = x + (x * percent /100 ) - salary;
//     year++;
// if amount < salary
//double x =  amount > 0 ? year++ : (year=0);
// year++;
