//
// Created by super on 11/20/2018.
//

#include<cstring>
#include "BankAccount.h"
#include "CheckingAccount.h"
#include <string>

using namespace std;

BankAccount:: BankAccount()
{
    this->name = "";
    this->balance = 0.0;
}

BankAccount::BankAccount(string n, double b)
{
    this->name = n;
    this->balance = b;
}

string BankAccount::getName()
{
    return this->name;
}

double BankAccount::getBalance()
{
    return this->balance;
}

void BankAccount::deposit(double a)
{
    balance += a;
}

void BankAccount::withdraw(double a)
{
    balance -= a;
}

void BankAccount::toString()
{
    cout<<"Name: ";
    cout<<this->getName()<<endl;
    cout<<"Balance: ";
    cout<<this->getBalance()<<endl;
}

