#include <stdio.h>

int ask_in_range(min,max)
{
    int num;
    scanf("%d", &num);
    while (num<min || num > max)
    {
        printf("Your number is outside of [%d, %d]range.  Please enter a number: ",min, max);
        scanf("%d", &num);
    }
    return num;
}

int guessing_game(num, rangemin, rangemax)
{
    printf("Hello and welcome to the game.\nYou need to guess a number between %d and %d.\nPlease guess a number: ", rangemin, rangemax);
    int guess = ask_in_range(rangemin, rangemax);
    int numGuess = 1;
    while (guess != num)
    {
        if (guess > num)
        {
            printf("Too high!\nPlease enter a number: ");
            scanf("%d", &guess);
            numGuess ++;
        }
        else if (guess < num)
        {
            printf("Too low!\nPlease enter a number: ");
            scanf("%d", &guess);
            numGuess++;
        }
    }
    printf("Good job! You took %d guesses.",numGuess);
    return numGuess;
}

int main() {
    guessing_game(49,-100,100);
    return 0;
}
