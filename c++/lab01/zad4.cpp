#include <iostream>
using namespace std;

double distance(int seconds) {
  double gravity = 9.8;

  double fallen = (gravity * seconds) / 2;

  return fallen;
}

void showDistance(double distance, int seconds) {
  if(distance > 0) {
    cout << "W " << seconds << " sekundzie piłka jest na wyokości: " << distance << " metrow." << endl;
  }
}

void showDistanceToGround(int tower, int seconds) {
  double distanceFallen = tower - distance(seconds);
  showDistance(distanceFallen, seconds);
  
  if(distanceFallen > 0) {
    seconds++;
    showDistanceToGround(tower, seconds);
  } else {
    cout << "W " << seconds << " piłka spadła na ziemie.";
  }
}

int main() {
  int tower;
  int seconds = 0;
  cout << "Wpisz wysokość wiezy w metrach: ";
  cin >> tower;

  showDistanceToGround(tower, seconds);
}
