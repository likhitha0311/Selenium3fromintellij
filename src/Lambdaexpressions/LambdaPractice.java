package Lambdaexpressions;

public class LambdaPractice
{
    public static void main(String[] args)
    {
       Lane lane = new Lane(){

           @Override
           public String buildRoad()
           {
               System.out.println("Build cement road");
               return "road";
           }
       } ;

        Lane lane1 =()-> "Build cement road";
        doLaneStuff(lane1,200,30);
    }

   public  static void doLaneStuff(Lane lane, int width, int height)
   {
       System.out.println(lane.buildRoad() + "width is " + width+" Height is "+height);
   }



}


@FunctionalInterface
interface Lane
{
   String buildRoad();
}