package default_;
import personel.*;

import java.time.Period;

public class Main {
  public static boolean isAWeekDay(String day) {
    if(day.matches("mon|tue|wed|thu|fri|sat|sun")) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean allVowels(String str) {
    if(str.matches("(a|o|e|i|u)+")) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean clockTime(String time) {
    if(time.matches("(((0|1)[0-9])|(2[0-3])):[0-5][0-9]:[0-5][0-9]")) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String args[]) {
    Person p1 = new Person("Pekka", Education.M);
    Employees employees = new Employees();

    employees.add(p1);
    employees.print();

  }
}