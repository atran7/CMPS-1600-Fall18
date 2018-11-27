//
// Created by super on 11/20/2018.
//

#ifndef LAB7_BANKACCOUNT_H
#define LAB7_BANKACCOUNT_H

#include<stdio.h>

#include <string>

using namespace std;


class BankAccount
{
public:
    BankAccount();
    BankAccount(string name, double b);

    string getName();
    double getBalance();

    virtual void deposit (double a);
    virtual void withdraw(double a);

    void toString();

protected:
    string name;
    double balance;

};


#endif //LAB7_BANKACCOUNT_H
