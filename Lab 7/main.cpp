#include <iostream>
#include "BankAccount.h"
#include "CheckingAccount.h"
#include"SavingsAccount.h"

#include <string>

using namespace std;

int main() {
    BankAccount*b;
    BankAccount* a;
    BankAccount starter("Stella",0.0);
    BankAccount advanced("Addy", 500.0);

    b = &starter;
    a = &advanced;
    starter.toString();
    advanced.toString();

    starter.deposit(1000.0);
    cout <<"Starter balance after adding $1000: ";
    cout <<starter.getBalance() << endl;

    advanced.withdraw(100.0);
    cout <<"Advanced balance after withdrawing $100: ";
    cout <<advanced.getBalance() << endl;

    cout<<"Both balances after transferring $200 from advanced to starter: "<<endl;
    if (advanced.transfer(b,200.0) == true)
    {
        cout <<"Starter balance: "<<starter.getBalance() << endl;
        cout <<"Advanced balance: "<<advanced.getBalance() << endl;
    }
    else
    {
        cout<<"Insufficient funds."<<endl;
    }


    CheckingAccount* c;
    SavingsAccount* s;
    SavingsAccount save ("Steve", 0.0, 0.01);
    CheckingAccount check ("Chelsea", 500.0);
    c = &check;
    s = &save;
    save.toString();
    check.toString();

    save.deposit(1000);
    cout <<"Save balance after depositing $1000: ";
    cout <<save.getBalance() << endl;

    check.withdraw(100);
    cout <<"Check balance after withdrawing $100: ";
    cout <<check.getBalance() << endl;

    cout<<"Both balances after transferring $200 from save to check: "<<endl;
    if (save.transfer(c,200.0) == true)
    {
        cout <<"Save Balance: "<<save.getBalance() << endl;
        cout <<"Check Balance: "<<check.getBalance() << endl;
    }
    else
    {
        cout<<"Insufficient funds."<<endl;
    }

    save.addInterest();
    cout <<"Save balance after adding interest: ";
    cout <<save.getBalance() << endl;

    check.deductFees();
    cout <<"Check balance after deducting fees: ";
    cout <<check.getBalance() << endl;


}