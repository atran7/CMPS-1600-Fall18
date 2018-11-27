#include <iostream>
#include "BankAccount.h"
#include "CheckingAccount.h"
#include"SavingsAccount.h"

#include <string>

using namespace std;

int main() {
    BankAccount starter("Stella",0.0);
    BankAccount advanced("Addy", 500.0);
    starter.toString();
    advanced.toString();

    starter.deposit(1000.0);
    cout <<"Starter balance after adding $1000: ";
    cout <<starter.getBalance() << endl;

    advanced.withdraw(100.0);
    cout <<"Advanced balance after withdrawing $100: ";
    cout <<advanced.getBalance() << endl;

    advanced.withdraw(200.0);
    starter.deposit(200.0);
    cout<<"Both balances after transferring $200 from advanced to starter: "<<endl;
    cout <<starter.getBalance() << endl;
    cout <<advanced.getBalance() << endl;

    SavingsAccount save ("Steve", 0.0, 0.01);
    CheckingAccount check ("Chelsea", 500.0);
    save.toString();
    check.toString();

    save.deposit(1000);
    cout <<"Save balance after depositing $1000: ";
    cout <<save.getBalance() << endl;

    check.withdraw(100);
    cout <<"Check balance after withdrawing $100: ";
    cout <<check.getBalance() << endl;

    save.withdraw(200.0);
    check.deposit(200.0);
    cout<<"Both balances after transferring $200 from save to check: "<<endl;
    cout <<save.getBalance() << endl;
    cout <<check.getBalance() << endl;

    save.addInterest();
    cout <<"Save balance after adding interest: ";
    cout <<save.getBalance() << endl;

    check.deductFees();
    cout <<"Check balance after deducting fees: ";
    cout <<check.getBalance() << endl;


}