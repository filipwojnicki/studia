#include <string>
#include <iostream>

using namespace std;

class KontoBankowe {
  public:
    void setDepozytariusz(string depozytariusz);
    void setNumerKonta(string numerKonta);
    void setSaldo(float saldo);
    void wplata(float wplataSaldo);
    void wyplata(float wyplataSaldo);
    string getData();
    KontoBankowe(string depozytariusz = "", string numerKonta = "", float saldo = 0.0);
    static int count;
    
  private:
    string depozytariusz;
    string numerKonta;
    float saldo;
};

KontoBankowe::KontoBankowe(string depozytariusz, string numerKonta, float saldo) {
  this->depozytariusz = depozytariusz;
  this->numerKonta = numerKonta;
  this->saldo = saldo;
  this->count += 1;
}

int KontoBankowe::count = 0;

void KontoBankowe::setDepozytariusz(string depozytariusz) {
  this->depozytariusz = depozytariusz;
}

void KontoBankowe::setNumerKonta(string numerKonta) {
  this->numerKonta = numerKonta;
}

void KontoBankowe::setSaldo(float saldo) {
  this->saldo = saldo;
}

void KontoBankowe::wplata(float wplataSaldo) {
  this->saldo += wplataSaldo;
}

void KontoBankowe::wyplata(float wyplataSaldo) {
  if(this->saldo - wyplataSaldo < 0) {
    cout << "Wypłata " << to_string(wyplataSaldo) << " nie mozliwa" << endl;
    return;
  }

  this->saldo -= wyplataSaldo;
}

string KontoBankowe::getData() {
  return this->depozytariusz + " " + this->numerKonta + " " + to_string(this->saldo);
}

int main() {
  KontoBankowe konto("Jan", "9887765", 100.10);

  KontoBankowe* konta[3];
  konta[0] = &konto;
  konta[1] = new KontoBankowe("Piotr", "23545453", 21.54);
  konta[2] = new KontoBankowe("Andrzej", "345454", 56.67);

  konta[1]->wyplata(2.34);

  cout << konta[0]->getData() << endl;
  cout << konta[1]->getData() << endl;
  cout << konta[2]->getData() << endl;

  konto.setDepozytariusz("Filip");
  konto.setNumerKonta("123456789");
  konto.setSaldo(12.12);
  konto.wplata(13.02);
  konto.wyplata(26.02);
  cout << konto.getData() << endl;

  cout << "Liczba: " << KontoBankowe::count << endl;

  return( 0 );
}