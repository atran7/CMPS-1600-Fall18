//
// Created by super on 11/20/2018.
//

#include "BankAccount.h"
#include "SavingsAccount.h"

#include <stdio.h>
#include <string>

using namespace std;

SavingsAccount::SavingsAccount(string n, double b, double i)
{
    this->name = n;
    this->balance = b;
    this->interest = i;
}

void SavingsAccount::addInterest()
{
    balance += balance*interest;
}

