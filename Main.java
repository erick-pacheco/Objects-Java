
class Main {
  public static void main(String[] args) {
    /* Java let's use classes in the sale folder without needing to import !! */
    WaterBottle bottleOne = new WaterBottle();
    WaterBottle bottleTwo = new WaterBottle();

    /*
     * Bottle One: Water level: 100, Drank a mouthful, Water level: 90
     */
    bottleOne.check(); /* int 100 */
    bottleOne.drink(); /* String "Drank a mouthful" */
    bottleOne.check(); /* int 90 */

    /*
     * Bottle Two: Drank a mouthful, Drank a mouthful, Water level: 80
     */
    bottleTwo.drink();
    bottleTwo.drink();
    bottleTwo.check();
  }
}