import java.util.Scanner;
import java.time.Month;
import java.time.LocalDate;
class Zodiac{ 
  public static String calculateSign (LocalDate date) {
    Month month = date.getMonth();
    int day = date.getDayOfMonth();
    if (month.equals(Month.MARCH) && day >= 21) {
      return "Aries"; 
    } else if (month.equals(Month.APRIL) && day <= 19) {
      return "Aries";
    } else if(month.equals(Month.APRIL)&& day >= 20) {
      return "Taurus";
    } else if(month.equals(Month.MAY) && day <= 20) {
      return "Taurus";
    } else if( month.equals(Month.MAY)&& day >= 21) {
      return "Gemini";
    } else if(month.equals(Month.JUNE)&& day <= 20) {
      return "Gemini"; 
    } else if(month.equals(Month.JUNE)&& day >= 21) {
      return "Cancer";
    } else if(month.equals(Month.JULY)&& day <= 22) {
       return "Cancer";
    } else if(month.equals(Month.JULY)&& day >= 23) {
       return "Leo";
    } else if(month.equals(Month.AUGUST) && day <=22) {
       return "Leo";
    } else if(month.equals(Month.AUGUST)&& day >= 23) {
       return "Virgo"; 
    } else if(month.equals(Month.SEPTEMBER) && day <= 22) {
       return "Virgo";
    } else if(month.equals(Month.SEPTEMBER) && day >= 23) {
       return "Libra";
    } else if (month.equals(Month.OCTOBER) && day <=22){
       return "Libra";
    } else if(month.equals(Month.OCTOBER)&& day >= 23){
       return "Scorpio";
    } else if(month.equals(Month.NOVEMBER) && day <= 21){
       return "Scorpio";
    } else if(month.equals(Month.NOVEMBER)  && day >= 22){
       return "Sagittarius"; 
    } else if(month.equals(Month.DECEMBER) && day <= 21){
       return "Sagittarius";
    } else if(month.equals(Month.DECEMBER)&& day >= 22) {
       return "Capricorn";
    } else if(month.equals(Month.JANUARY) && day <= 19){
       return "Capricorn";
    } else if (month.equals(Month.JANUARY)&& day >= 20) {
       return "Aquarius";
    } else if(month.equals(Month.FEBRUARY) && day <= 18) {
       return "Aquarius";
    } else if(month.equals(Month.FEBRUARY)&& day >= 19){
       return "Pisces";
    } else if(month.equals(Month.MARCH)&& day <= 20) {
       return "Pisces";
    }
     return "";
  }
}


