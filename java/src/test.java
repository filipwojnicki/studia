public class test {
  public static void main(String[] args) {
    int[] ramka = {2, -5, 8, 15, 2, 4};
    System.out.println(getMaxValue(ramka) - getMinValue(ramka));
  }

  public static int getMaxValue(int[] numbers){
    int maxValue = numbers[0];
    for(int i=1;i < numbers.length;i++){
      if(numbers[i] > maxValue){
        maxValue = numbers[i];
      }
    }
    return maxValue;
  }

  public static int getMinValue(int[] numbers){
    int minValue = numbers[0];
    for(int i=1;i<numbers.length;i++){
      if(numbers[i] < minValue){
        minValue = numbers[i];
      }
    }
    return minValue;
  }
}
