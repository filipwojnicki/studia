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

void showDistanceToGround(int tower, int i) {
  double distanceFallen = tower - distance(i);
  showDistance(distanceFallen, i);
  i++;
  if(distanceFallen > 0) {
    showDistanceToGround(tower, i);
  }
}

int main() {
  int tower;
  int i = 0;
  cout << "Wpisz wysokość wiezy w metrach: ";
  cin >> tower;

  showDistanceToGround(tower, i);
  cout << "Piłka spadła na ziemie.";
}
