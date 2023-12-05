package com.example.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsDemo {
 
  public static void main(String[] args) {
	
   List<Student> slist=Arrays.asList(new Student(11,"Paul","Economics", 78.9),
                              new Student(12,"Zevin","Computer Science",91.2),
                              new Student(13,"Harish","History", 83.7),
                              new Student(14,"Xiano" ,"Literature", 71.5),
                              new Student(15,"Soumya","Economics", 77.5),
                              new Student(16,"Asif","Mathematics", 89.4),
                              new Student(17,"Nihira","Computer Science", 84.6));
  
   System.out.println("Stream operations using Collectors class methods");
   System.out.println("==============================================================================================");
  
   System.out.println("Count number of student from list");
   long nostudents=slist.stream().collect(Collectors.counting()); //collect->tm
   //Collectors.counting()-> return number of students from list
   System.out.println("number of students from list:"+""+nostudents);

   System.out.println("Find maximum percentage of student");
   System.out.println("==============================================================================================");
   Optional<Double> maxPer=slist.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));
   System.out.println("maximum percentage from list:"+""+maxPer.get());
  
   System.out.println("Find minimum percentage of student");
   System.out.println("==============================================================================================");
   Optional<Double> minPer=slist.stream().map(Student::getPercentage).collect(Collectors.minBy(Comparator.naturalOrder()));
   System.out.println("minimum percentage from list:"+""+minPer.get());
  
   System.out.println("Sum of all student percentage"); //71.5
   System.out.println("==============================================================================================");
   //returns a Collector which collects sum of all input elements.
   //summingDouble takes map as argument
   double sumOfPer=slist.stream().collect(Collectors.summingDouble(Student::getPercentage));
   System.out.println("Sum of all student percentage is:"+""+sumOfPer); //576.8
  
   System.out.println("Find average percentage ");
   System.out.println("==============================================================================================");
   Double avgPer=slist.stream().collect(Collectors.averagingDouble(Student::getPercentage));
   System.out.println("average percentage is:"+""+avgPer); //82.39999999999999
  
   //methods return a special class called Int/Long/ DoubleSummaryStatistics which contain statistical information like sum, max, min, average etc of input elements.
   DoubleSummaryStatistics studentStats = slist.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
   
   System.out.println("Highest Percentage from list : "+studentStats.getMax());
            
   System.out.println("Lowest Percentage from list :: "+studentStats.getMin());
            
   System.out.println("Average Percentage from list : : "+studentStats.getAverage());
   
   System.out.println("==============================================================================================");

   System.out.println("Collectors.groupingBy()");  //return map
   //method groups the input elements according supplied classifier and returns the results in a Map.
   //Grouping the students by subject

   Map<String,List<Student>> studentMap=slist.stream().collect(Collectors.groupingBy(Student::getSubject)); 
   System.out.println("group of students by subject"+""+studentMap);
 
   //{Economics=[Student [id=11, name=Paul, subject=Economics, percentage=78.9], Student [id=15, name=Soumya, subject=Economics, percentage=77.5]], Literature=[Student [id=14, name=Xiano, subject=Literature, percentage=71.5]], Computer Science=[Student [id=12, name=Zevin, subject=Computer Science, percentage=91.2], Student [id=17, name=Nihira, subject=Computer Science, percentage=84.6]], Mathematics=[Student [id=16, name=Asif, subject=Mathematics, percentage=89.4]], History=[Student [id=13, name=Harish, subject=History, percentage=83.7]]}

  }
}
